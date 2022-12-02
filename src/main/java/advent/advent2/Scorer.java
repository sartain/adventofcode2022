package advent.advent2;

import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoves;

public class Scorer {

    public static int getScoreGivenCharacter(RPSMove move) {
        return move.getScore();
    }

    public static int getScoreGivenRound(RPSMove playerOne, RPSMove playerTwo) {
        RPSMoves playerOneMove = playerOne.getValue();
        RPSMoves playerTwoMove = playerTwo.getValue();
        if(playerOneMove.equals(playerTwoMove)) {
            return 3;
        }
        if(playerOne.getWinsAgainst().equals(playerTwo.getValue())) {
            return 0;
        }
        else
            return 6;
    }

}
