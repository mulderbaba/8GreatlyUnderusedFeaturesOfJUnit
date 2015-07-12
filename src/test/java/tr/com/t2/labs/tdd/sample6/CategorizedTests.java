package tr.com.t2.labs.tdd.sample6;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by mertcaliskan
 * on 11/07/15.
 */
public class CategorizedTests {

    @Test
    @Category(SlowTests.class)
    public void thisTestRunsSlowly() {
        System.out.println("Slow test running");
    }

    @Test
    public void thisTestRunsFast() {
        System.out.println("Fast test running");
    }
}
