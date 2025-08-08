package AdaptorDP;

class Iphone16 implements Iphone {
    Charger iphone16Adapter;

    Iphone16( Charger iphone16Adapter) {
        this.iphone16Adapter= iphone16Adapter;
    }

    @Override
    public void onCharge() {
        iphone16Adapter.charge();
    }

    @Override
    public void offCharge() {
        iphone16Adapter.removeCharge();

    }

}