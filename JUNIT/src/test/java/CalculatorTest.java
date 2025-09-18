
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    @Test
    void addition() {
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}