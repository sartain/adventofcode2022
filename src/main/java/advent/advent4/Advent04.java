package advent.advent4;

import advent.Advent;
import advent.Advent00;
import advent.AdventRunner;

public class Advent04 extends Advent00 implements Advent {

    public Advent04(AdventRunner value) {
        super(value, "Advent04");
    }

    @Override
    public String partOne() {
        return String.valueOf(getSumOfFullyContains());
    }

    @Override
    public String partTwo() {
        return null;
    }

    public Camp getCampFromString(String input) {
        return new Camp(input);
    }

    public boolean checkFullyContainFromString(String input) {
        return getCampFromString(input).getFullyContains();
    }

    public boolean checkOverlaps(String input) {
        return getCampFromString(input).getOverlaps();
    }

    public int getSumOfFullyContains() {
        return (int) fileLines.map(this::checkFullyContainFromString).filter(e -> e).count();
    }

}
