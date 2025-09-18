
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringEqualityTest {

    @Test
    void testStringsAreEqual() {
        String expected = "Hello, World!";
        String actual = "Hello, World!";

        assertEquals(expected, actual, "Strings are not equal!");
    }
}
