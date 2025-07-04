import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int count = input.nextInt();

        int n1 = 0; // First term
        int n2 = 1; // Second term
        int n3;     // Next term

        System.out.print("Fibonacci Series up to " + count + " terms: ");

        if (count >= 1) {
            System.out.print(n1); // Print the first term
        }
        if (count >= 2) {
            System.out.print(" " + n2); // Print the second term
        }

        // Generate and print subsequent terms
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

        input.close();
    }
}

