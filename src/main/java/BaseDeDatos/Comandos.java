package BaseDeDatos;

import Entities.Vehiculo;

import java.util.ArrayList;

public interface Comandos <T>{


    public Vehiculo create();
    public void remove();
    public void update();
    public ArrayList<T> getAll();
    public Vehiculo getById();

}
