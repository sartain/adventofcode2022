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

}
