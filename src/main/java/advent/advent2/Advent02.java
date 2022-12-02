package advent.advent2;

import advent.Advent;
import advent.AdventRunner;
import advent.advent2.moves.RPSMove;
import advent.advent2.moves.RPSMoves;
import helper.MyFileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advent02 implements Advent {

    private Stream<String> fileLines;
    private AdventRunner adventRunner;

    public Advent02(AdventRunner value) {
        this.adventRunner = value;
        readFile(this.adventRunner);
    }

    public void readFile(AdventRunner value) {
        switch(value) {
            case TEST:
                fileLines = MyFileReader.fileToStringStream("TestAdvent02");
                break;
            case LIVE:
                fileLines = MyFileReader.fileToStringStream("Advent02");
                break;
            default:
                break;
        }
    }

    @Override
    public String partOne() {
        return String.valueOf(scorePlayerTwoGame());
    }

    @Override
    public String partTwo() {
        return null;
    }

    //Expectation is that round has two char values

    public List<RPSMove> getPlayerList(boolean firstPlayer) {
        readFile(this.adventRunner);
        List<String> rpsRounds = fileLines.collect(Collectors.toList());
        List<RPSMove> playerMoveList = new ArrayList<>();
        for(String roundString : rpsRounds) {
            Round round = new Round(roundString);
            if(firstPlayer)
                playerMoveList.add(round.getPlayerOneMove());
            else
                playerMoveList.add(round.getPlayerTwoMove());
        }
        return playerMoveList;
    }

    public List<RPSMove> getPlayerOneList() {
        return getPlayerList(true);
    }

    public List<RPSMove> getPlayerTwoList() {
        return getPlayerList(false);
    }

    public int scorePlayerTwoIndividualValues() {
        List<RPSMove> playerList = getPlayerTwoList();
        return playerList.stream().map(Scorer::getScoreGivenCharacter).reduce(0, Integer::sum);
    }

    public int scorePlayerTwoRounds() {
        List<RPSMove> playerOneList = getPlayerOneList();
        List<RPSMove> playerTwoList = getPlayerTwoList();
        int totalScore = 0;
        for(int i = 0; i < playerOneList.size(); i++) {
            totalScore += Scorer.getScoreGivenRound(playerOneList.get(i), playerTwoList.get(i));
        }
        return totalScore;
    }

    public int scorePlayerTwoGame() {
        return scorePlayerTwoIndividualValues() + scorePlayerTwoRounds();
    }

}
