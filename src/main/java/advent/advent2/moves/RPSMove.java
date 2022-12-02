package advent.advent2.moves;

import advent.advent2.scoring.RPSRules;

public class RPSMove {

    int score;
    RPSMoveType value;

    public int getScore() {
        return this.score;
    }

    public RPSMoveType getValue() {
        return this.value;
    }

    public RPSMoveType getWinsAgainst() {
        return RPSRules.winsAgainst(this.value);
    }

    public RPSMoveType getLosesAgainst() {
        return RPSRules.losesAgainst(this.value);
    }

}
