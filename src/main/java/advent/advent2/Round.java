package advent.advent2;

import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoveFactory;
import advent.advent2.moves.RPSMoves;

public class Round {

    private final RPSMove playerOneMove;
    private final RPSMove playerTwoMove;

    public Round(String input) {
        int playerOneIndex = 0;
        this.playerOneMove = RPSMoveFactory.createRPSMove(input.toCharArray()[playerOneIndex]);
        int playerTwoIndex = 2;
        this.playerTwoMove = RPSMoveFactory.createRPSMove(input.toCharArray()[playerTwoIndex]);
    }

    public RPSMove getPlayerOneMove() {
        return playerOneMove;
    }


    public RPSMove getPlayerTwoMove() {
        return playerTwoMove;
    }

}
