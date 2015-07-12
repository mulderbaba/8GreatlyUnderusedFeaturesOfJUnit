package tr.com.t2.labs.tdd.sample2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * Created by mertcaliskan
 * on 17/06/15.
 */
public class TestNameTests {

    @Rule
    public TestName name = new TestName();

    @Test
    public void methodNameShouldBePrinted() {
        System.out.println("Test method name: " + name.getMethodName());
    }
}
