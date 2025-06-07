public class Asb38 {
    public static void main(String[] args) {
        /* Following is not allowed and would raise error */
         Employee39 e = new Employee39("George W.", "Houston, TX", 43) {
         };
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}