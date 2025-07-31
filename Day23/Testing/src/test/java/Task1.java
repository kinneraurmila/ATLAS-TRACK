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
    public void testCheck() {
        int num1 = 5;
        int num2 = 5;
        assertSame(num1,num2);

    }
    @Test(timeout=500)
    public void testArrayEqual() {
        int []arr1 = {10,3,5};
        int [] arr2 = {10,3,5};
        assertArrayEquals(arr1,arr2);
    }
    @Test(expected = ArithmeticException.class)
    public void testSum(){
        int a=5, b=-6;
        int value =a+b;
        assertEquals(-1,value);

    }
}

