

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CheckEq {

    @Test
    public void testStringsAreEqual() {
        String expected = "Hello, World!";
        String actual = "HelloWorld!";

        // Assert that the two strings are equal
        assertEquals(expected, actual, "Strings are not equal!");
    }
}

