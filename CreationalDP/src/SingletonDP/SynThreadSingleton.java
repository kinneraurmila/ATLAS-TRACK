package SingletonDP;

public class SynThreadSingleton {
    private static SynThreadSingleton one;

    private SynThreadSingleton(){}

    public static synchronized SynThreadSingleton getOne(){
        if(one ==null){
            one =new SynThreadSingleton();
        }
        return one;
    }
    public void text(){
        System.out.println("Its synchronized singleton ");
    }
    public static void main(String[] args){
        SynThreadSingleton singleton =SynThreadSingleton.getOne();
        singleton.text();
    }
}
