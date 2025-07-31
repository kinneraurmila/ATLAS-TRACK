import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Tsk8_Test {
    Task8 obj = new Task8();


    @Test
    public void testGreater(){
        assertEquals(1 ,obj.compare(5,3));
    }
    @Test
    public void testLess(){
        assertEquals(-1 ,obj.compare(5,3));
    }

}
