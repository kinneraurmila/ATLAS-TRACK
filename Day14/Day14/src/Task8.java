import java.util.Stack;
public class Task8 {
    public static void main(String[] args){
        Stack<String> str =new Stack<>();
        str.push("hjk");
        str.push("yui");

        System.out.println("Given stack :"  + str);

        if(str.isEmpty()){
            System.out.println("Stack :" + str);
        }else{
            System.out.println("Stack not empty");
        }
        System.out.println("Is stack empty: "+ str.empty());//gives boolean output


        while(!str.empty()){
           // str.pop();
            System.out.println("Stack: "+ str.pop());
        }
        System.out.println("Final stack : " + str);
    }
}
