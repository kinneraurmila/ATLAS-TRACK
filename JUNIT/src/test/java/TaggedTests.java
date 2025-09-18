import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaggedTests {
    @Test
    @Tag("fast")
    void testFastOperation() {
        // Simulate a fast test
        assertEquals(2, 1 + 1);
        System.out.println("Fast test executed");
    }

    @Test
    @Tag("slow")
    void testSlowOperation() throws InterruptedException {
        // Simulate a slow test
        Thread.sleep(2000); // Simulating delay
        assertEquals(5, 3 + 2);
        System.out.println("Slow test executed");
    }
}

