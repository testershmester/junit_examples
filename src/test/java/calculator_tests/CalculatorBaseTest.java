package calculator_tests;

import calculator.Calculator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class CalculatorBaseTest {
    protected static Calculator calculator;

    private static Logger logger = LogManager.getLogger(CalculatorBaseTest.class);

    @BeforeClass
    public static void setUp() {
        logger.info("Will execute the method once, before the start of all tests." +
                "This can be used to perform time intensive activities, for example to connect to a database.");
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        logger.info("Code in this method will be executed after all tests. Even if they will be failed.");
        calculator = null;
    }
}
