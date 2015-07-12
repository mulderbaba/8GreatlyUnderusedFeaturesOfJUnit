package tr.com.t2.labs.tdd.sample4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mertcaliskan
 * on 18/06/15.
 */
@RunWith(Parameterized.class)
public class FibonacciNumbersTests {

    @Parameterized.Parameters
    public static List data() {
        return Arrays.asList(new Object[][] {{0, 0}, {1, 1}, {2, 1},
                {3, 2}, {4, 3}, {5, 5}, {6, 8}});
    }

    private int value;
    private int expected;

    public FibonacciNumbersTests(int input, int expected) {
        value = input;
        this.expected = expected;
    }

    @Test
    public void fibonacciNumberCalculationShouldWorkForTheGivenInput() {
        assertEquals(expected, fib(value));
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}