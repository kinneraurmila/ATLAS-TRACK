import java.util.Map;
import java.util.Hashtable;

public class Task12 {
    public static void main(String[] args){

                Hashtable<String, Integer> ht = new Hashtable<>();
                ht.put("Anitha", 101);
                ht.put("Kavitha", 102);
                ht.put("Meera", 103);

                for (Map.Entry<String, Integer> e : ht.entrySet())
                    System.out.println(e.getKey() + " " + e.getValue());

    }
}
