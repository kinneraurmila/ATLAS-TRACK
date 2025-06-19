import java.util.ArrayList;
import java.util.List;
public class Task14 {
    public static void main(String[] args){
        List<Integer> numbers =new ArrayList<>();
        for(int i=1;i<=20;i++){
            numbers.add(i);
          //  System.out.println(i);
        }
        System.out.println(" Numbers after skipping first 10: ");
        numbers.stream()
        .skip(10).forEach(n->System.out.println(n));


    }
}
