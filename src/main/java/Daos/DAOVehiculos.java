package Daos;

import DataBase.Conexion;
import Entities.ModelVehiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOVehiculos extends ArrayList<ModelVehiculo> implements ICommandable<ModelVehiculo> {


    @Override
    public void create(ModelVehiculo vehiculo) {

        final String query = "INSERT INTO autores(`nombre`, `apellido`, `seudonimo`, `genero`, `fecha_nacimiento`, `pais_origen`) VALUES (?,?,?,?,?,?)";
        Conexion cx = new Conexion();

        try (Connection conexion = cx.getConexion()){
            PreparedStatement pstm = conexion.prepareStatement(query);
            pstm.setString(1, vehiculo.getMarca());
            int row = pstm.executeUpdate();
            System.out.println("Vehiculo se agrego con exito ... ");
            System.out.println("Filas afectadas: " + row);

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public void remove() {

    }

    @Override
    public void update() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void finadById() {

    }


}
