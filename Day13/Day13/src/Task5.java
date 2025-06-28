import java.util.LinkedList;
import java.util.List;
public class Task5 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(78);
        list.add(58);
        list.add(80);
        list.add(28);
        list.add(13);

        System.out.println(list);

        list.set(2,90);
        System.out.println(list);
    }
}
