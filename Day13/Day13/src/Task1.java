import java.util.LinkedList;
public class Task1 {
    public static void main(String[] args){
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add ("banana");
        fruits.add ("guava");
        fruits.add ("apple");
        fruits.addFirst ("popaya");
        fruits.addLast ("grapes");
        System.out.println("first element :" + fruits.getFirst());
        System.out.println("last element :" + fruits.getLast());

        fruits.removeFirst();
        fruits.removeLast();
        for(String fruit :fruits){
            System.out.println("list :" + fruit);

        }

    }
}
