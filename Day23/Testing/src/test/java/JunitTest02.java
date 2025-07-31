import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTest02 {
    @Test
    public void testMultiply(){
        int a= 5,b=5;
        assertEquals(65,a*b);
    }
}
