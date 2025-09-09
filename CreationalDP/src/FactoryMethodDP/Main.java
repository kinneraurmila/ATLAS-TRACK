package FactoryMethodDP;

public class Main {
    public static void main(String[] args){
        HiringManager dev =new DevManager();
        dev.takeInterview();

        HiringManager mar=new MarManager();
        mar.takeInterview();
    }
}
