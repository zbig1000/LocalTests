package ArrayTests;

public  class Coins3 {

    static int solution(int[] A) {

        int n = A.length;
        int result = 0;
        int resultOld = 0;

        for (int i = 0; i < n -1; i++) {
            if ((A[i] == A[i + 1]) && (A[i] > 0))
                result = (result == 0) ? (result +2) : (result + 1);
            else {
                resultOld = Math.max(result, resultOld);
                result = 0;
            }
        }
        result = Math.max(result, resultOld);

        int r = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 2) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1};



        System.out.println(new Coins3().solution(A));

    }

}
