package advent.advent2.scoring;

import advent.advent2.moves.RPSMoves;

public class RPSRules {

    private static final RPSMoves[] playerOne = {RPSMoves.ROCK, RPSMoves.PAPER, RPSMoves.SCISSORS};
    private static final RPSMoves[] playerTwo = {RPSMoves.SCISSORS, RPSMoves.ROCK, RPSMoves.PAPER};

    public static RPSMoves winsAgainst(RPSMoves move) {
        for(int i = 0; i < playerOne.length; i++ ) {
            if(playerOne[i] == move) {
                return playerTwo[i];
            }
        }
        return null;
    }

    public static RPSMoves losesAgainst(RPSMoves move) {
        for(int i = 0; i < playerOne.length; i++ ) {
            if(playerTwo[i] == move) {
                return playerOne[i];
            }
        }
        return null;
    }

}
