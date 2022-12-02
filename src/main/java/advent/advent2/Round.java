package advent.advent2;

public class Round {

    private Character playerOneMove;
    private Character playerTwoMove;

    public Round(String input) {
        int playerOneIndex = 0;
        this.playerOneMove = input.toCharArray()[playerOneIndex];
        int playerTwoIndex = 2;
        this.playerTwoMove = input.toCharArray()[playerTwoIndex];
    }

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


}
