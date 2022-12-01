package advent;

import helper.MyFileReader;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advent01 implements Advent{

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
        return null;
    }

    @Override
    public String partTwo() {
        return null;
    }

    public Integer[] splitElfCalories() {
        List<String> elfList = fileLines.collect(Collectors.toList());
        List<Integer> elfCaloriesList = new ArrayList<>();
        //Loop through, if string not empty retrieve value and add
        int count = 0;
        for(String elfCalorie : elfList) {
            if(elfCalorie.isBlank()) {
                elfCaloriesList.add(count);
                count = 0;
            }
            else {
                count += Integer.parseInt(elfCalorie);
            }
        }
        //catch final
        elfCaloriesList.add(count);
        return elfCaloriesList.toArray(Integer[]::new);
    }

    public Integer[] getLargestElf() {
        Integer[] elfCalorieList = splitElfCalories();
        int maxValue = 0;
        int indexOfElf = 0;
        for(int i = 0; i < elfCalorieList.length; i ++) {
            if(elfCalorieList[i] > maxValue) {
                indexOfElf = i;
                maxValue = elfCalorieList[i];
            }
        }
        return new Integer[] {indexOfElf+1, maxValue};
    }

}
