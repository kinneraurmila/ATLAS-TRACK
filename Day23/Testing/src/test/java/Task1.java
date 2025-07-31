import org.junit.Test;

import static org.junit.Assert.*;

public class Task1 {
    @Test
    public void testSubtract() {
        int num1 = 10;
        int num2 = 5;
        int res = num1 - num2;
        assertEquals(5, res);
    }
    @Test
    public void testcompare() {
        int num1 = 10;
        int num2 = 5;
        assertNotSame("checking assert not same :"+ num1,num2);
    }
    @Test
    public void testString() {
        String str1 = "kinnera";
        String str2 = "Siri";
        assertNotSame("checking assert not same :"+ str1,str2);
    }
    @Test
    public void testStringSame() {
        String str1 = "siri";
        String str2 = "Siri";
        assertSame("checking assert not same :"+ str1,str2);
    }
    @Test
    public void testCheck() {
        int num1 = 5;
        int num2 = 5;
        assertSame(num1,num2);

    }
    @Test
    public void testArrayEqual() {
        int []arr1 = {10,3,5};
        int [] arr2 = {10,3,5};
        assertArrayEquals(arr1,arr2);
    }
    @Test(expected = ArithmeticException.class)
    public void testSum(){
       int result=10/0;
       int res=10/1;

    }
}

