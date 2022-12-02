package advent.advent1;

import advent.Advent;
import advent.AdventRunner;
import helper.MyFileReader;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advent01 implements Advent {

    private Stream<String> fileLines;

    public Advent01(AdventRunner value) {
        switch(value) {
            case TEST:
                fileLines = MyFileReader.fileToStringStream("TestAdvent01");
                break;
            case LIVE:
                fileLines = MyFileReader.fileToStringStream("Advent01");
                break;
            default:
                break;
        }
    }

    @Override
    public String partOne() {
        return String.valueOf(getLargestElf().getValue());
    }

    @Override
    public String partTwo() {
        return null;
    }

    public Elf[] splitElfCalories() {
        List<String> elfList = fileLines.collect(Collectors.toList());
        List<Elf> elfCaloriesList = new ArrayList<>();
        int calorieCount = 0;
        int elfIndex = 0;
        for(String elfCalorie : elfList) {
            if(elfCalorie.isBlank()) {
                elfIndex += 1;
                elfCaloriesList.add(new Elf(elfIndex, calorieCount));
                calorieCount = 0;
            }
            else {
                calorieCount += Integer.parseInt(elfCalorie);
            }
        }
        //catch final
        elfCaloriesList.add(new Elf(elfIndex + 1, calorieCount));
        return elfCaloriesList.toArray(Elf[]::new);
    }

    //Retrieve max value out of elf calorie list
    //Return Elf record where max value is present

    public Elf getLargestElf() {
        Elf[] elfCalorieList = splitElfCalories();
        int max = Arrays.stream(elfCalorieList).mapToInt(Elf::getValue).max().orElseThrow(NoSuchElementException::new);
        return Arrays.stream(elfCalorieList).filter(e -> e.getValue() == max).distinct().collect(Collectors.toList()).get(0);
    }

}
