package CodeWarsDecomposition;

import java.util.*;

public class TheSupermarketQueue2 {
    public static int solveSuperMarketQueue(int[] customers, Integer n) {

        int[] checkDesks = new int[n];
        Arrays.fill(checkDesks, 0);
        for (int customer : customers) {
            checkDesks[findTheLowest(checkDesks)] += customer;
        }

        OptionalInt result = Arrays.stream(checkDesks).max();
        return result.getAsInt();
    }

    private static Integer findTheLowest(int[] localChecks) {
        OptionalInt lowest = Arrays.stream(localChecks).min();
        for (int i = 0; i < localChecks.length; i++) {
            if (localChecks[i] == lowest.getAsInt()) return i;
        }
        return 0;
    }

    public static void main(String args[]) {
        int[] testArray = {3, 4, 5};
        System.out.println(TheSupermarketQueue2.solveSuperMarketQueue(testArray, 2));
    }

//                if((customers.length == 0) || (n == 0)) return 0;
//    int sum = IntStream.of(customers).sum();
//            if(n == 1) return sum;
//
//    int times[] = new int[n];
//
//            for (int client: customers){
//        Arrays.sort(times);
//        times[0] += client;
//    }
//            return Arrays.stream(times).max().getAsInt();


//    final PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.nCopies(n, 0));
//        for (int customer : customers) queue.add(queue.poll() + customer);
//        return Collections.max(queue);

}
