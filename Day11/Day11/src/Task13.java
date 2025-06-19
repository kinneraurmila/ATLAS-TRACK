// Java Program to Sort an ArrayList
// import java.util package
import java.util.*;
class Task13 {
    // Main driver method
    public static void main(String[] args)
    {
        // Define an objects of ArrayList class
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements to the ArrayList
        list.add("reshu");
        list.add("venkat");
        list.add("Suvarna");
        list.add("krishna");
        list.add("kumar");
        list.add("siri");

        // Printing the unsorted ArrayList
        System.out.println("Before Sorting : " + list);

        // Sorting ArrayList in ascending Order
        Collections.sort(list);

        // printing the sorted ArrayList
        System.out.println("After Sorting : " + list);



    }

}