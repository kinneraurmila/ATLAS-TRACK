import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task8_Test {
    @Test
    public void compare() {
        Task8 obj = new Task8();
        int value = obj.compare(20, 10);
        Assertions.assertEquals(10, value);
    }

}
