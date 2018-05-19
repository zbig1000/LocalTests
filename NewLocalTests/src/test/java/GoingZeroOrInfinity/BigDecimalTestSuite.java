package GoingZeroOrInfinity;

import org.junit.Test;

public class BigDecimalTestSuite {

    @Test
    public void testCaseBigDecimal(){
        //Given
        long start = System.nanoTime();
        //When
        GoingZeroOrInfinityBigDecimal.main(null);

        //Then
        long passed = System.nanoTime() - start;
        System.out.println("elapsed: "+ passed);
    }

    @Test
    public void testCaseArrays(){
        //Given
        long start = System.nanoTime();
        //When
        GoingZeroOrInfinityArrays.main(null);

        //Then
        long passed = System.nanoTime() - start;
        System.out.println("elapsed: "+ passed);
    }


}
