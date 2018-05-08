package ArrayTests;

public class DeepestPit {

    static class Solution {
//        A[P] > A[P+1] > ... > A[Q] (strictly decreasing) and
//
//        A[Q] < A[Q+1] < ... < A[R] (strictly increasing).
//        min{A[P] − A[Q], A[R] − A[Q]}.

        public int solution(int[] A) {
            int p = 0;
            int q = 0;
            int r = 0;

            int maxPit = -1;
            for (int i=0; i<A.length; i++) {
                for (int j=i+1; j<A.length; j++) {
                    if (A[j-1] <= A[j]) break;
                    for (int k=j+1; k<A.length; k++) {
                        if (A[k-1] >= A[k]) break;
                        if ((A[i] > A[j]) && (A[j] < A[k])) {
                            if (Math.min(A[i] - A[j], A[k] - A[j]) > maxPit) {
                                maxPit = Math.min(A[i] - A[j], A[k] - A[j]);
                                p = i;
                                q = j;
                                r = k;
                            }
                        }
                    }
                }
            }
            System.out.println("p:" + p + "  q:" + q + "  r:" +r);
            return maxPit;
        }
    }


    public static void main(String[] args) {
        int[] A =  new int[10];
        A[0] =  0;
        A[1] =  1;
        A[2] =  3;
        A[3] = -2;
        A[4] =  0;
        A[5] =  1;
        A[6] =  0;
        A[7] = -3;
        A[8] =  2;
        A[9] =  3;

        System.out.println(new Solution().solution(A));

    }
}
