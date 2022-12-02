package advent.advent2;

public class Round {

    public Character getPlayerOneMove() {
        return playerOneMove;
    }

    public void setPlayerOneMove(Character playerOneMove) {
        this.playerOneMove = playerOneMove;
    }

    public Character getPlayerTwoMove() {
        return playerTwoMove;
    }

    public void setPlayerTwoMove(Character playerTwoMove) {
        this.playerTwoMove = playerTwoMove;
    }

    private Character playerOneMove;
    private Character playerTwoMove;

    public Round(String input) {
        this.playerOneMove = input.toCharArray()[0];
        this.playerTwoMove = input.toCharArray()[2];
    }

}
