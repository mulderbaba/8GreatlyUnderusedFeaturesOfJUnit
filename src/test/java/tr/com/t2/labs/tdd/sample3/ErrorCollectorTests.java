package tr.com.t2.labs.tdd.sample3;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mertcaliskan
 * on 17/06/15.
 *
 * Demonstrates ErrorCollector creation
 */
public class ErrorCollectorTests {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void statementsAssertedAndErrorsCollectedSuccessfully() {
        String s = null;
        collector.checkThat("Value should not be null", null, is(s));
        s = "";
        collector.checkThat("Value should have the length of 1", s.length(), is(1));
        s = "Junit!";
        collector.checkThat("Value should have the length of 10", s.length(), is(10));
    }
}
