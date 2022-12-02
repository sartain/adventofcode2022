package advent.advent2.moves;

public class RPSMove {

    int score;
    RPSMoves value;
    RPSMoves winsAgainst;
    RPSMoves losesAgainst;

    public int getScore() {
        return this.score;
    }

    public RPSMoves getValue() {
        return this.value;
    }

    public RPSMoves getWinsAgainst() {
        return this.winsAgainst;
    }

    public RPSMoves getLosesAgainst() {
        return this.losesAgainst;
    }

}
