package ProxyDesignPattern;

public class DB implements Executor{

    @Override
    public void runQuery(String type){
        System.out.println("we're running query: "+ type);
    }
}
