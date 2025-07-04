import java.util.Stack;

public class Task5 {

    public static void main(String[] args) {
        Stack<String> string = new Stack<>();

        string.push("kk");
        string.push("skr");
        string.push(" Kinnera");
        System.out.println("Given string: "  +string);

        System.out.println("Stack using pop : "+ string.pop());

        System.out.println(" string after doing pop: "  +string);


    }
}
