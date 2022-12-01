package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyFileReader {

    public static String[] fileToStringArray(String fileName) {
        String pathName = "src/input/" + fileName + ".txt";
        File file = new File(pathName);
        try {
            BufferedReader br = new BufferedReader( new FileReader(file) );
            return br.lines().toArray(String[]::new);
        }
        catch(FileNotFoundException e) {
            return new String[] {"file not found"};
        }
        catch(Exception e) {
            return new String[] {"another error"};
        }
    }

    public static Integer[] fileToIntArray(String fileName) {
        String pathName = "src/input/" + fileName + ".txt";
        File file = new File(pathName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            return br.lines().map(Integer::valueOf).toArray(Integer[]::new);
        } catch (FileNotFoundException e) {
            return new Integer[]{0};
        } catch (Exception e) {
            return new Integer[]{1};
        }

    }

}
