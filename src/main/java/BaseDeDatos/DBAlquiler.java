package BaseDeDatos;

import Entities.Alquiler;
<<<<<<< HEAD
=======

import Entities.Vehiculo;
>>>>>>> 9e03cb1255aaf740bbeed10b24a714fdda260ec5

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
