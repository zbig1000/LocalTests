package CodeWarsDecomposition;

public class Decomposition {
    public static String decomp(int n) {

        int[] exponentsOfPrimes = new int[n+1];
        while (n>1) {
        int x = n--;
        for (int i=2; i<=Math.sqrt(x); i++)
            if (x % i == 0) {
                x /= i;
                exponentsOfPrimes[i]++;
                i = 1;
            }
        exponentsOfPrimes[x]++;
    }
    StringBuilder result = new StringBuilder();
        for (int i = 2; i < exponentsOfPrimes.length; i++) {
        if (exponentsOfPrimes[i] == 0) continue;
        if (exponentsOfPrimes[i] == 1) result.append(i + " * ");
        if (exponentsOfPrimes[i] >  1) result.append(i + "^" + exponentsOfPrimes[i] + " * ");
    }
        return result.substring(0,result.length()-3);
}

    public static void main(String args[]) {
        System.out.println(decomp(8));
    }

}
