package advent.advent4;

public class Camp {

    public CampSection getSectionOne() {
        return sectionOne;
    }

    public void setSectionOne(CampSection sectionOne) {
        this.sectionOne = sectionOne;
    }

    private CampSection sectionOne;

    public CampSection getSectionTwo() {
        return sectionTwo;
    }

    public void setSectionTwo(CampSection sectionTwo) {
        this.sectionTwo = sectionTwo;
    }

    private CampSection sectionTwo;

    public Camp(String input) {
        String[] splitString = input.split(",");
        this.sectionOne = new CampSection(splitString[0]);
        this.sectionTwo = new CampSection(splitString[1]);
    }

    public boolean getFullyContains() {
        //2-4 1-6
        //Lower range has to be above next lower range
        //Upper range has to be below next upper range
        return fullyContains(sectionOne, sectionTwo) || fullyContains(sectionTwo, sectionOne);
    }

    private boolean fullyContains(CampSection sectionA, CampSection sectionB) {
        return sectionA.getLowerRange() >= sectionB.getLowerRange() && sectionA.getUpperRange() <= sectionB.getUpperRange();
    }

    public boolean getOverlaps() {
        //If one overlaps return true
        return !(doesNotOverlap(sectionOne, sectionTwo) || doesNotOverlap(sectionTwo, sectionOne));
    }

    public boolean doesNotOverlap(CampSection sectionA, CampSection sectionB) {
        return sectionA.getLowerRange() > sectionB.getUpperRange() || sectionA.getUpperRange() < sectionB.getLowerRange();
    }

}
