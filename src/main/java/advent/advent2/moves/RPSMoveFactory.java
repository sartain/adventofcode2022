package advent.advent2.moves;

public class RPSMoveFactory {

    public static RPSMove createRPSMove(char input) {
        switch(input) {
            case 'X':
            case 'A':
                return new Rock();
            case 'Y':
            case 'B':
                return new Paper();
            case 'Z':
            case 'C':
                return new Scissors();
            default:
                return null;
        }
    }

}
