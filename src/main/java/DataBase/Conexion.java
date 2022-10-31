package DataBase;

import Configuration.PropertiesFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    static Properties config = PropertiesFile.loadConfig();

    static String database = config.getProperty("DATABASE");
    static String puerto = config.getProperty("PORT");
    static String url = config.getProperty("HOST") + puerto + "/";
    static String user = config.getProperty("USER");
    static String password = config.getProperty("PASSWORD");
    static String driver = config.getProperty("DRIVER");
    static Connection cn;


    public Connection getConexion() {
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url + database, user, password);
            System.out.println("Se conecto a la base de datos: " + database);
            return cn;

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("No se pudo conectar " + database);
            throw new RuntimeException(e);
        }
    }

    public void desconectar() {
        try {
            cn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
