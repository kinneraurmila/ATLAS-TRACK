import javax.lang.model.element.Element;
import java.util.HashMap;
import java.util.Map;

public enum Elem19 {
    H("Hydrogen",1,1.008f),
    HE("Helium" , 2 , 4.0026f),
    NE("Neon" ,10,20.180f);
    private static final Map<String, Elem19> BY_LABEL = new HashMap<>();
    private static final Map<String, Elem19> BY_ATOMIC_NUM = new HashMap<>();
    private static final Map<String, Elem19> BY_ATOMIC_WEIGHT = new HashMap<>();

        static {
            for (Elem19 e : values()) {
                BY_LABEL.put(e.label, e);
                BY_ATOMIC_NUM.put(String.valueOf(e.atomicNum) , e);
                BY_ATOMIC_WEIGHT.put((String.valueOf(e.atomicWeight)),e);
            }
        }
        public final String label;
        public final int atomicNum;
        public final float atomicWeight;
        Elem19(String label, int atomicNum, float atomicWeight){
            this.label = label;
            this.atomicNum = atomicNum;
            this.atomicWeight = atomicWeight;
        }
            public static Elem19 valueOfLabel(String label){
            return BY_LABEL.get(label);
        }
        public static Elem19 valueOfAtomicNum(int num){
            return BY_ATOMIC_NUM.get(num);
        }
        public static Elem19 valueOfAtomicWeight(float weight) {
            return BY_ATOMIC_WEIGHT.get(weight);
        }
       public static void main(String[] args){
            System.out.println(valueOfLabel("Hydrogen"));
           System.out.println(valueOfLabel("Neon"));

           System.out.println(valueOfAtomicNum(3));
           System.out.println(valueOfAtomicWeight(20.180f));
       }
    }

