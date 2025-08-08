package PrototypeDesignPattern;

public abstract class HumanBeing implements Cloneable{
    protected String name;
    protected String type;

    public abstract void walk();
    public abstract void see();
    public abstract void talk();

    @Override
    public HumanBeing clone(){
        try{
            return (HumanBeing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
