package tr.com.t2.labs.tdd.sample5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Created by mertcaliskan
 * on 12/07/15.
 */
public class LongRunningTests {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    @Test
    public void whatWeDoInATestMethodEchoesInEternity() {
        while(true);
    }
}
