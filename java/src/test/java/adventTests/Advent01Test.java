package adventTests;

import advent.advent1.Advent01;
import advent.AdventRunner;
import advent.advent1.Elf;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent01Test {

    @Test
    void testSplitElfValueIntoTotal() {
        Integer[] expectedTotals = {100, 110, 120};
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Elf[] actualTotals = advent.splitElfCalories().toArray(Elf[]::new);
        Integer[] elfMaxValues = Arrays.stream(actualTotals).map(Elf::getValue).toArray(Integer[]::new);
        assertArrayEquals(expectedTotals, elfMaxValues);
    }

    @Test
    void testFindBiggestElf() {
        int expectedElf = 3;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        int actualElf = advent.getLargestElf().getIndex();
        assertEquals(expectedElf, actualElf);
    }

    @Test
    void testFindBiggestElfAndValue() {
        int expectedIndex = 3;
        int expectedTotalCalories = 120;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Elf largestElf = advent.getLargestElf();
        int actualIndex = largestElf.getIndex();
        int actualMaxValue = largestElf.getValue();
        assertEquals(expectedIndex, actualIndex);
        assertEquals(expectedTotalCalories, actualMaxValue);
    }

}
