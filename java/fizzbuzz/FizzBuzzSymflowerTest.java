package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.*;

public class FizzBuzzSymflowerTest {
    @Test
    public void fizzBuzz1() {
        int x = 0;
        String expected = "";

        String actual = fizzBuzz(x);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzz2() {
        int x = 1;
        String expected = "1\n";

        String actual = fizzBuzz(x);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fizzBuzzN3() throws IllegalArgumentException {
        int x = 0;

        String actual = fizzBuzzN(x);
    }

    @Test
    public void fizzBuzzN4() {
        int x = 1;
        String expected = "1";

        String actual = fizzBuzzN(x);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzN5() {
        int x = 15;
        String expected = "FizzBuzz";

        String actual = fizzBuzzN(x);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzN6() {
        int x = 3;
        String expected = "Fizz";

        String actual = fizzBuzzN(x);

        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzN7() {
        int x = 5;
        String expected = "Buzz";

        String actual = fizzBuzzN(x);

        assertEquals(expected, actual);
    }
}
