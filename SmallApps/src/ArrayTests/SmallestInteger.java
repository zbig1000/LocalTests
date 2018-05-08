package ArrayTests;

public class SmallestInteger {
    //finding smallest integer, not used in in array
    public int solution(int[] A) {
        int smallestInteger = 1;
        int maxInteger = 1;
        int result = 1;


        for (int i=0; i<A.length ; i++ ) {
            if (A[i] >0 ) {
                smallestInteger = Math.min(A[i], smallestInteger);
                }
            }
        for (int i=0; i<A.length ; i++ ) {
            if (A[i] >0 ) {
                maxInteger = Math.max(A[i], maxInteger);
            }
        }

        boolean wasAssigned = false;
        for (int value = smallestInteger; value<= maxInteger; value++) {
                if (!hasArrayValue(A, value)) {
                    result =  value;
                    wasAssigned = true;
                    break;
                }
            }
            if (!wasAssigned) result = maxInteger +1;
        return result;
    }

    private boolean hasArrayValue(int[] A, int value) {
        for (int i=0; i<A.length ; i++ ) {
             if (A[i] == value) return true;
            }
            return false;
        }


    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2,5,8};

        System.out.println(new SmallestInteger().solution(A));

    }
}
