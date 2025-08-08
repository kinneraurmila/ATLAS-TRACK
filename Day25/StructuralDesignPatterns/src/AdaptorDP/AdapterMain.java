package AdaptorDP;


public class AdapterMain {
    public static void main(String[] args) {
        Iphone16 iphoneobj = new Iphone16(new Iphone16Adapter());
        iphoneobj.onCharge();
        iphoneobj.offCharge();
    }
}