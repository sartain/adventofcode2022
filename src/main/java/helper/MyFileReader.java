package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class MyFileReader {

    public static Stream<String> fileToStringStream(String fileName) {
        String pathName = "src/input/" + fileName + ".txt";
        File file = new File(pathName);
        try {
            BufferedReader br = new BufferedReader( new FileReader(file) );
            return br.lines();
        }
        catch(FileNotFoundException e) {
            System.out.println("file not found");
        }
        catch(Exception e) {
            System.out.println("Another error");
        }
        return null;
    }

    public static Stream<Integer> fileToIntegerStream(String fileName) {
        String pathName = "src/input/" + fileName + ".txt";
        File file = new File(pathName);
        try {
            BufferedReader br = new BufferedReader( new FileReader(file) );
            return br.lines().map(Integer::valueOf);
        }
        catch(FileNotFoundException e) {
            System.out.println("file not found");
        }
        catch(Exception e) {
            System.out.println("Another error");
        }
        return null;
    }

}
