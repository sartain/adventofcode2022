import helper.MyFileReader;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReadFileTest {

    @Test
    void testReadStringFile() {
        try {
            String[] fileOutput = MyFileReader.fileToStringArray("testInput");
            assertArrayEquals(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, fileOutput);
        }
        catch(Exception e) {
            fail();
        }

    }

    @Test
    void testReadIntFile() {
        try {
            Integer[] fileOutput = MyFileReader.fileToIntArray("testInput");
            assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, fileOutput);
        }
        catch(Exception e) {
            fail();
        }
    }

}
