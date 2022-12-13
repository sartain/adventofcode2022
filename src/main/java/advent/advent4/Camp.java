package advent.advent4;

public class Camp {

    private final CampSection sectionOne;
    private final CampSection sectionTwo;

    public Camp(String input) {
        String[] splitString = input.split(",");
        this.sectionOne = new CampSection(splitString[0]);
        this.sectionTwo = new CampSection(splitString[1]);
    }

    public CampSection getSectionOne() {
        return sectionOne;
    }

    public CampSection getSectionTwo() {
        return sectionTwo;
    }

    public boolean getFullyContains() {
        return fullyContains(sectionOne, sectionTwo) || fullyContains(sectionTwo, sectionOne);
    }

    private boolean fullyContains(CampSection sectionA, CampSection sectionB) {
        return sectionA.getLowerRange() >= sectionB.getLowerRange() && sectionA.getUpperRange() <= sectionB.getUpperRange();
    }

    public boolean getOverlaps() {
        return !(doesNotOverlap(sectionOne, sectionTwo) || doesNotOverlap(sectionTwo, sectionOne));
    }

    public boolean doesNotOverlap(CampSection sectionA, CampSection sectionB) {
        return sectionA.getLowerRange() > sectionB.getUpperRange() || sectionA.getUpperRange() < sectionB.getLowerRange();
    }

}
