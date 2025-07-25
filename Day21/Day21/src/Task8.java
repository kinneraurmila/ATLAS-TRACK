
interface SwitchOnOff {
    void turnOn();
    void turnOff(); // void remoteControl();// void alexaVoiceControl();
}
class LightBulb1 implements SwitchOnOff{
    public void turnOn() {
        System.out.println("light turned on");
    }
    public void turnOff() {
        System.out.println("light is off");
    }
} // or class fan, class inverter, class washing machine...(in future remote for washing machine
// i can extend without modification..
class Switch1 { // switch is depending on switchonoff class not on light bulb..
    SwitchOnOff device;
    Switch1(SwitchOnOff device) {
        this.device = device;
    }
    void operates() {
        device.turnOn();
    }
}
class Task8 {
    public static void main(String[] args){
        SwitchOnOff lbulbobj = new LightBulb1();
        Switch1 lightswitch = new Switch1(lbulbobj);
        lightswitch.operates();
    }
}

