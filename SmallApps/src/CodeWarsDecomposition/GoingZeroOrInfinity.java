package CodeWarsDecomposition;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.math.BigDecimal;

public class GoingZeroOrInfinity {
    public static double going(int n) {

        final BigDecimal divider =  factorial(n);
        final BigDecimal muliplier = factorialSum(n);

//        BigDecimal bResult = divideBigDecimls(muliplier, divider);
//        bResult = bResult.divide(new BigDecimal(1), 6, BigDecimal.ROUND_DOWN);

        BigDecimal bResult = muliplier.divide(divider, 8, BigDecimal.ROUND_HALF_UP );
        bResult = bResult.divide(new BigDecimal(1), 6, BigDecimal.ROUND_DOWN);


        return bResult.doubleValue();
    }

//    private static BigDecimal divideBigDecimls(BigDecimal a, BigDecimal b) {
//        BigDecimal result = BigDecimal.ZERO;
//
//        BigDecimal resultDIV = BigDecimal.ZERO;
//
//        for (int i =0; i<15; i++) {
//            BigDecimal newMultiplier = a.multiply(new BigDecimal(Math.pow(10D, i)));
//            BigDecimal newPrecision = new BigDecimal(Math.pow(10D, i));
//
//            resultDIV = newMultiplier.divide(b, 0, BigDecimal.ROUND_DOWN);
//            result = result.add(resultDIV).divide(newPrecision);
//        }
//        return result;
//    }

    private static long small_factorial(int n) {
        if ((n>1) && (n<59)) return n *(small_factorial(n-1));
        else return  1L;
    }
    private static long small_factorialSum(int n) {
        if ((n>1) && (n<59)) return small_factorial(n) + small_factorialSum(n-1);
        else return  1L;
    }

    private static BigDecimal factorial(int n) {
        if (n>=59) return new BigDecimal(n).multiply((factorial(n-1)));
            else return new BigDecimal(small_factorial(n));
    }
    private static BigDecimal factorialSum(int n) {
        if (n>=59) return factorial(n).add(factorialSum(n-1));
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
