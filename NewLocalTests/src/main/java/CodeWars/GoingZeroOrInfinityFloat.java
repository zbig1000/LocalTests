package CodeWars;

public class GoingZeroOrInfinityFloat {
    public static double going(int n) {
        return (double)((long)(recurring(n) * 1000000)) / 1000000;
    }

    private static double recurring(int n) {
        if (n>1) return 1D + recurring(n-1)/n;
        else return 1D;
    }

    public static void main(String args[]) {

        System.out.println(GoingZeroOrInfinityFloat.going(2));
        System.out.println(GoingZeroOrInfinityFloat.going(3));
        System.out.println(GoingZeroOrInfinityFloat.going(6));
        System.out.println(GoingZeroOrInfinityFloat.going(8));
        System.out.println(GoingZeroOrInfinityFloat.going(10));
        System.out.println(GoingZeroOrInfinityFloat.going(50));
        System.out.println(GoingZeroOrInfinityFloat.going(60));
        System.out.println(GoingZeroOrInfinityFloat.going(70));
        System.out.println(GoingZeroOrInfinityFloat.going(90));
        System.out.println(GoingZeroOrInfinityFloat.going(120));

    }

//    private static final double precision = 1000000.0;
//
//    public static double going(int n) {
//        double result = 1;
//
//        for (double i = n; n > 1; i *= --n) {
//            result += 1 / i;
//        }
//
//        return (double)((long) (result * precision)) / precision;
//    }
//}
//public static double going(int n) {
//    if( n==1){
//        return 1;
//    }
//    return Math.floor(((going(n-1)/n)+1) * 1000000) / 1000000;
//}

}

