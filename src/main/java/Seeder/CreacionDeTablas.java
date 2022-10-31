package Seeder;

import DataBase.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreacionDeTablas {

    public static void crearTablas(){
        String TABLA_PLANES = """
                    CREATE TABLE `planes_de_pago` (
                      `id_plan` INT NOT NULL AUTO_INCREMENT,
                      `entrega` DECIMAL(11, 2) NULL,
                      `cuotas` INT NOT NULL,
                      PRIMARY KEY (`id_plan`));"""
                ;
        Conexion cn =  new Conexion();
        try(Connection conexion =  cn.getConexion()){
            PreparedStatement stmt = conexion.prepareStatement(TABLA_PLANES);
            stmt.execute();
            CargaPlanesDePago.insertarPlanes(stmt);
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Error en la ejecución: "
                    + e.getErrorCode() + " " + e.getMessage());
        }


    }
}
