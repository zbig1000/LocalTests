package CodeWars;

import java.math.BigDecimal;

public class GoingZeroOrInfinity {
    public static double going(int n) {
        final BigDecimal divider = factorial(n);
        final BigDecimal muliplier = factorialSum(n);

        BigDecimal bResult = muliplier.divide(divider, 6, BigDecimal.ROUND_DOWN);

        return bResult.doubleValue();
    }

    private static long small_factorial(int n) {
        if ((n > 1) && (n < 66)) return n * (small_factorial(n - 1));
        else return 1L;
    }

    private static long small_factorialSum(int n) {
        if ((n > 1) && (n < 59)) return small_factorial(n) + small_factorialSum(n - 1);
        else return 1L;
    }

    private static BigDecimal factorial(int n) {
        if (n >= 66) return new BigDecimal(n).multiply((factorial(n - 1)));
        else return new BigDecimal(small_factorial(n));
    }

    private static BigDecimal factorialSum(int n) {
        if (n >= 59) return factorial(n).add(factorialSum(n - 1));
        else return new BigDecimal(small_factorialSum(n));
    }

    public static void main(String args[]) {
        System.out.println(GoingZeroOrInfinity.going(2));
        System.out.println(GoingZeroOrInfinity.going(3));
        System.out.println(GoingZeroOrInfinity.going(6));
        System.out.println(GoingZeroOrInfinity.going(8));
        System.out.println(GoingZeroOrInfinity.going(10));
        System.out.println(GoingZeroOrInfinity.going(50));
        System.out.println(GoingZeroOrInfinity.going(60));
        System.out.println(GoingZeroOrInfinity.going(70));
        System.out.println(GoingZeroOrInfinity.going(90));
        System.out.println(GoingZeroOrInfinity.going(120));
    }

}
