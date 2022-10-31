package Seeder;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CargaPlanesDePago {
    public static void insertarPlanes(PreparedStatement stmt) {
        try {
            String query = "INSERT INTO planes_de_pago (entrega, cuotas) VALUES (30000, 12)";
            int count = stmt.executeUpdate(query);
            System.out.println("filas afectadas: " + count);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
