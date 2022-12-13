package advent;

import helper.MyFileReader;

import java.util.stream.Stream;

public class Advent00 implements Advent{

    protected AdventRunner adventRunner;
    protected Stream<String> fileLines;
    private final String className;

    public Advent00(AdventRunner value, String className) {
        this.adventRunner = value;
        this.className = className;
        this.readFile();
    }

    public void readFile() {
        switch(this.adventRunner) {
            case TEST:
                fileLines = MyFileReader.fileToStringStream("Test" + className);
                break;
            case LIVE:
                fileLines = MyFileReader.fileToStringStream(className);
                break;
            default:
                break;
        }
    }

    @Override
    public String partOne() {
        return "This is the example for part one";
    }

    @Override
    public String partTwo() {
        return "This is the example for part two";
    }
}
