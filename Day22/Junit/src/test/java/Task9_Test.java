import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task9_Test {
    Task9 obj=new Task9();

    @Test
    public void testGreater(){
        assertEquals(1 ,obj.compare(5,1));
    }
    @Test
    public void testLess(){
        assertEquals(-1 ,obj.compare(5,9));
    }
    @Test
    public void testElse(){
        assertEquals(0 ,obj.compare(3,3));
    }
}
