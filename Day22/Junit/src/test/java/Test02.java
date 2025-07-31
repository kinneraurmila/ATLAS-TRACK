import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions.assertEquals;
class Test02 {
    @Test
    @Tag("firstPriority")
    void testMethod01() {
       // System.out.println("method1 running");

    }

    @Test
    @Tag("lastPriority")
    void runTestcase02() {
        //System.out.println("method2 running");

    }
    @Tag("fastTag")
    void testMethod03() {
       // System.out.println("method3 running");

    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
      //  System.out.println("method4 running");


    }
}







