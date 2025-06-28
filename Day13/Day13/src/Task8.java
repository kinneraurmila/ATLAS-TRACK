import java.util.LinkedList;
public class Task8 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.add("dko45");
        list.add("dtgh");
        list.add("dsfy");
        list.add("ghjtv");
        list.add("asdrrtc");

        System.out.println("list elements :" +list );

        String[] array= list.toArray(new String[0]);

        for (String names:array){
            System.out.println("After coversion arraylist elements :" + names);
        }

    }
}
