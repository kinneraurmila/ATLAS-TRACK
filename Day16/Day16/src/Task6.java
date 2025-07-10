import java.util.Arrays;
class Task6 {
        void bubbleSort(int arr[]){
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        // swap temp and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }
        public static void main(String args[]){
            Task6 ob = new Task6();
            int arr[] = { 64, 34, 25, 12 };
            System.out.print("Given array :");
            System.out.println(Arrays.toString(arr));

            ob.bubbleSort(arr);

            int n = arr.length;
            System.out.print("After sorting:  ");

            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

