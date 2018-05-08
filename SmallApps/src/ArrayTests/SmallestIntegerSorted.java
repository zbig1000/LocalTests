package ArrayTests;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestIntegerSorted {
    public int solution(int[] A) {
        int result = 1;

        Arrays.sort(A);

        for (int i=0; i<A.length ; i++ ) {
            if (A[i] >0 ) {
                if (A[i] == result) {
                    result++;
                    if (result < A[i]) break;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[] A = {4, 3, 6, 1, 2,5,8};

//        Arrays.sort(A);
//
//        for (int i=0; i<A.length; i++) {
//            System.out.println(A[i]);
//        }

        System.out.println(new SmallestIntegerSorted().solution(A));

    }
}
