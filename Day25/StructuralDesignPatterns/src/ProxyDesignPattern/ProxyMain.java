package ProxyDesignPattern;

public class ProxyMain {
    public static void main(String[] args){
        Executor obj1 = new Proxy("ADMIN");
        obj1.runQuery("READ");
        obj1.runQuery("UPDATE");
        obj1.runQuery("DELETE");

        Executor obj2 = new Proxy("MANAGER");
        obj2.runQuery("READ");
        obj2.runQuery("UPDATE");
        obj2.runQuery("DELETE");

    }

}
