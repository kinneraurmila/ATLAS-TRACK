package FactoryDesignPattern;

public class PepperoniPizzaFactory implements PizzaFactory{

    @Override
    public Pizza cretePizza() {
        return new PepparoniPizza();
    }
}
