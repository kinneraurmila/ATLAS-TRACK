import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task04 {

    public static void main(String[] args) {
        int[] numbers = {123, 453, 891, 230, 561, 789, 110};

        // Group numbers by their unit digit
        Map<Integer, List<Integer>> groupedByUnitDigit = groupNumbersByUnitDigit(numbers);

        // Display the groups
        displayGroups(groupedByUnitDigit);
    }

    public static Map<Integer, List<Integer>> groupNumbersByUnitDigit(int[] numbers) {
        Map<Integer, List<Integer>> groups = new HashMap<>();

        // Initialize lists for each possible unit digit (0-9)
        for (int i = 0; i <= 9; i++) {
            groups.put(i, new ArrayList<>());
        }

        // Iterate through the numbers and place them into the correct group
        for (int number : numbers) {
            int unitDigit = number % 10; // Get the unit digit
            groups.get(unitDigit).add(number);
        }
        return groups;
    }


    public static void displayGroups(Map<Integer, List<Integer>> groups) {
        System.out.println("Numbers grouped by their unit digit:");
        for (int i = 0; i <= 9; i++) {
            List<Integer> numbersInGroup = groups.get(i);
            if (!numbersInGroup.isEmpty()) {
                System.out.println("Unit Digit " + i + ": " + numbersInGroup);
            }
        }
    }
}