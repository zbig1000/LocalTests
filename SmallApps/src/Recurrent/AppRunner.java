package Recurrent;

public class AppRunner {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(5));

        FiboPrinter fiboPrinter = new FiboPrinter();
        fiboPrinter.printer(4);

    }


}
