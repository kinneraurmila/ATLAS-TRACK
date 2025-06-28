import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Task13 {
    public static void main(String[] args){

        HashMap<String, Integer> ht = new HashMap<>();
        ht.put("Anu", 101);
        ht.put("Kinnu", 105);
        ht.put("Meena", 34);
        HashMap<String, Integer> ht2 = new HashMap<>();

        ht2.put("Ayyu", 10);
        ht2.put("nur", 01);
        ht2.put("kk", 11);
        System.out.println("mapping hashmap:" + ht);
        System.out.println("mapping hashmap:" + ht2);


//        for (Map.Entry<String, Integer> e : ht.entrySet())
//            System.out.println(e.getKey() + " " + e.getValue());

    }
}
