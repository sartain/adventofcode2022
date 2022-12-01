package adventTests;

import advent.advent1.Advent01;
import advent.AdventRunner;
import advent.advent1.Elf;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent01Test {

    @Test
    void testSplitElfValueIntoTotal() {
        Integer[] expectedTotals = {100, 110, 120};
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Elf[] actualTotals = advent.splitElfCalories();
        Integer[] elfMaxValues = Arrays.stream(actualTotals).map(Elf::getValue).toArray(Integer[]::new);
        assertArrayEquals(expectedTotals, elfMaxValues);
    }

    @Test
    void testFindBiggestElf() {
        int expectedValue = 3;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        int actualValue = advent.getLargestElf().getIndex();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testFindBiggestElfAndValue() {
        int expectedIndex = 3;
        int expectedMaxValue = 120;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Elf largestElf = advent.getLargestElf();
        int actualIndex = largestElf.getIndex();
        int actualMaxValue = largestElf.getValue();
        assertEquals(expectedIndex, actualIndex);
        assertEquals(expectedMaxValue, actualMaxValue);
    }

}
