package adventTests;

import advent.Advent;
import advent.AdventRunner;
import advent.advent2.Advent02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Advent02Test {

    @Test
    void testGetPlayerOneList() {
        Character[] expectedPlayerOneList = {'A','B','C'};
        Advent02 advent = new Advent02(AdventRunner.TEST);
        Character[] actualPlayerOneList = advent.getPlayerOneList().toArray(Character[]::new);
        assertArrayEquals(expectedPlayerOneList, actualPlayerOneList);
    }

}