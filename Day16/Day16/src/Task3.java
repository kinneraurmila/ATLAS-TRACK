public class Task3 {
     public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j; // Update minIndex if a smaller element is found
                    }
                }

                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Utility method to print an array
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Main method to test the selectionSort method
        public static void main(String[] args) {
            int[] numbers = {64, 25, 12, 22, 11};

            System.out.println("Input Array:");
            printArray(numbers);

            selectionSort(numbers); // Call the selection sort method

            System.out.println("Sorted Array:");
            printArray(numbers);
        }
    }

