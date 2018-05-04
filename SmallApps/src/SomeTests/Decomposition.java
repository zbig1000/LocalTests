package SomeTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Decomposition {

    public static String decomp(int n) {
        List<Integer> base = new ArrayList<>();
        List<Integer> power = new ArrayList<>();

        if (n < 2) return "";
        for (int i =2; i<=n; i++) {

            for (int j = 2; j <= i; j++ ) {
                int main_divider = i;
                int small_divider = j;
                while (main_divider > 1) {
                        int divider = findDividerGreaterThan(main_divider, small_divider);
                        addDividerToResults(divider, base, power);
                        main_divider = main_divider / divider;
                }
                break;
            }
        }
        String result = "";
        for (int i=0; i <base.size(); i++) {
            result = (i == 0) ? (base.get(i) + ((power.get(i) == 1) ? ("") : ("^" + power.get(i))))
                    : (result + " * " +base.get(i) + ((power.get(i) == 1) ? ("") : ("^" + power.get(i))));
        }
        return result;
    }

    private static void addDividerToResults(int divider, List<Integer> base, List<Integer> power) {
        int currentRecord = findDividerInResults(base, divider);

        if (( currentRecord< base.size()) && (base.size() >0) && (currentRecord>=0) ) {
            power.set(currentRecord, power.get(currentRecord) +1);
        } else {
            base.add(divider);
            power.add(1);
        }
    }

    private static int findDividerGreaterThan(int source, int startingDivider) {
        for (int i = startingDivider; i <source; i++) {
            if ((source % i) == 0)  return i;
        }
        return source;
    }

    private static int findDividerInResults(List resultList, Integer divider) {
        return Optional.ofNullable(resultList.indexOf(divider)).orElse(resultList.size());
    }

    public static void main(String args[]) {

        System.out.println(decomp(25));




    }

}
