package CodeWars;

import org.junit.Test;

public class BigDecimalTestSuite {

    @Test
    public void testCaseUsername(){
        //Given
        long start = System.nanoTime();
        //When
        GoingZeroOrInfinity.main(null);

        //Then
        long passed = System.nanoTime() - start;
        System.out.println("elapsed: "+ passed);
    }


}
