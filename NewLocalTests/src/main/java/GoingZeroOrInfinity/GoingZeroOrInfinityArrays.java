package GoingZeroOrInfinity;

import java.math.BigDecimal;
import java.util.*;

public class GoingZeroOrInfinityArrays {
    private static final int[] lastArray = {1};

    public static double going(int n) {
        final int[] dividerArray = factorialArray(n);
        final int[] muliplierArray = factorialArraySUM(n);

        final BigDecimal dividerB = new BigDecimal(convertArrayToString(dividerArray));
        final BigDecimal muliplierB = new BigDecimal(convertArrayToString(muliplierArray));

        BigDecimal bResult = muliplierB.divide(dividerB, 6, BigDecimal.ROUND_DOWN);
        return bResult.doubleValue();
    }

    private static int[] convertIntToArray(int number) {
        String stringNumber = (new Integer(number)).toString().trim();
        int strLenght = stringNumber.length();
        int[] resultArray = new int[strLenght];

        for (int i = 0; i < strLenght; i++) {
            resultArray[i] = Character.getNumericValue(stringNumber.charAt(strLenght - i - 1));
        }
        return resultArray;
    }

    private static int[] factorialArray(int n) {
        if (n > 1)
            return multiplayArrays(convertIntToArray(n), factorialArray(n - 1));
        else return lastArray;
    }

    private static int[] factorialArraySUM(int n) {
        if (n > 1)
            return sumArrays(factorialArray(n), factorialArraySUM(n - 1));
        else return lastArray;
    }

    private static String convertArrayToString(int[] tempList) {
        StringBuilder newStringNumber = new StringBuilder("");
        Arrays.stream(tempList).forEach(a -> newStringNumber.append(a));
        String newStringNumber2 = newStringNumber.reverse().toString();
        return newStringNumber2;
    }

    public static int[] multiplayArrays(final int[] A, final int[] B) {
        int[] resultList = new int[A.length + B.length];
        Arrays.fill(resultList, 0);

        int Alength = A.length;
        int Blength = B.length;
        Integer tempresult = 0;

        for (int i = 0; i < Alength; i++) {
            for (int j = 0; j < Blength; j++) {
                tempresult = A[i] * B[j];
                updateArray(resultList, tempresult, i + j);
            }
        }
        return resultList;
    }

    public static int[] sumArrays(final int[] A, final int[] B) {
        int lenght = (A.length > B.length) ? (A.length + 1) : (B.length + 1);
        int[] resultArray = new int[lenght];
        Arrays.fill(resultArray, 0);

        int Alength = A.length;
        int Blength = B.length;

        for (int i = 0; i < Alength; i++) {
            updateArray(resultArray, A[i], i);
        }
        for (int j = 0; j < Blength; j++) {
            updateArray(resultArray, B[j], j);
        }
        return resultArray;
    }

    private static void updateArray(int[] arrayToUpdate, Integer number, int index) {
        int current;
        int tempNumber = number;
        for (int i = index; i < arrayToUpdate.length; i++) {
            current = arrayToUpdate[i];
            if ((current + tempNumber) < 10) {                   // 1 digit
                arrayToUpdate[i] = current + tempNumber;
                return;
            }
            if ((current + tempNumber) > 99) {                 // 3 digits
                arrayToUpdate[i] = (current + tempNumber) % 100;
                tempNumber = (current + tempNumber) / 100;

            } else {                                            // 2 digits
                arrayToUpdate[i] = (current + tempNumber) % 10;
                tempNumber = (current + tempNumber) / 10;
            }
        }
    }

    public static void main(String args[]) {
        System.out.println(GoingZeroOrInfinityArrays.going(2));
        System.out.println(GoingZeroOrInfinityArrays.going(3));
        System.out.println(GoingZeroOrInfinityArrays.going(6));
        System.out.println(GoingZeroOrInfinityArrays.going(8));
        System.out.println(GoingZeroOrInfinityArrays.going(10));
        System.out.println(GoingZeroOrInfinityArrays.going(50));
        System.out.println(GoingZeroOrInfinityArrays.going(60));
        System.out.println(GoingZeroOrInfinityArrays.going(70));
        System.out.println(GoingZeroOrInfinityArrays.going(90));
        System.out.println(GoingZeroOrInfinityArrays.going(120));
    }
}