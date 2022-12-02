package advent.advent2;

public class Scorer {

    public static int getScoreGivenCharacter(char input) {
        if(input == 'X' || input == 'A')
            return 1;
        else if(input == 'Y' || input == 'B')
            return 2;
        else
            return 3;
    }

}
