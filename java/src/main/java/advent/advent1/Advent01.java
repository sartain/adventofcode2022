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
        //Loop through, if string not empty retrieve value and add
        int count = 0;
        int elfCount = 0;
        for(String elfCalorie : elfList) {
            if(elfCalorie.isBlank()) {
                elfCount += 1;
                elfCaloriesList.add(new Elf(elfCount, count));
                count = 0;
            }
            else {
                count += Integer.parseInt(elfCalorie);
            }
        }
        //catch final
        elfCaloriesList.add(new Elf(elfCount + 1, count));
        return elfCaloriesList.toArray(Elf[]::new);
    }

    public Elf getLargestElf() {
        Elf[] elfCalorieList = splitElfCalories();
        int maxValue = 0;
        Elf maxElf = null;
        for(Elf elf : elfCalorieList) {
            if(elf.getValue() > maxValue) {
                maxValue = elf.getValue();
                maxElf = elf;
            }
        }
        return maxElf;
    }

}
