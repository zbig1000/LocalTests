package CodeWarsDecomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Decomposition2 {

    public static String decomp(int n) {
        List<Integer> base = new ArrayList<>();
        List<Integer> power = new ArrayList<>();

        if (n < 2) return "";
        for (int i =2; i<=n; i++) {

            for (int j = 2; j <= i; j++ ) {
                int main_divider = i;
                int small_divider = j;
                while (main_divider > 1) {
                    int divider = 0;

                    for (int m = small_divider; m <=main_divider; m++) {
                        if ((main_divider % m) == 0)  {
                            divider = m;
                            break;
                        }
                    }
                    int currentRecord = Optional.ofNullable(base.indexOf(divider)).orElse(base.size());
                    if (( currentRecord< base.size()) && (base.size() >0) && (currentRecord>=0) ) {
                        power.set(currentRecord, power.get(currentRecord) +1);
                    } else {
                        base.add(divider);
                        power.add(1);
                    }
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

    public static void main(String args[]) {
        System.out.println(decomp(12));
    }

}
