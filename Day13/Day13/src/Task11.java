import java.util.LinkedList;
public class Task11 {
    public static void main(String[] args){
        LinkedList<Integer> llObj = new LinkedList<>();
        llObj.push(23);
        llObj.push(45);
        llObj.push(89);
        llObj.push(56);
        llObj.push(90);
        System.out.println("list: " + llObj);
       int pop=  llObj.pop();
       System.out.println("removing element :" + pop);
        System.out.println("list: " + llObj);

    }
}
