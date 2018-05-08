package ArrayTests;

public class Dices {
    //finding minimal amount of turns of dices to turn all to same side
    public int solution(int[] A) {
        int minMoves = 0;
        for (int i = 1; i < 7; i++) {
            int moves = 0;
            int notFound = 0;
            for (int j = 0; j < A.length; j++) {
                int currentMinimalMove =  findMinimalMoveFromTo(A[j], i);
                if (currentMinimalMove>=0) moves += currentMinimalMove;
                    else notFound = -1;
            }
            if ((minMoves == 0) && (moves!=0) && (notFound==0)) minMoves = moves;
                else minMoves = ((moves != 0) && (notFound==0)) ? (Math.min(minMoves, moves)) : (minMoves);
        }
        return minMoves;
    }

    private int findMinimalMoveFromTo(int from, int to) {
        return Math.min(movingRight(from, to), movingLeft(from, to));
    }

    private int movingRight(int pipStart, int pipTarget) {
        int[] sides1 = {1, 2, 6, 5};
        int[] sides2 = {3, 2, 4, 5};

        int movesRight1 = -1;
        int movesRight2 = -1;
        int position = findInSide(pipStart, sides1);
        if (position != -1) {
            for (int i = 0; i < 4; i++) {
                if (sides1[(position + i) % 4] == pipTarget) {
                    movesRight1 = i;
                    break;
                }
            }
        }

        position = findInSide(pipStart, sides2);
        if (position != -1) {
            for (int i = 0; i < 4; i++) {
                if (sides2[(position + i) % 4] == pipTarget) {
                    movesRight2 = i;
                    break;
                }
            }
        }

        if (movesRight1 < 0) return movesRight2;
        if (movesRight2 < 0) return movesRight1;
        return Math.min(movesRight1, movesRight2);
    }

    private int movingLeft(int pipStart, int pipTarget) {
        int[] sides1 = {1, 2, 6, 5};
        int[] sides2 = {3, 2, 4, 5};

        int movesLeft1 = -1;
        int movesLeft2 = -1;
        int currentPosition = 0;
        int position = findInSide(pipStart, sides1);
        if (position != -1) {
            for (int i = 0; i < 4; i++) {
                currentPosition = ((position - i) >= 0) ? (position - i) : (4 + position - i);
                if (sides1[currentPosition] == pipTarget) {
                    movesLeft1 = i;
                    break;
                }
             }
        }

        position = findInSide(pipStart, sides2);
        if (position != -1) {
            for (int i = 0; i < 4; i++) {
                currentPosition = ((position - i) >= 0) ? (position - i) : (4 + position - i);
                if (sides2[currentPosition] == pipTarget) {
                    movesLeft2 = i;
                    break;
                }
            }
        }

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
