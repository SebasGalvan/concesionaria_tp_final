package BaseDeDatos;

import Entities.Alquiler;

import java.util.ArrayList;

public class DBAlquiler extends ArrayList<Alquiler> implements Comandos<Alquiler> {
    @Override
    public Alquiler create() {
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
    public Alquiler getById() {
        return null;
    }
}
