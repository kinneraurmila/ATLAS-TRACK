import java.util.LinkedList;
public class Task9 {
    public static void main(String[] args){
        LinkedList<String>food= new LinkedList<>();
        food.add("biryani");
        food.add("roti");
        food.add("rice");
        food.add("curry");
        food.add("jaavava");

        System.out.println("FIrst linked list: " + food);

        LinkedList<String>food2= (LinkedList<String>) food.clone();

        System.out.println("second linked list after clone : " + food2);


    }
}
