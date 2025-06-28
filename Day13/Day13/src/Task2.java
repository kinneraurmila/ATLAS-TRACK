
public class Task2{
    public static void main(String[] args) {

        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add(12);
        list.add(57);
        list.addFirst(78);
        list.add(90);
        list.addLast(34);
        list.addLast(64);


        System.out.println( " LinkedList : ");
        for(int i=0;i< list.size();i++){
            System.out.println("My LinkedList keys :" + list.get(i));
        }
        list.traverse();

        System.out.println("First Element: " + list.get(0));
        System.out.println("Size: " + list.size());

        list .removeFirst();


        System.out.println("First Element after removal: " + list.get(0));
        System.out.println("Size after removal: " + list.size());

        list .removeLast();

        System.out.println("Size after end removal: " + list.size());
        list.traverse();


       // System.out.println("First Element after removal: " + list.get(5));

    }
}



