package advent.advent4;

public class CampSection {

    private final int lowerRange;
    private final int upperRange;

    public int getLowerRange() {
        return lowerRange;
    }

    public int getUpperRange() {
        return upperRange;
    }

    public CampSection(String input) {
        String[] splitString = input.split("-");
        this.lowerRange = Integer.parseInt(splitString[0]);
        this.upperRange = Integer.parseInt(splitString[1]);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof CampSection)) {
            return false;
        }
        CampSection myCampSection = (CampSection) o;
        return (myCampSection.lowerRange == this.lowerRange) && (myCampSection.upperRange == this.upperRange);
    }

}
