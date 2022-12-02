package advent.advent2.moves;

import advent.advent2.scoring.RPSRules;

public class RPSMove {

    int score;
    RPSMoves value;

    public int getScore() {
        return this.score;
    }

    public RPSMoves getValue() {
        return this.value;
    }

    public RPSMoves getWinsAgainst() {
        return RPSRules.winsAgainst(this.value);
    }

    public RPSMoves getLosesAgainst() {
        return RPSRules.losesAgainst(this.value);
    }

}
