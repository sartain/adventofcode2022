import advent.Advent;
import advent.advent1.Advent01;
import advent.AdventRunner;
import advent.advent2.Advent02;
import advent.advent3.Advent03;
import advent.advent4.Advent04;

import java.io.FileNotFoundException;

public class Main {

    private static final Advent[] advents = {
            new Advent01(AdventRunner.LIVE),
            new Advent02(AdventRunner.LIVE),
            new Advent03(AdventRunner.LIVE),
            new Advent04(AdventRunner.LIVE)
    };

    public static void main(String[] args) throws FileNotFoundException {
        for(Advent advent : advents) {
            System.out.println(
                    advent.getClass().getName() +
                    " Part One = " +
                    advent.partOne());
            System.out.println(
                    advent.getClass().getName() +
                    " Part Two = " +
                    advent.partTwo());
        }
    }



}
