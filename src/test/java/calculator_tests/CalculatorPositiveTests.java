package calculator_tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.*;


public class CalculatorPositiveTests extends CalculatorBaseTest {

    private static Logger logger = LogManager.getLogger(CalculatorPositiveTests.class);

    @Before
    public void beforeEachTest() {
        logger.info("Code in this method will be executed before each test.");
    }

    @After
    public void afterEachTest() {
        logger.info("Code in this method will be executed after each test.");
    }

    @Test
    public void testSum() {
        int result = calculator.sum(3, 4);
        Assert.assertEquals("The result is not correct", 7, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiplication(3, 4);
        Assert.assertEquals("The result should be 12", 12.1, result, 0.15);
    }

    @Test
    public void testEqual() {
        boolean result = calculator.equalIntegers(20, 20);
        Assert.assertTrue("The result should be true", result);
    }
}
