package calculator_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorParametrizedTests extends CalculatorBaseTest {
    public int firstParameter;
    public int secondParameter;

    public CalculatorParametrizedTests(int firstParameter, int secondParameter, int expectedResult) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.expectedResult = expectedResult;
    }

    public int expectedResult;

    @Test
    public void testMultiplication() {
        int actResult = calculator.multiplication(firstParameter, secondParameter);
        Assert.assertEquals("The result should be " + expectedResult, expectedResult, actResult);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0, 1, 0}, {-1, 1, -1}, {-10, -10, 100}};
        return Arrays.asList(data);
    }
}
