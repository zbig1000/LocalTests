package Stroreware;

import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Calculator {

    public static void main(String[] args) {
        if (args.length !=1) {
            System.out.println("only one file allowed");
            System.exit(0);
        }

        System.out.println("args : " + args[0]);
        ArrayDeque arrayDeque = CalculatorReader.getArrayDeque(args[0]);


//        ArrayDeque arrayDeque = CalculatorReader.getArrayDeque("instructions1.txt");

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = null;

        StringTokenizer st = new StringTokenizer((String) arrayDeque.pollFirst());
        String intruction = st.nextToken();
        double value = new Double(st.nextToken()).doubleValue();

        operation = operationFactory.createOperation(intruction, value, operation);

        while (!arrayDeque.isEmpty()) {
            st = new StringTokenizer((String) arrayDeque.pollFirst());

            while (st.hasMoreTokens()) {
                intruction = st.nextToken();
                value = new Double(st.nextToken()).doubleValue();

                operation = operationFactory.createOperation(intruction, value, operation);
            }
        }
        if (operation != null) {
            System.out.print("result  " + operation.getValue());
        }
    }
}