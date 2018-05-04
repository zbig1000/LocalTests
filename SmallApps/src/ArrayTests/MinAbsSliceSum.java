package ArrayTests;

public class MinAbsSliceSum {

    public static class Solution {
        public int solution(int[] A) {
            int arraySize = A.length;
            int currentSum = 0;

            int minSum = 0;
            int pSlice = 0;
            int qSlice = 0;

            for (int i=0; i< arraySize; i++) {
                for (int j=i; j< arraySize; j++) {
                    currentSum = Math.abs(arraySum(A, i, j));
                    if (i==0 && j==0) {
                        minSum = currentSum;
                        pSlice = i;
                        qSlice = j;
                    }

                    if (currentSum < minSum) {
                        minSum = currentSum;
                        pSlice = i;
                        qSlice = j;
                    }
                }
            }

            System.out.println("minSum:" + minSum + "  p:" + pSlice + "  q:" + qSlice);
            System.out.println();
        return minSum;
        }

        private int arraySum(int[] myArray, int p, int q) {
            int sum = 0;
            if (myArray.length > 0)
                for (int i = p; i < q +1; i++) {
                    sum = sum + myArray[i];
                }
            return sum;
        }
    }


    public static void main(String[] args) {
        int[] A = {2,-4, 6, -3, 9};

        System.out.println(new Solution().solution(A));

    }
}
