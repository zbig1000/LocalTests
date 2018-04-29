package Recurrent;

public class AppRunner {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println(sumCalculator.sum(5));

        FiboPrinter fiboPrinter = new FiboPrinter(3);
        fiboPrinter.printer(4);
        fiboPrinter.printer(12);
        fiboPrinter.printer(6);
        fiboPrinter.printer(12);
    }


}
