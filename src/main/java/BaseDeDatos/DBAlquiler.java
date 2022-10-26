package BaseDeDatos;

import Entities.Alquiler;
import Entities.Vehiculo;

import java.util.ArrayList;

public class DBAlquiler extends ArrayList<Alquiler> implements Comandos<Alquiler> {
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
    public ArrayList<Alquiler> getAll() {
        return null;
    }

    @Override
    public Vehiculo getById() {
        return null;
    }
}
