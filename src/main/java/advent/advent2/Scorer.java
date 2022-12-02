package advent.advent2;

import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoves;

public class Scorer {

    public static int getScoreGivenCharacter(RPSMove move) {
        return move.getScore();
    }

}
