import helper.MyFileReader;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(MyFileReader.fileToStringArray("testInput")[0]);
    }

}
