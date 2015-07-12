package tr.com.t2.labs.tdd.sample7;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertcaliskan
 * on 12/07/15.
 */
public class ExpectedExceptionTests {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void arrayIndexIsOutOfBoundsExceptionIsThrown() {
        exception.expect(IndexOutOfBoundsException.class);
        List list = new ArrayList();
        list.get(0);
    }

    @Test
    public void arrayIndexIsOutOfBoundsExceptionIsThrownWithGivenMsg() {
        exception.expectMessage("Index: 3, Size: 0");
        List list = new ArrayList();
        list.get(3);
    }
}
