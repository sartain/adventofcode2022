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

}
