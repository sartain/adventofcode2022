import advent.Advent01;
import advent.AdventRunner;
import helper.MyFileReader;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Advent01 advent = new Advent01(AdventRunner.LIVE);
        advent.partOne();
    }

}
