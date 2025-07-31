import org.junit.Test;

public class TimeCheck {
    @Test(timeout = 1000)
    public void testTimeoutFail()throws InterruptedException{
        Thread.sleep(200);
        System.out.println("test passed within timeout");

    }
}
