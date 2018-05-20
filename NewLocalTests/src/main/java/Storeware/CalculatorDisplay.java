package Storeware;

import java.io.IOException;

public class CalculatorDisplay {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("only one file allowed");
            System.exit(0);
        }

        try {
            String current = new java.io.File(".").getCanonicalPath();
            System.out.println("Current dir:" + current);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Operation operation = new Calculator().getChainedOperation(args[0]);

        if (operation != null) {
            System.out.print("result  " + operation.getValue());
        }
    }
}
