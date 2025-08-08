package PrototypeDesignPattern;

public class IronMan extends HumanBeing{

    public IronMan(){
        this.type="IronMan";
    }
    @Override
    public void walk(){
        System.out.println("Iman walking");
    }
    @Override
    public void see(){
        System.out.println("Iman watching");
    }
    @Override
    public void talk(){
        System.out.println("Iman walking");
    }
}
