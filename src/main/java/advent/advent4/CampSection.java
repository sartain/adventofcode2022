package advent.advent4;

public class CampSection {

    public int getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(int lowerRange) {
        this.lowerRange = lowerRange;
    }

    public int getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(int upperRange) {
        this.upperRange = upperRange;
    }

    private int lowerRange;
    private int upperRange;

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
