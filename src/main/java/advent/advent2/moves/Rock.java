package advent.advent2.moves;

public class Rock extends RPSMove {

    public Rock() {
        super();
        this.score = 1;
        this.value = RPSMoves.ROCK;
        this.winsAgainst = RPSMoves.SCISSORS;
    }

}
