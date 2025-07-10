import java.io.*;
public class Task03 {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {10, 20, 5, 46, 80};
        System.out.print("before Sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int imin;
        for (int i = 0; i < n - 1; i++) {
            imin = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[imin])
                    imin = j;

            int temp;
            temp = arr[i];
            arr[i] = arr[imin];
            arr[imin] = temp;
        }
        System.out.print("After Sorting: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
