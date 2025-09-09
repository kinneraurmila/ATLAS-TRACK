package SingletonDP;

public class LazySingleton {
    private static LazySingleton unique;

    private LazySingleton(){}

    public static LazySingleton getUnique(){
        if(unique ==null){
            unique =new LazySingleton();
        }
        return unique;
    }
    public void show(){
        System.out.println("Its Signleton Lazy initialization");
    }
    public static void main(String[] args){
        LazySingleton singletonLazy=LazySingleton.getUnique();
        singletonLazy.show();
    }
}
