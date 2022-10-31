package Configuration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static Properties loadConfig(){
        Properties config = new Properties();
        InputStream configInput = null;
        try{
            configInput = new FileInputStream("src/main/java/Configuration/config.properties");
            config.load(configInput);
        } catch(Exception e){
            System.out.println("Error cargando configuración\n" + e.getMessage());
        }
        return config;
    }
}
