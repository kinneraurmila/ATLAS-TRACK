package AdaptorDP;

public class Iphone16Charger implements Charger {

    Iphone16Charger() {
        System.out.println("charger is ready ");

    }

    public void charge() {
        System.out.println(" i'm charging Iphone 16");
    }

    @Override
    public void removeCharge(){
        System.out.println("stopped charging");
    }
}
