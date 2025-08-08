package PrototypeDesignPattern;

import java.util.HashMap;

public class CloneOfHuman {
    public static HashMap<String,HumanBeing>sizeMap=new HashMap<>();

    public static HumanBeing getSize(String type){
        HumanBeing cached =sizeMap.get(type);
        return cached != null?cached.clone():null;
    }
    public static void loadCache(){
        SpiderMan spider =new SpiderMan();
        sizeMap.put("SpiderMan",spider);

        BatMan bat =new BatMan();
        sizeMap.put("BatMan",bat);

        IronMan iron =new IronMan();
        sizeMap.put("IronMan",iron);
    }
}
