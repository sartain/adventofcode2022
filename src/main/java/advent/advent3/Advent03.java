package advent.advent3;

import advent.Advent;

import java.util.ArrayList;
import java.util.List;

public class Advent03 implements Advent {

    private char[] characterValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String partOne() {
        return null;
    }

    @Override
    public String partTwo() {
        return null;
    }

    public List<char[]> splitCompartment(String input) {
        //Retrieve input string indexes
        int inputLength = input.length();
        int middleIndex = inputLength / 2;
        //Split string
        String compartmentOne = input.substring(0, middleIndex);
        String compartmentTwo = input.substring(middleIndex, inputLength);
        //Produce list to return
        List<char[]> listToReturn = new ArrayList<>();
        listToReturn.add(compartmentOne.toCharArray());
        listToReturn.add(compartmentTwo.toCharArray());
        return listToReturn;
    }

    public List<String> findMatchingItems(List<char[]> compartments) {
        //Split compartments
        char[] compartmentOne = compartments.get(0);
        char[] compartmentTwo = compartments.get(1);
        List<String> matches = new ArrayList<>();
        //Find matches
        for(char compartmentOneValue : compartmentOne) {
            for(char compartmentTwoValue : compartmentTwo) {
                if(compartmentOneValue == compartmentTwoValue)
                    matches.add(String.valueOf(compartmentOneValue));
            }
        }
        //return matches
        return matches;
    }

    public int findValueGivenInput(char input) {
        for(int i = 0; i< characterValues.length; i++) {
            if(input == characterValues[i]) {
                return i+1;
            }
        }
        return 0;
    }

}
