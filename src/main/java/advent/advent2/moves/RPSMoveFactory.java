package advent.advent2.moves;

public class RPSMoveFactory {

    public static RPSMove createRPSMoveGivenEnum(RPSMoves value) {
        switch(value) {
            case ROCK:
                return new Rock();
            case PAPER:
                return new Paper();
            case SCISSORS:
                return new Scissors();
            default:
                return null;
        }
    }

    public static RPSMove createRPSMoveGivenChar(char input) {
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

    public static RPSMove createRPSMovePartTwo(RPSMove rival, char input) {
        switch(input) {
            case 'X':
                return RPSMoveFactory.createRPSMoveGivenEnum(rival.getWinsAgainst());
            case 'Y':
                return RPSMoveFactory.createRPSMoveGivenEnum(rival.getValue());
            case 'Z':
                return RPSMoveFactory.createRPSMoveGivenEnum(rival.getLosesAgainst());
            default:
                return null;
        }
    }

}
