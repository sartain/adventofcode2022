import advent.Advent;
import advent.advent1.Advent01;
import advent.AdventRunner;
import advent.advent2.Advent02;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Advent advent = new Advent01(AdventRunner.LIVE);
        System.out.println(advent.partOne());
        advent = new Advent01(AdventRunner.LIVE);
        System.out.println(advent.partTwo());
        advent = new Advent02(AdventRunner.LIVE);
        System.out.println(advent.partOne());
        advent = new Advent02(AdventRunner.LIVE);
        System.out.println(advent.partTwo());
    }

}
