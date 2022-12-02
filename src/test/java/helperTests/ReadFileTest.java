package helperTests;

import helper.MyFileReader;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ReadFileTest {

    @Test
    void testReadStringFile() {
        try {
            Stream<String> fileOutput = MyFileReader.fileToStringStream("testInput");
            assert fileOutput != null;
            assertArrayEquals(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, fileOutput.toArray());
        }
        catch(Exception e) {
            fail();
        }

    }

    @Test
    void testReadIntFile() {
        try {
            Stream<Integer> fileOutput = MyFileReader.fileToIntegerStream("testInput");
            assert fileOutput != null;
            assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, fileOutput.toArray());
        }
        catch(Exception e) {
            fail();
        }
    }

}
