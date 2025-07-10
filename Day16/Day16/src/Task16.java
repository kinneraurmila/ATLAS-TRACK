import java.util.Arrays;

public class Task16 {
    // Main function to perform QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array around a pivot
    public static int partition(int[] arr, int low, int high) {
        // Choose the last element as the pivot
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};
        System.out.print("Unsorted Array: ");
        printArray(data);

        quickSort(data, 0, data.length - 1);

        System.out.print("Sorted Array: ");
        printArray(data);
    }
}



