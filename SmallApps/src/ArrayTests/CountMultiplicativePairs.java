package ArrayTests;

public class CountMultiplicativePairs {
    static class Solution {
        public int solution(int[] A, int[] B) {
            int pairCount = 0;

            for (int i=0; i <A.length ; i++) {
                for (int j = i + 1 ; j < A.length ; j++) {
                    if (((A[i] + B[i]/1000000) * (A[j] + B[j]/1000000)) >= ((A[i] + B[i]/1000000) + (A[j] + B[j]/1000000))) {
                        pairCount++ ;
                        if (pairCount > 1000000000) return 1000000000;
                    }
                }
            }
        return pairCount;
        }
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 5};
        int[] B = {500000, 500000, 0, 0, 20000};

        System.out.println(new Solution().solution(A, B));

    }
}