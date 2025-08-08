package FactoryDesignPattern;

public class FactoryMethodDPattern {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PepperoniPizzaFactory();
        Pizza pizza = pizzaFactory.cretePizza();

        System.out.println("Pizza preparation");
         pizza.bake();

    }

}


