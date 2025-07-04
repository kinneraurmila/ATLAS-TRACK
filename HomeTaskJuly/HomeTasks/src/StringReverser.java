public class StringReverser {

    public static String reverseStringRecursive(String str) {
        // Base case: If the string is null or has 0 or 1 character, return it as is.
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String originalString1 = "";
        String reversedString1 = reverseStringRecursive(originalString1);
        System.out.println("Original: " + originalString1 + ", Reversed: " + reversedString1); // Output: Original: , Reversed:

        String originalString2 = "a";
        String reversedString2 = reverseStringRecursive(originalString2);
        System.out.println("Original: " + reversedString2 + ", Reversed: " + reversedString2); // Output: Original: a, Reversed: a

        String originalString3 = null;
        String reversedString3 = reverseStringRecursive(originalString3);
        System.out.println("Original: " + originalString3 + ", Reversed: " + reversedString3); // Output: Original: null, Reversed: null
    }
}

