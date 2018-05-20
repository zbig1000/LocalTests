package Storeware;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StorwareCalculatorTestSuite {
    @Test
    public void testCalculatorFinal4(){
        //Given
        String file = "A:/JAVA_LOCAL/LocalTests/NewLocalTests/src/main/resources/instructions4.txt";
        //When
        Calculator calculator = new Calculator();
        double result = calculator.getChainedOperation(file).getValue();
        //Then
        Assert.assertEquals(1003.00d, result, 0.0001d);
    }

    @Test
    public void testAddClass(){
        //Given
        Apply applyMock = mock(Apply.class);
        when(applyMock.getValue()).thenReturn(11.00d);
        Add addOperation = new Add(applyMock, 5d);
        //When
        Double result = addOperation.getValue();

        //Then
        Assert.assertEquals(16d, result, 0.001d);
    }
    @Test
    public void testSubstractClass(){
        //Given
        Apply applyMock = mock(Apply.class);
        when(applyMock.getValue()).thenReturn(11.00d);
        Substract substractOperation = new Substract(applyMock, 5d);
        //When
        Double result = substractOperation.getValue();

        //Then
        Assert.assertEquals(6d, result, 0.001d);
    }
}
