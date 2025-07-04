public class DecimalToBinaryConverter {

    public static String convertDecimalToBinary(int decimalNumber) {
        // Base case: If the decimal number is 0, its binary representation is "0".
        if (decimalNumber == 0) {
            return "0";
        }
        // Base case: If the decimal number is 1, its binary representation is "1".
        if (decimalNumber == 1) {
            return "1";
        }

        return convertDecimalToBinary(decimalNumber / 2) + (decimalNumber % 2);
    }

    public static void main(String[] args) {
        int num1 = 13;
        System.out.println("Decimal " + num1 + " in binary is: " + convertDecimalToBinary(num1)); // Output: 1101

        int num2 = 25;
        System.out.println("Decimal " + num2 + " in binary is: " + convertDecimalToBinary(num2)); // Output: 11001

        int num3 = 0;
        System.out.println("Decimal " + num3 + " in binary is: " + convertDecimalToBinary(num3)); // Output: 0

        int num4 = 1;
        System.out.println("Decimal " + num4 + " in binary is: " + convertDecimalToBinary(num4)); // Output: 1
    }
}

