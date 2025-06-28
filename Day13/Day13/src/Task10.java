import java.util.LinkedList;
import java.util.Iterator;
public class Task10 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(42);
        list.add(89);
        System.out.println("given list:" + list);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("value :" + iterator.next());

        }
    }
}
