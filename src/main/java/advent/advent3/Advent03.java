package advent.advent3;

import advent.Advent;
import advent.Advent00;
import advent.AdventRunner;
import helper.MyFileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advent03 extends Advent00 implements Advent {

    private AdventRunner adventRunner;
    private Stream<String> fileLines;
    private final char[] characterValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public Advent03(AdventRunner value) {
        this.adventRunner = value;
        fileLines = super.readFile("Advent03", value);
    }

    @Override
    public String partOne() {
        return String.valueOf(findTotalValue());
    }

    @Override
    public String partTwo() {
        fileLines = super.readFile("Advent03", this.adventRunner);
        return String.valueOf(findTotalValuePartTwo());
    }

    public char findMatchingItemGivenGroup(String[] group) {
        char[] memberOne = group[0].toCharArray();
        char[] memberTwo = group[1].toCharArray();
        char[] memberThree = group[2].toCharArray();
        for(char c : memberOne) {
            if(isCharacterInArray(c, memberTwo)) {
                if(isCharacterInArray(c, memberThree)) {
                    return c;
                }
            }
        }
        return '0';
    }

    public boolean isCharacterInArray(char charToCheck, char[] arrayToCheck) {
        for(char c : arrayToCheck) {
            if(c == charToCheck) {
                return true;
            }
        }
        return false;
    }

    public int findTotalValue() {
        return fileLines.map(this::splitCompartment).map(this::findTotalValueGivenCompartments).reduce(0, Integer::sum);
    }

    public int findTotalValuePartTwo() {
        List<String[]> groups = this.splitGroups();
        return groups.stream().map(this::findMatchingItemGivenGroup).map(this::findValueGivenInput).reduce(0, Integer::sum);
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

    public List<String[]> splitGroups() {
        //Initialize variables
        int groupSize = 3;
        List<String[]> groups = new ArrayList<>();
        List<String> input = fileLines.collect(Collectors.toList());
        int counter = 1;
        List<String> group = new ArrayList<>();
        //Add to group
        for(String inputString : input) {
            group.add(inputString);
            if(counter % groupSize == 0) {
                groups.add(group.toArray(String[]::new));
                group = new ArrayList<>();
            }
            counter += 1;
        }
        return groups;
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
                    if(!matches.contains(String.valueOf(compartmentOneValue)))
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

    public int findTotalValueGivenCompartments(List<char[]> compartments) {
        //Split compartments
        char[] compartmentOne = compartments.get(0);
        char[] compartmentTwo = compartments.get(1);
        List<String> matches = new ArrayList<>();
        int total = 0;
        //Find matches
        for(char compartmentOneValue : compartmentOne) {
            for(char compartmentTwoValue : compartmentTwo) {
                if(compartmentOneValue == compartmentTwoValue) {
                    //This line avoids duplicate matches
                    if (!matches.contains(String.valueOf(compartmentOneValue))) {
                        total += findValueGivenInput(compartmentOneValue);
                        matches.add(String.valueOf(compartmentOneValue));
                    }
                }
            }
        }
        return total;
    }

}
