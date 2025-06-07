public class Task40 {
        public static void main(String[] args) {
            Gadgets remote = new TvRemote40();
            Gadgets remote1 = new Ac40();

            remote.turnOn();
            remote.turnOff();
            remote1.turnOn();
            remote1.turnOn();

            Gadgets remote3 = new FanRemote40();
            Gadgets remote4 = new CoolerRemote40();

            remote3.turnOn();
            remote3.turnOff();
            remote4.turnOn();
            remote4.turnOn();

        }

}



