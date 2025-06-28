
import java.util.HashMap;
import java.util.Map;

public class Task19 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        HashMap hmap = new HashMap();
        hmap.put(101, "Prasunamba");
        hmap.put(null, "Meher");
        hmap.put(null, ".MK"); //here overrides only 1 key value can be null
        hmap.put(445, null);
        hmap.put(108, null); // we can have multiple values as null

        System.out.println(hmap);

    }
}
