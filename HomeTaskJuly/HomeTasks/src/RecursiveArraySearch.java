public class RecursiveArraySearch {


    public static int recursiveLinearSearch(int[] arr, int target, int index) {
        // Base Case 1: If the index has reached the end of the array, the element is not found.
        if (index == arr.length) {
            return -1;
        }

        // Base Case 2: If the element at the current index matches the target.
        if (arr[index] == target) {
            return index;
        }

        // Recursive Step: Call the function for the next element in the array.
        return recursiveLinearSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target1 = 30;
        int target2 = 60;

        int result1 = recursiveLinearSearch(numbers, target1, 0);
        if (result1 != -1) {
            System.out.println("Element " + target1 + " found at index: " + result1);
        } else {
            System.out.println("Element " + target1 + " not found in the array.");
        }

        int result2 = recursiveLinearSearch(numbers, target2, 0);
        if (result2 != -1) {
            System.out.println("Element " + target2 + " found at index: " + result2);
        } else {
            System.out.println("Element " + target2 + " not found in the array.");
        }
    }
}

