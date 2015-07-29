package tr.com.t2.labs.tdd.sample7;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by mertcaliskan
 * on 12/07/15.
 */
public class MyCustomRule implements TestRule {

    private String label;

    public MyCustomRule(String label) {
        this.label = label;
    }

    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable
            {
                System.out.println(label + " before");
                base.evaluate();
                System.out.println(label + " after");
            }
        };
    }
}
