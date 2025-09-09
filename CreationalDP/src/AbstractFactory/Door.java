package AbstractFactory;

public interface Door {
    void getDescription();
}
class WoodenD implements Door{
    @Override
    public void getDescription(){
        System.out.println("It's wooden door");
    }
}
class IronD implements Door{
    @Override
    public void getDescription(){
        System.out.println("Its iron door");
    }

}
interface DoorFittingEx{
    void fitting();
}
class WoodFittingEx implements  DoorFittingEx{
    @Override
    public void fitting(){
        System.out.println("I'm carpenter i'll fit wooden door");
    }
}
class IronFittingEx implements  DoorFittingEx{
    @Override
    public void fitting(){
        System.out.println("I'm welder i'll fit Iron door");
    }
}