public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        // Base case: An empty string or a string with one character is a palindrome.
        if (str == null || str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // If the first and last characters are not equal, it's not a palindrome.
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(" palindrome: " + isPalindrome("siri"));
        System.out.println("palindrome: " + isPalindrome("kinnera"));
        System.out.println("A is palindrome: " + isPalindrome("A")); // true
        System.out.println(" is palindrome: " + isPalindrome("")); // true
        System.out.println("Racecar is palindrome (case-sensitive): " + isPalindrome("Racecar")); // false
        System.out.println("Racecar is palindrome (case-insensitive): " + isPalindrome("Racecar".toLowerCase())); // true
    }
}


