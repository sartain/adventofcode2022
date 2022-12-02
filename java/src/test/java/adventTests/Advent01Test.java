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
        Integer[] expectedTotals = {100, 3, 110, 120, 7, 26};
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Integer[] elfMaxValues = advent.splitElfCalories().stream().map(Elf::getValue).toArray(Integer[]::new);
        assertArrayEquals(expectedTotals, elfMaxValues);
    }

    @Test
    void testFindBiggestElf() {
        int expectedElf = 4;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        int actualElf = advent.getLargestElves(1).get(0).getIndex();
        assertEquals(expectedElf, actualElf);
    }

    @Test
    void testFindBiggestElfAndValue() {
        int expectedIndex = 4;
        int expectedTotalCalories = 120;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Elf largestElf = advent.getLargestElves(1).get(0);
        int actualIndex = largestElf.getIndex();
        int actualMaxValue = largestElf.getValue();
        assertEquals(expectedIndex, actualIndex);
        assertEquals(expectedTotalCalories, actualMaxValue);
    }

    @Test
    void testFindThreeBiggestElves() {
        Integer[] expectedTotals = {120, 110, 100};
        Advent01 advent = new Advent01(AdventRunner.TEST);
        Integer[] actualTotals = advent.getLargestElves(3).stream().map(Elf::getValue).toArray(Integer[]::new);
        assertArrayEquals(expectedTotals, actualTotals);
    }

    @Test
    void testSumThreeBiggestElves() {
        int expectedTotalCalories = 330;
        Advent01 advent = new Advent01(AdventRunner.TEST);
        int actualTotalCalories = advent.getTotalCaloriesFromLargestElves(3);
        assertEquals(expectedTotalCalories, actualTotalCalories);
    }

}
