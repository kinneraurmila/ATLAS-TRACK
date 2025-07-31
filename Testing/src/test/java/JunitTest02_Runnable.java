import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JunitTest02_Runnable {
    public static void main(String[] args){

        Result resobj = JUnitCore.runClasses(Task2.class);
        for (Failure fobj : resobj.getFailures()) {
            System.out.println(fobj.toString());
        }
        System.out.println(resobj.wasSuccessful());

    }
}
