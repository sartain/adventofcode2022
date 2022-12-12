package adventTests;

import advent.AdventRunner;
import advent.advent3.Advent03;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent03Test {

    @Test
    void splitCompartments() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        char[] expectedCompartmentOne = "vJrwpWtwJgWr".toCharArray();
        char[] expectedCompartmentTwo = "hcsFMMfFFhFp".toCharArray();
        List<char[]> compartments = advent.splitCompartment("vJrwpWtwJgWrhcsFMMfFFhFp");
        char[] actualCompartmentOne = compartments.get(0);
        char[] actualCompartmentTwo = compartments.get(1);
        assertArrayEquals(expectedCompartmentOne, actualCompartmentOne);
        assertArrayEquals(expectedCompartmentTwo, actualCompartmentTwo);
    }

    @Test
    void findItemsInBothCompartments() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        List<char[]> compartments = advent.splitCompartment("vJrwpWtwJgWrhcsFMMfFFhFp");
        String[] actualMatchingItems = advent.findMatchingItems(compartments).toArray(String[]::new);
        String[] expectedMatchingItems = {"p"};
        assertArrayEquals(expectedMatchingItems, actualMatchingItems);
    }

    @Test
    void findItemsInBothCompartmentsTwo() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        List<char[]> compartments = advent.splitCompartment("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        String[] actualMatchingItems = advent.findMatchingItems(compartments).toArray(String[]::new);
        String[] expectedMatchingItems = {"L"};
        assertArrayEquals(expectedMatchingItems, actualMatchingItems);
    }

    @Test
    void findValueOfItemGivenValue() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        int actualValue = advent.findValueGivenInput('p');
        int expectedValue = 16;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void findTotalValueGivenInput() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        List<char[]> compartments = advent.splitCompartment("vJrwpWtwJgWrhcsFMMfFFhFp");
        int actualValue = advent.findTotalValueGivenCompartments(compartments);
        int expectedValue = 16;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void findTotalValueGivenInputTwo() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        List<char[]> compartments = advent.splitCompartment("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        int actualValue = advent.findTotalValueGivenCompartments(compartments);
        int expectedValue = 38;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void calculateFinalValueGivenFileInput() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        int actualValue = advent.findTotalValue();
        int expectedValue = 157;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void splitGroups() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        String[] expectedGroupOne = {"vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg"
        };
        String[] expectedGroupTwo = {"wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                "ttgJtRGJQctTZtZT",
                "CrZsJsPPZsGzwwsLwLmpwMDw"
        };
        //Will use test txt file
        List<String[]> groups = advent.splitGroups();
        String[] actualGroupOne = groups.get(0);
        String[] actualGroupTwo = groups.get(1);
        assertArrayEquals(expectedGroupOne, actualGroupOne);
        assertArrayEquals(expectedGroupTwo, actualGroupTwo);
    }

    @Test
    void findMatchingItemForGroup() {
        Advent03 advent = new Advent03(AdventRunner.TEST);
        String[] group = {"vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg"
        };
        char actualMatchingItem = advent.findMatchingItemGivenGroup(group);
        char expectedMatchingItem = 'r';
        assertEquals(expectedMatchingItem, actualMatchingItem);
    }
}
