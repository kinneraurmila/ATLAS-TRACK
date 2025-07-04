import java.util.Arrays;

public class ArrayCopyRecursive {

    public static void copyArrayRecursive(int[] source, int[] destination, int index) {
        // Base case: If the index reaches the end of the source array, stop recursion.
        if (index >= source.length) {
            return;
        }

        // Copy the element at the current index
        destination[index] = source[index];

        // Recursive call for the next element
        copyArrayRecursive(source, destination, index + 1);
    }

    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40, 50};
        int[] destinationArray = new int[sourceArray.length];

        // Start the recursive copy from index 0
        copyArrayRecursive(sourceArray, destinationArray, 0);

        System.out.print("Original Array: " + Arrays.toString(sourceArray));

        // Print the destination array to verify the copy
        System.out.print("\n Copied Array: ");
        for (int i : destinationArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}