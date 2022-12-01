package adventTests;

import advent.Advent01;
import advent.AdventRunner;
import helper.MyFileReader;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent01Test {

    @Test
    void testSplitElfValueIntoTotal() {
        Integer[] expectedTotals = {100, 110, 120};
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Integer[] actualTotals = advent.splitElfCalories();
        assertArrayEquals(expectedTotals, actualTotals);
    }

    @Test
    void testFindBiggestElf() {
        int expectedValue = 3;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        int actualValue = advent.getLargestElf()[0];
        assertEquals(actualValue, expectedValue);
    }

    @Test
    void testFindBiggestElfAndValue() {
        int expectedIndex = 3;
        int expectedMaxValue = 120;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Integer[] largestElf = advent.getLargestElf();
        int actualIndex = largestElf[0];
        int actualMaxValue = largestElf[1];
        assertEquals(expectedIndex, actualIndex);
        assertEquals(expectedMaxValue, actualMaxValue);
    }

}
