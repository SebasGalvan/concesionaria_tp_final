package BaseDeDatos;

import Entities.Empleado;
import Entities.Vehiculo;

import java.util.ArrayList;
public class DBEmpleado extends ArrayList<Empleado> implements Comandos<Empleado>{
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
    public ArrayList<Empleado> getAll() {
        return null;
    }

    @Override
    public Vehiculo getById() {
        return null;
    }
}
