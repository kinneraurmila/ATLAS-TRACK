import java.util.HashMap;
import java.util.Map;

public class Task11 {

    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        if (memo.containsKey(n)) {
            return memo.get(n); // Return stored result if available
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result); // Store the computed result
        return result;
    }

    public static void main(String[] args) {
        int n = 10; // Calculate Fibonacci up to the 10th term
        System.out.println("Fibonacci series using Memoization:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}


