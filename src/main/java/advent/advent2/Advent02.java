package advent.advent2;

import advent.Advent;
import advent.AdventRunner;
import helper.MyFileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advent02 implements Advent {

    private Stream<String> fileLines;

    public Advent02(AdventRunner value) {
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
        return null;
    }

    @Override
    public String partTwo() {
        return null;
    }

    //Expectation is that round has two char values

    public List<Character> getPlayerList(boolean firstPlayer) {
        List<String> rpsRounds = fileLines.collect(Collectors.toList());
        List<Character> playerMoveList = new ArrayList<>();
        for(String roundString : rpsRounds) {
            Round round = new Round(roundString);
            if(firstPlayer)
                playerMoveList.add(round.getPlayerOneMove());
            else
                playerMoveList.add(round.getPlayerTwoMove());
        }
        return playerMoveList;
    }

    public List<Character> getPlayerOneList() {
        return getPlayerList(true);
    }

    public List<Character> getPlayerTwoList() {
        return getPlayerList(false);
    }
}
