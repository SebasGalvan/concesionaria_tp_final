package Seeder;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CargaVehiculo {

    public static void insertarPais(PreparedStatement stmt) {

        try {
            String SQL = "INSERT INTO paises (pais, acronimo, poblacion) VALUES ('Argentina', 'AR', 51000000)";
            int count = stmt.executeUpdate(SQL);
            System.out.println("filas afectadas: " + count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
