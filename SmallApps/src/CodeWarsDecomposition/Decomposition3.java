package CodeWarsDecomposition;

import java.util.stream.*;

public class Decomposition3 {

    public static boolean isPrime(int n) {
        return !IntStream.range(2, n).filter(i->n%i==0).findFirst().isPresent();
    }

    public static int c(int p, int n) {
        int t = 0;
        for (; n%p == 0; n/=p, t++) ;
        return t;
    }

    public static String count(int p, int n) {
        long c = IntStream.range(2, n+1).map(i->c(p, i)).sum();
        return "" + p + (c == 1 ? "" : "^" + c);
    }

    public static String decomp(int n) {
        return IntStream.range(2, n+1).filter(Decomposition3::isPrime)
                .mapToObj(i->count(i, n)).collect(Collectors.joining(" * "));
    }

    public static void main(String args[]) {
        System.out.println(decomp(12));
    }
}
