package advent.advent2.moves;

public class Paper extends RPSMove {

    public Paper() {
        super();
        this.score = 2;
        this.value = RPSMoves.PAPER;
        this.winsAgainst = RPSMoves.ROCK;
        this.losesAgainst = RPSMoves.SCISSORS;
    }

}
