package SingletonDesignPattern;


public class SingletonMain {

    public static void main(String[] args){
        SingletonDPConfigManager config=SingletonDPConfigManager.getConfigManagerInstance();


        System.out.println(("App name :" + config.getProperty("app.name")));
        System.out.println("App version: "+ config.getProperty("app.version"));
    }
}
