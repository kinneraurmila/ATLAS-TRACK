public class Task06 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons and swaps in each pass
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(data);

        bubbleSort(data);

        System.out.println("Sorted array:");
        printArray(data);
    }

}


