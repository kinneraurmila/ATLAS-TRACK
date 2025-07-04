import java.util.Scanner;

public class Factorial_Iterative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1; // Use long - to handle larger factorials
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
        scanner.close();

    }
}

