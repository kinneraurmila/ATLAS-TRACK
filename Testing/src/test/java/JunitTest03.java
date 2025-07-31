import org.junit.Ignore;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;

public class JunitTest03 {

    @Test
    public void testSubtract(){
        int a= 15,b=5;
        assertEquals(10,a-b);
        System.out.println("ignore test case");
    }
}
