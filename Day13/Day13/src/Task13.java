import java.util.LinkedList;
//import java.util.Spliterators;
import java.util.Spliterator;
public class Task13 {
    public static void main(String[] args) {

        LinkedList<String> lobj = new LinkedList<>();

        lobj.add("Kinneraa");
        lobj.add("Surkanti");
        lobj.add("KK");
        lobj.add("Kumar");


        Spliterator<String> sitobj = lobj.spliterator();

        System.out.println("spliting :");
        sitobj.forEachRemaining(System.out::println);




    }
}






