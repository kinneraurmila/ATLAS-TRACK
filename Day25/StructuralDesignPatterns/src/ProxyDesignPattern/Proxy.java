package ProxyDesignPattern;

import java.util.Objects;

public class Proxy implements Executor{
    private String id;
    private DB db;

    public Proxy(String id){
        this.id=id;
        this.db=new DB();
    }

    @Override
    public void runQuery(String type){
        if(type.equalsIgnoreCase("DELETE") &&
                !Objects.equals(this.id,"ADMIN")){
            System.out.println("Sorry access denied");
            return;

        }
        db.runQuery(type);
    }
}
