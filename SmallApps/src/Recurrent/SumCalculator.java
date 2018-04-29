package Recurrent;

public class SumCalculator {

    public int sum(int a) {
        if (a > 0){ return a + sum(a-1); }
            else return 0;

    }
}
