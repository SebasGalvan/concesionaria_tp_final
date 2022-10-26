package BaseDeDatos;

import Entities.Vehiculo;

import java.util.ArrayList;

public class DBVehiculos extends ArrayList<Vehiculo> implements Comandos<Vehiculo> {


    @Override
    public Vehiculo create() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void update() {

    }

    @Override
    public ArrayList<Vehiculo> getAll() {
        return null;
    }

    @Override
    public Vehiculo getById() {
        return null;
    }
}
