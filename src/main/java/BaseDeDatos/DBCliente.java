package BaseDeDatos;

import Entities.Cliente;

import Entities.Vehiculo;

import java.util.ArrayList;

public class DBCliente extends ArrayList<Cliente> implements Comandos<Cliente> {
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
    public ArrayList<Cliente> getAll() {
        return null;
    }

    @Override
    public Vehiculo getById() {
        return null;
    }
}
