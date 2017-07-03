package calculator_tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorNegativeTests extends CalculatorBaseTest {

    private static Logger logger = LogManager.getLogger(CalculatorPositiveTests.class);

    @Test(expected = Exception.class)
    public void testDivisionException() {
        logger.debug("Test for division");
        calculator.division(10, 0);
        logger.error("Exception has not been thrown");
    }

    @Ignore
    @Test(timeout = 2000) //just to show timeout!!!
    public void testTimeout() {
        logger.debug("Test to show how timeout works");
        while (true) ;
    }
}
