package FactoryDesignPattern;

public class PepparoniPizza implements Pizza{
    void prepare() {
        System.out.println("preparing product pizza");
    }

    @Override
    public void Prepare() {

    }

    public void bake() {
        System.out.println("baking product pizza");
    }
    public void cut() {
        System.out.println("cutting product pizza");
    }
   public void boxIt() {
        System.out.println("boxing product pizza" );
    }
}
