package SingletonDesignPattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SingletonDPConfigManager {
    private static SingletonDPConfigManager ConfigManagerInstance;
    private Properties properties;
    private  SingletonDPConfigManager() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.prop")) {
            if (input == null) {
                System.out.println("we cant find config properties");
                properties.setProperty("app name", "Default app");// error
                properties.setProperty("app.version","0.0");
                return;
            }
            properties.load(input);
        }catch (IOException ioexp) {
            ioexp.printStackTrace();
        }
    }
    public String getProperty(String key) {
        return properties.getProperty(key,"Not Found");
    }
    public static synchronized SingletonDPConfigManager getConfigManagerInstance() {
        if (ConfigManagerInstance == null) {
            ConfigManagerInstance = new SingletonDPConfigManager();
        }
        return ConfigManagerInstance;
    }

}



