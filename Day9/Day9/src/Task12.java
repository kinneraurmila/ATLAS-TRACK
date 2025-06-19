import java.util.ArrayList;
    // import java.util.*;
    public class Task12 {
        public static void main(String args[]) {
            ArrayList<String> al = new ArrayList<>();
            al.add("Surkanti");
            al.add("SiriKrishna");
            System.out.println("Orignal List : " + al);

            al.add(1, "Hello");
            System.out.println("After Adding element at index 1 : "+ al);
            al.add(0,"hey");
            System.out.println("Aftering adding at index zero :" +al);

           al.remove(0);
           System.out.println("Element removed from index 0 : "+ al);

            al.remove("Prasunamba");
            System.out.println("Element Prasunamba removed : "+ al);

            al.set(0, "K");
            System.out.println("List after updation of value : "+al);
        }
    }
