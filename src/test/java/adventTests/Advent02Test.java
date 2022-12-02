package adventTests;

import advent.Advent;
import advent.AdventRunner;
import advent.advent2.Advent02;
import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoves;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Advent02Test {

    @Test
    void testGetPlayerOneList() {
        RPSMoves[] expectedPlayerOneList = {RPSMoves.ROCK, RPSMoves.PAPER, RPSMoves.SCISSORS};
        Advent02 advent = new Advent02(AdventRunner.TEST);
        RPSMoves[] actualPlayerOneList = advent.getPlayerOneList().stream().map(RPSMove::getValue).toArray(RPSMoves[]::new);
        assertArrayEquals(expectedPlayerOneList, actualPlayerOneList);
    }

    @Test
    void testGetPlayerTwoList() {
        RPSMoves[] expectedPlayerTwoList = {RPSMoves.PAPER, RPSMoves.ROCK, RPSMoves.SCISSORS};
        Advent02 advent = new Advent02(AdventRunner.TEST);
        RPSMoves[] actualPlayerTwoList = advent.getPlayerTwoList().stream().map(RPSMove::getValue).toArray(RPSMoves[]::new);
        assertArrayEquals(expectedPlayerTwoList, actualPlayerTwoList);
    }

    @Test
    void testScoreIndividualValues() {
        int expectedScore = 6;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoIndividualValues();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreGame() {
        int expectedScore = 9;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoRounds();
        assertEquals(expectedScore, actualScore);
    }

    @Test
    void testScoreTotalGame() {
        int expectedScore = 15;
        Advent02 advent = new Advent02(AdventRunner.TEST);
        int actualScore = advent.scorePlayerTwoGame();
        assertEquals(expectedScore, actualScore);
    }

}
