package Daos;

import Entities.Vehiculo;

import java.util.ArrayList;

public class DBVehiculos extends ArrayList<Vehiculo> implements ICommandable<Vehiculo> {


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
    public ArrayList<Vehiculo> findAll() {
        return null;
    }

    @Override
    public Vehiculo finadById() {
        return null;
    }

}
