package PrototypeDesignPattern;

public class BatMan extends HumanBeing{
    public BatMan(){
        this.type="BatMan";
    }
    @Override
    public void walk(){
        System.out.println("bman walking");
    }
    @Override
    public void see(){
        System.out.println("bman watching");
    }
    @Override
    public void talk(){
        System.out.println("bman walking");
    }
}
