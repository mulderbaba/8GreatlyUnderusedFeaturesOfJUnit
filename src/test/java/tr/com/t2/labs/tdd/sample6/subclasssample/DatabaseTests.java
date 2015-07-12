package tr.com.t2.labs.tdd.sample6.subclasssample;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by mertcaliskan
 * on 12/07/15.
 */
public class DatabaseTests {

    @Test
    @Category(IntegrationTests.class)
    public void thisIsAnIntegrationTest() {
        System.out.println("Integration test running");
    }

    @Test
    public void thisIsNotAnIntegrationTest() {
        System.out.println("Normal test running");
    }
}
