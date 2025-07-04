import java.util.Stack;
public class Task6 {
    public static void main(String[] args){
        Stack<String> string =new Stack<>();

        string.push("kk");
        string.push("skr");
        string.push(" Kinnera");

        System.out.println("Stack for String : "+ string);

        String find ="skr";
        int position = string.search(find);

        System.out.println("Finding position of the String: " + position);

        if(string.contains(find)){
            System.out.println("found string : "+ find);
        }else{
            System.out.println("not found string : "+ find);

        }

        if ( position != -1){
            System.out.println("position from top: " + position);
            int indexfbuttom =string.size()-position;
            System.out.println("index from buttom: " + indexfbuttom);

        }else{
            System.out.println("not found");
        }


    }
}
