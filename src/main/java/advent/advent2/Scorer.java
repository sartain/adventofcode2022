package advent.advent2;

import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoves;

public class Scorer {

    private static final int pointsForLoss = 0;
    private static final int pointsForDraw = 3;
    private static final int pointsForWin = 6;

    public static int getScoreGivenCharacter(RPSMove move) {
        return move.getScore();
    }

    public static int getScoreGivenRound(RPSMove playerOne, RPSMove playerTwo) {
        RPSMoves playerOneMove = playerOne.getValue();
        RPSMoves playerTwoMove = playerTwo.getValue();
        if(playerOneMove.equals(playerTwoMove)) {
            return pointsForDraw;
        }
        if(playerOne.getWinsAgainst().equals(playerTwo.getValue())) {
            return pointsForLoss;
        }
        else    //wins
            return pointsForWin;
    }

}
