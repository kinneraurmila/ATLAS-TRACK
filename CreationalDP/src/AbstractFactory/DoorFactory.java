package AbstractFactory;

public interface DoorFactory {
    Door makeDoor();
    DoorFittingEx makeFittingEx();
}
class WoodenDoorFactory implements DoorFactory{
    @Override
    public Door makeDoor(){
        return new WoodenD();
    }
    @Override
    public DoorFittingEx makeFittingEx(){
        return new WoodFittingEx();
    }
}
class IronFactory implements DoorFactory{
    @Override
    public Door makeDoor(){
        return new IronD();
    }
    @Override
    public DoorFittingEx makeFittingEx(){
        return new IronFittingEx();
    }
}