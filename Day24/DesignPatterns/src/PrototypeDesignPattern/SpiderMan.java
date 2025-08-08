package PrototypeDesignPattern;

public class SpiderMan extends HumanBeing{
    public SpiderMan(){
        this.type="SpiderMan";
    }
    @Override
    public void walk(){
        System.out.println("sman walking");
    }
    @Override
    public void see(){
        System.out.println("sman watching");
    }
    @Override
    public void talk(){
        System.out.println("sman walking");
    }
}
