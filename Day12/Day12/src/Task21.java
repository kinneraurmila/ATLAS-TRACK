import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task21 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();

        hm1.put("hi" ,12);
        hm1.put("kkl" ,23);
        hm1.put("tyr", 56);
        Map<String, Integer> syncMap = Collections.synchronizedMap(hm1);
        synchronized (syncMap){
            System.out.println("Synchronized hashmap: " + syncMap);

            for(Map.Entry<String ,Integer> entry: syncMap.entrySet()){
                System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
            }
        }
    }
}



