package advent.advent2;

import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoveFactory;

public class Round {

    private final RPSMove playerOneMove;
    private final RPSMove playerTwoMove;

    public Round(String input, boolean partOne) {
        //Retrieve char values
        int playerOneIndex = 0;
        char playerOneValue = input.toCharArray()[playerOneIndex];
        int playerTwoIndex = 2;
        char playerTwoValue = input.toCharArray()[playerTwoIndex];
        //Use factory
        if(partOne) {
            this.playerOneMove = RPSMoveFactory.createRPSMoveGivenChar(playerOneValue);
            this.playerTwoMove = RPSMoveFactory.createRPSMoveGivenChar(playerTwoValue);
        }
        else {
            this.playerOneMove = RPSMoveFactory.createRPSMoveGivenChar(playerOneValue);
            this.playerTwoMove = RPSMoveFactory.createRPSMovePartTwo(playerOneMove, playerTwoValue);
        }

    }

    public RPSMove getPlayerOneMove() {
        return playerOneMove;
    }

    public RPSMove getPlayerTwoMove() {
        return playerTwoMove;
    }

}
