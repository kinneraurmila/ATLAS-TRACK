public class DigitOperations {

    public static int countDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        // Recursive step: Increment count and call for n/10 (removing the last digit).
        return 1 + countDigitsRecursive(n / 10);
    }

    public static int sumDigitsRecursive(int n) {
        // Base case: If n is 0, the sum of its digits is 0.
        if (n == 0) {
            return 0;
        }
        // Recursive step: Add the last digit (n % 10) and call for n/10.
        return (n % 10) + sumDigitsRecursive(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;

        // Count digits
        int digitCount = countDigitsRecursive(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);

        // Sum of digits
        int digitSum = sumDigitsRecursive(number);
        System.out.println("Sum of digits in " + number + ": " + digitSum);

        int zeroTest = 0;
        System.out.println("Number of digits in " + zeroTest + ": " + countDigitsRecursive(zeroTest));
        System.out.println("Sum of digits in " + zeroTest + ": " + sumDigitsRecursive(zeroTest));
    }
}

