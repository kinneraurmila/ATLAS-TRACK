public class ReverseString {

    public static String reverse(String str){
        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        String original= "Surkanti kinnera";
        String reversed =reverse(original);

        System.out.println("Original String : " + original) ;

        System.out.println("Reversed String : " +reversed ) ;
    }
}
