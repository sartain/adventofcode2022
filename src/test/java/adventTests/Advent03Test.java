package adventTests;

import advent.advent3.Advent03;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Advent03Test {

    @Test
    void splitCompartments() {
        Advent03 advent = new Advent03();
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
        Advent03 advent = new Advent03();
        List<char[]> compartments = advent.splitCompartment("vJrwpWtwJgWrhcsFMMfFFhFp");
        String[] actualMatchingItems = advent.findMatchingItems(compartments).toArray(String[]::new);
        String[] expectedMatchingItems = {"p"};
        assertArrayEquals(expectedMatchingItems, actualMatchingItems);
    }
}
