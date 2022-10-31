package BaseDeDatos;

import Seeder.CreacionDeTablas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connect {

    private final static String base = "libreria";

    public DB_Connect() {

    }
    public static void createDB() {
        try(Connection cn =  new Conexion().getConexion();) {
            Statement stmt = cn.createStatement();
            stmt.execute("CREATE DATABASE IF NOT EXISTS " + base);
            System.out.println("Base de datos creada correctamente");
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión:" + e);
        }
    }

    public static void operationsDB(String OP) {
        try(Connection cn =  new Conexion().getConexion()) {
            Statement stmt = cn.createStatement();
            Boolean a = stmt.execute(OP + " DATABASE " + base);
            System.out.println("Operacion Realizada...");
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Error en la conexión:" + e);
        }
    }



}