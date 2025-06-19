import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7{

    public static void main(String[] args) {
        // Create an ArrayList to store 5 integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Calculate the square of each number using streams and display the results
        List<Integer> squareOfNums = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Original numbers: " + numbers);
        System.out.println("Squares of numbers: " + squareOfNums);
    }
}
