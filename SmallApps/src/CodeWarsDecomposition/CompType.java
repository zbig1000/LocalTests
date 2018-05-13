package CodeWarsDecomposition;

import java.util.Arrays;
import java.util.Random;

public class CompType implements Comparable {
    int i;
    int k;

    public CompType(int i, int k) {
        this.i = i;
        this.k = k;
    }

    @Override
    public int compareTo(Object o) {
        int rvi= ((CompType)o).i;
        return (i> rvi) ? (1) : ((i<rvi) ? (-1) : (0)) ;
    }

    @Override
    public String toString() {
        return "CompType{" +
                "i=" + i +
                ", k=" + k +
                '}';
    }

    private static Random r = new Random();

    private static int randInt() {
        return Math.abs(r.nextInt()) % 100;
    }

    public static CompType generator() {
        return new CompType(randInt(), randInt());
    }

    public static void main(String args[]) {
        CompType[] a = new CompType[10];
        for (int i =0; i<a.length; i++) {
            a[i] = generator();
        }

        Arrays.stream(a).forEach(System.out::println);
        System.out.println("po sortowaniu");
        Arrays.sort(a);
        Arrays.stream(a).forEach(System.out::println);

    }

}

