package advent.advent2.moves;

public class Scissors extends RPSMove {

    public Scissors() {
        super();
        this.score = 3;
        this.value = RPSMoves.SCISSORS;
        this.winsAgainst = RPSMoves.PAPER;
        this.losesAgainst = RPSMoves.ROCK;
    }

}
