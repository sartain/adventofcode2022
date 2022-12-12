package advent.advent2;

import advent.Advent;
import advent.Advent00;
import advent.AdventRunner;
import advent.advent2.moves.RPSMove;
import advent.advent2.scoring.Scorer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Advent02 extends Advent00 implements Advent {

    public Advent02(AdventRunner value) {
        super(value, "Advent02");
    }

    @Override
    public String partOne() {
        return String.valueOf(scorePlayerTwoGame());
    }

    @Override
    public String partTwo() {
        super.readFile();
        return String.valueOf(scorePlayerTwoGamePartTwo());
    }

    //Expectation is that round has two char values


    public List<RPSMove> getPlayerList(boolean firstPlayer, boolean partOne) {
        super.readFile();
        List<String> rpsRounds = fileLines.collect(Collectors.toList());
        List<RPSMove> playerMoveList = new ArrayList<>();
        for(String roundString : rpsRounds) {
            Round round = new Round(roundString, partOne);
            if(firstPlayer)
                playerMoveList.add(round.getPlayerOneMove());
            else
                playerMoveList.add(round.getPlayerTwoMove());
        }
        return playerMoveList;
    }

    public List<RPSMove> getPlayerOneList() {
        return getPlayerList(true, true);
    }

    public List<RPSMove> getPlayerTwoList() {
        return getPlayerList(false, true);
    }

    public List<RPSMove> getPlayerTwoListPartTwo() {
        return getPlayerList(false, false);
    }

    public int scorePlayerTwoIndividualValues(boolean partOne) {
        List<RPSMove> playerList;
        if(partOne)
            playerList = getPlayerTwoList();
        else
            playerList = getPlayerTwoListPartTwo();
        return playerList.stream().map(Scorer::getScoreGivenCharacter).reduce(0, Integer::sum);
    }

    public int scorePlayerTwoRounds(boolean partOne) {
        List<RPSMove> playerOneList = getPlayerOneList();
        List<RPSMove> playerTwoList;
        if(partOne)
            playerTwoList = getPlayerTwoList();
        else
            playerTwoList = getPlayerTwoListPartTwo();
        int totalScore = 0;
        for(int i = 0; i < playerOneList.size(); i++) {
            totalScore += Scorer.getScoreGivenRound(playerOneList.get(i), playerTwoList.get(i));
        }
        return totalScore;
    }

    public int scorePlayerTwoGame() {
        return scorePlayerTwoIndividualValues(true) + scorePlayerTwoRounds(true);
    }

    public int scorePlayerTwoGamePartTwo() {
        return scorePlayerTwoIndividualValues(false) + scorePlayerTwoRounds(false);
    }

}
