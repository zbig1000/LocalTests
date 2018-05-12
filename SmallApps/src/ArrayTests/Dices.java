package ArrayTests;

public class Dices {
    //finding minimal amount of turns of dices to turn all to same side
    private final int[] sides1 = {1, 2, 6, 5};
    private final int[] sides2 = {3, 2, 4, 5};

    public int solution(int[] A) {
        int minMoves = 0;
        for (int i = 1; i < 7; i++) {
            int moves = 0;
            int notFound = 0;
            for (int j = 0; j < A.length; j++) {
                int currentMinimalMove = findMinimalMoveFromTo(A[j], i);
                if (currentMinimalMove >= 0) moves += currentMinimalMove;
                else notFound = -1;
            }
            if ((minMoves == 0) && (moves != 0) && (notFound == 0)) minMoves = moves;
            else minMoves = ((moves != 0) && (notFound == 0)) ? (Math.min(minMoves, moves)) : (minMoves);
        }
        return minMoves;
    }

    private int findMinimalMoveFromTo(int from, int to) {
        return Math.min(movingRight(from, to), movingLeft(from, to));
    }

    private int movingRight(int pipStart, int pipTarget) {
        int movesRight1 = -1;
        int movesRight2 = -1;

        int position = findInSide(pipStart, sides1);
        if (position != -1) movesRight1 = findNumerMovesRight(sides1, position, pipTarget);

        position = findInSide(pipStart, sides2);
        if (position != -1) movesRight2 = findNumerMovesRight(sides2, position, pipTarget);

        if (movesRight1 < 0) return movesRight2;
        if (movesRight2 < 0) return movesRight1;
        return Math.min(movesRight1, movesRight2);
    }

    private int findNumerMovesRight(int[] side, int currentPosition, int pip) {
        for (int i = 0; i < 4; i++) {
            if (side[(currentPosition + i) % 4] == pip) return i;
        }
        return -1;
    }

    private int findNumerMovesLeft(int[] side, int currentPosition, int pip) {
        int newPosition;
        for (int i = 0; i < 4; i++) {
            newPosition = ((currentPosition - i) >= 0) ? (currentPosition - i) : (4 + currentPosition - i);
            if (side[(newPosition)] == pip) return i;
        }
        return -1;
    }

    private int movingLeft(int pipStart, int pipTarget) {
        int movesLeft1 = -1;
        int movesLeft2 = -1;

        int position = findInSide(pipStart, sides1);
        if (position != -1) movesLeft1 = findNumerMovesLeft(sides1, position, pipTarget);

        position = findInSide(pipStart, sides2);
        if (position != -1) movesLeft2 = findNumerMovesLeft(sides2, position, pipTarget);

        if (movesLeft1 < 0) return movesLeft2;
        if (movesLeft2 < 0) return movesLeft1;
        return Math.min(movesLeft1, movesLeft2);
    }

    private int findInSide(int pip, int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == pip) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 6, 2, 3};
        System.out.println(new Dices().solution(A));
    }
}
