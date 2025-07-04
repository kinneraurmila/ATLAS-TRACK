import java.util.Stack;

public class Task7 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(29);
        stack.push(45);
        stack.push(90);
        stack.push(67);

        System.out.println("Stack: " + stack);
       // stack.peek();

        System.out.println("Stack top element checking using peek : " + stack.peek());

    }
}