package tr.com.t2.labs.tdd.sample9;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import tr.com.t2.labs.tdd.sample8.MyCustomRule;

/**
 * Created by mertcaliskan
 * on 12/07/15.
 */
public class RuleChainTests {

    @Rule
    public RuleChain chain = RuleChain.outerRule(new MyCustomRule("outer")).around(new MyCustomRule("inner"));

    @Test
    public void ruleChainWorkedOK() {
        System.out.println("Test worked OK");
    }
}
