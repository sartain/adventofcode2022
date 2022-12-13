package advent.advent1;

import advent.Advent00;
import advent.AdventRunner;

import java.util.*;
import java.util.stream.Collectors;

public class Advent01 extends Advent00 {

    public Advent01(AdventRunner value) {
        super(value, "Advent01");
    }

    @Override
    public String partOne() {
        return String.valueOf(getTotalCaloriesFromLargestElves(1));
    }

    @Override
    public String partTwo() {
        super.readFile();
        return String.valueOf(getTotalCaloriesFromLargestElves(3));
    }

    public List<Elf> splitElfCalories() {
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
        return elfCaloriesList;
    }

    //Retrieve max value out of elf calorie list
    //Return Elf record where max value is present

    public List<Elf> getLargestElves(int numberOfElvesToRetrieve) {
        List<Elf> elfCalorieList = splitElfCalories();
        elfCalorieList.sort(Comparator.comparingInt(Elf::getValue).reversed());
        return elfCalorieList.stream().limit(numberOfElvesToRetrieve).collect(Collectors.toList());
    }

    public int getTotalCaloriesFromLargestElves(int numberOfElvesToRetrieve) {
        return getLargestElves(numberOfElvesToRetrieve).stream().map(Elf::getValue).reduce(0, Integer::sum);
    }

}
