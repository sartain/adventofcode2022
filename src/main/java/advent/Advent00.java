package advent;

import helper.MyFileReader;

import java.util.stream.Stream;

public class Advent00 {

    public Stream<String> readFile(String className, AdventRunner value) {
        switch(value) {
            case TEST:
                return MyFileReader.fileToStringStream("Test" + className);
            case LIVE:
                return MyFileReader.fileToStringStream(className);
            default:
                break;
        }
        return null;
    }

}
