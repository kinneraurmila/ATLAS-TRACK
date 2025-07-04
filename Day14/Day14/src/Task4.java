import java.util.Stack;
public class Task4 {
    public static void main(String[] args){

        Stack<Integer> stack=new Stack<>();

        stack.push(12);
        stack.push(29);
        stack.push(45);
        stack.push(90);
        stack.push(67);

        System.out.println("Stack: "+ stack);

        System.out.println("Stack value at index 2: "+ stack.get(2));



    }
}
