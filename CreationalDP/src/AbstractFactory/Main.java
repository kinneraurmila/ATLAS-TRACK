package AbstractFactory;

public class Main {
    public static void main(String[] args){

        DoorFactory factory=new WoodenDoorFactory();
       Door wooden= factory.makeDoor();
        DoorFittingEx exp=factory.makeFittingEx();
        wooden.getDescription();
        exp.fitting();

        DoorFactory factory1=new IronFactory();
       Door iron= factory1.makeDoor();
        DoorFittingEx expert= factory1.makeFittingEx();

        iron.getDescription();
        expert.fitting();
    }
}
