

class LightBulb {
    void turnOn() {
        System.out.println("light turned on");
    }
    void turnOff() {
        System.out.println("light is off");
    }
}
class Switch {  // switch class directly depends on the lightbulb class ---- DIP violating
    LightBulb lbulbobj;

    Switch(LightBulb lbulbobj) {
        this.lbulbobj = lbulbobj;
    }

    void operates() {
        lbulbobj.turnOn();
    }
}
public class Task7 {
    public static void main(String[] args) {
        LightBulb lbulbobj = new LightBulb();
        Switch Switchobj = new Switch(lbulbobj);
        Switchobj.operates();
    }
}




