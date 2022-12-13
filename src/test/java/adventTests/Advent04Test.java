package adventTests;

import advent.AdventRunner;
import advent.advent4.Advent04;
import advent.advent4.Camp;
import advent.advent4.CampSection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent04Test {

    @Test
    void splitPair() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        Camp camp = new Camp("2-4,6-8");
        CampSection expectedSectionOne = camp.getSectionOne();
        CampSection expectedSectionTwo = camp.getSectionTwo();
        CampSection actualSectionOne = advent.getCampFromString("2-4,6-8").getSectionOne();
        CampSection actualSectionTwo = advent.getCampFromString("2-4,6-8").getSectionTwo();
        assertEquals(expectedSectionOne, actualSectionOne);
        assertEquals(expectedSectionTwo, actualSectionTwo);
    }

    @Test
    void falseWhenNotFullyContain() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        boolean expectedOverlap = false;
        boolean actualOverlap = advent.checkFullyContainFromString("2-4,6-8");
        assertEquals(expectedOverlap, actualOverlap);
    }

    @Test
    void trueWhenFullyContainOverlap() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        boolean expectedOverlap = true;
        boolean actualOverlap = advent.checkFullyContainFromString("1-9,3-4");
        assertEquals(expectedOverlap, actualOverlap);
    }

    @Test
    void trueWhenFullyContainOverlapAlternate() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        boolean expectedOverlap = true;
        boolean actualOverlap = advent.checkFullyContainFromString("3-4,1-9");
        assertEquals(expectedOverlap, actualOverlap);
    }

    @Test
    void calculateSumOfFullyContainOverlaps() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        int expectedOverlapCount = 2;
        int actualOverlapCount = advent.getSumOfFullyContains();
        assertEquals(expectedOverlapCount, actualOverlapCount);
    }

    @Test
    void trueWhenOverlapping() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        boolean expectedOverlap = true;
        boolean actualOverlap = advent.checkOverlapsFromString("1-6,6-10");
        assertEquals(expectedOverlap, actualOverlap);
    }

    @Test
    void falseWhenNotOverlapping() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        boolean expectedOverlap = false;
        boolean actualOverlap = advent.checkOverlapsFromString("1-6,7-10");
        assertEquals(expectedOverlap, actualOverlap);
    }

    @Test
    void calculateSumOfOverlapping() {
        Advent04 advent = new Advent04(AdventRunner.TEST);
        int expectedOverlapCount = 4;
        int actualOverlapCount = advent.getSumOfOverlaps();
        assertEquals(expectedOverlapCount, actualOverlapCount);
    }


}
