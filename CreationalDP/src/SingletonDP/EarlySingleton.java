package SingletonDP;

public class EarlySingleton {
    private static EarlySingleton instace = new EarlySingleton();

    private EarlySingleton(){}

    public static EarlySingleton getInstance(){
        if(instace==null){
           EarlySingleton instance =new EarlySingleton();
        }
        return instace;
    }
    public void print(){
        System.out.println("Its Early singleton");
    }
    public static void main(String[] args){
        EarlySingleton singleton=EarlySingleton.getInstance();
        singleton.print();
    }
}
