package PrototypeDesignPattern;

public class PrototypeMain {
    public static void main(String[] args){
        CloneOfHuman.loadCache();

        HumanBeing clone1= CloneOfHuman.getSize("SpiderMan");
        clone1.walk();
      //  clone1.talk();

        HumanBeing clone2= CloneOfHuman.getSize("IronMan");
        clone2.walk();

        HumanBeing clone3= CloneOfHuman.getSize("BatMan");
        clone3.walk();
    }
}
