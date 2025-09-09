package SingletonDP;

// In multi thread environment
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton uInstance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getuInstance(){
        if(uInstance==null){
            synchronized (DoubleCheckSingleton.class){
                if(uInstance==null){
                    uInstance=new DoubleCheckSingleton();
                }
            }
        }
        return uInstance;
    }

    public void showMsg() {
        System.out.println("Its Double checked /Multi thread Environment ");
    }
    public static void main(String[] args) {
        DoubleCheckSingleton dc =DoubleCheckSingleton.getuInstance();
        dc.showMsg();

    }
}
