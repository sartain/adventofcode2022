package advent.advent2.scoring;

import advent.advent2.moves.RPSMoveType;

public class RPSRules {

    private static final RPSMoveType[] playerOne = {RPSMoveType.ROCK, RPSMoveType.PAPER, RPSMoveType.SCISSORS};
    private static final RPSMoveType[] playerTwo = {RPSMoveType.SCISSORS, RPSMoveType.ROCK, RPSMoveType.PAPER};

    public static RPSMoveType winsAgainst(RPSMoveType move) {
        for(int i = 0; i < playerOne.length; i++ ) {
            if(playerOne[i] == move) {
                return playerTwo[i];
            }
        }
        return null;
    }

    public static RPSMoveType losesAgainst(RPSMoveType move) {
        for(int i = 0; i < playerOne.length; i++ ) {
            if(playerTwo[i] == move) {
                return playerOne[i];
            }
        }
        return null;
    }

}
