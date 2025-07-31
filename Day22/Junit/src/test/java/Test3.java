import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3 {



    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        return -1;

    }

    @Test
    public void compare() {
        Test3 obj = new Test3();
        int value = obj.compare(20, 10);
        Assertions.assertEquals(10, value);
    }
}

