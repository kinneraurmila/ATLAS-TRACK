//  RemoveDuplicatesFromArray
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {

    public static void main(String[] args) {
        // Original array with duplicate elements
        Integer[] originalArray = {1, 2, 3, 2, 4, 1, 5, 3};

        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Convert the array to a Stream, apply distinct(), and convert back to an array
        Integer[] uniqueArray = Arrays.stream(originalArray)
                .distinct() // Removes duplicate elements
                .toArray(Integer[]::new); // Converts the stream back to an array

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

//        // Example with Strings
//        String[] originalStringArray = {"apple", "banana", "apple", "orange", "banana"};
//        System.out.println("\nOriginal String Array: " + Arrays.toString(originalStringArray));
//
//        String[] uniqueStringArray = Arrays.stream(originalStringArray)
//                .distinct()
//                .toArray(String[]::new);
//
//        System.out.println("String Array after removing duplicates: " + Arrays.toString(uniqueStringArray));
    }
}
