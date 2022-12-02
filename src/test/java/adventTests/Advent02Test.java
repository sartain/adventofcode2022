package adventTests;

import advent.AdventRunner;
import advent.advent2.Advent02;
import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoveType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent02Test {

    @Test
    void testGetPlayerOneList() {
        RPSMoveType[] expectedPlayerOneList = {RPSMoveType.ROCK, RPSMoveType.PAPER, RPSMoveType.SCISSORS};
        Advent02 advent = new Advent02(AdventRunner.TEST);
        RPSMoveType[] actualPlayerOneList = advent.getPlayerOneList().stream().map(RPSMove::getValue).toArray(RPSMoveType[]::new);
        assertArrayEquals(expectedPlayerOneList, actualPlayerOneList);
    }

    @Test
    void testGetPlayerTwoList() {
        RPSMoveType[] expectedPlayerTwoList = {RPSMoveType.PAPER, RPSMoveType.ROCK, RPSMoveType.SCISSORS};
        Advent02 advent = new Advent02(AdventRunner.TEST);
        RPSMoveType[] actualPlayerTwoList = advent.getPlayerTwoList().stream().map(RPSMove::getValue).toArray(RPSMoveType[]::new);
        assertArrayEquals(expectedPlayerTwoList, actualPlayerTwoList);
    }

    @Test
    void testScoreIndividualValuesPartOne() {
        int expectedScore = 6;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoIndividualValues(true);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreIndividualValuesPartTwo() {
        int expectedScore = 3;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoIndividualValues(false);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreGamePartOne() {
        int expectedScore = 9;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoRounds(true);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreGamePartTwo() {
        int expectedScore = 9;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoRounds(false);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreTotalGamePartOne() {
        int expectedScore = 15;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoGame();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreTotalGamePartTwo() {
        int expectedScore = 12;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoGamePartTwo();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testGetPlayerTwoListPartTwo() {
        RPSMoveType[] expectedPlayerTwoList = {RPSMoveType.ROCK, RPSMoveType.ROCK, RPSMoveType.ROCK};
        Advent02 advent = new Advent02(AdventRunner.TEST);
        RPSMoveType[] actualPlayerTwoList = advent.getPlayerTwoListPartTwo().stream().map(RPSMove::getValue).toArray(RPSMoveType[]::new);
        assertArrayEquals(expectedPlayerTwoList, actualPlayerTwoList);
    }

}
