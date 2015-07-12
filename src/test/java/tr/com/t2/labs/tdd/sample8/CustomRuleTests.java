package tr.com.t2.labs.tdd.sample8;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by mertcaliskan
 * on 12/07/15.
 */
public class CustomRuleTests {

    @Rule
    public MyCustomRule myCustomRule = new MyCustomRule("custom");

    @Test
    public void myAwesomeMethodInvokedSuccessfully() {
        System.out.println("Test worked OK");
    }
}
