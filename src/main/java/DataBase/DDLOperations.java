package DataBase;

import Configuration.PropertiesFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DDLOperations {
        public static void createDB() {

        Connection cn = null;
        try{
            Class.forName(Conexion.driver);
            cn = DriverManager.getConnection(Conexion.url, Conexion.user, Conexion.password);
            Statement stmt = cn.createStatement();
            stmt.execute("CREATE DATABASE IF NOT EXISTS " + Conexion.database);
            System.out.println("Base de datos creada correctamente");
            stmt.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en la conexión:" + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void operationsDB(String OP) {
        try(Connection cn =  new Conexion().getConexion()) {
            Statement stmt = cn.createStatement();
            Boolean a = stmt.execute(OP + " DATABASE " + Conexion.database);
            System.out.println("Operacion Realizada...");
            stmt.close();
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error en la conexión:" + e);
        }
    }



}