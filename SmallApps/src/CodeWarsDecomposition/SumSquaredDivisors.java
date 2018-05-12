package CodeWarsDecomposition;

import java.util.LinkedList;
import java.util.List;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        String result = "";
        if ((m < 1) || (n < 1) || (m > n)) return "";

        for (long j = m; j <= n; j++) {
            List<Long> dividers = new LinkedList();
            for (long i = 1; i <= j; i++) {
                if (j % i == 0) dividers.add(i);
            }
            Long squareSum = dividers.stream().map(a -> a * a).reduce(0L, (sum, current) -> sum += current);

            if ((Math.sqrt(squareSum)) == Math.round(Math.sqrt(squareSum)))
                if (result == "") result = "[" + j + ", " + squareSum + "]";
                else result += ", [" + j + ", " + squareSum + "]";
        }
        result = "[" + result + "]";
        return result;
    }

    public static void main(String args[]) {
        System.out.println(listSquared(1, 1000));
    }
}
