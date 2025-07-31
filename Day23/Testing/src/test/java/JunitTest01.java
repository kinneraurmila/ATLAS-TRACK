import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class JunitTest01 {

      @Test
        public void testAdd(){
            int number1= 5,number2=4;
            // int number=number1*number2;
            assertEquals(9,number1+number2);
        }

}
