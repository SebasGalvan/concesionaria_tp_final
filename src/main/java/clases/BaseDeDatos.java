package clases;

import clases.Vehiculo;

import java.util.List;

public class BaseDeDatos {

    private List<Vehiculo> listaVehiculos;
    private List<Cliente> listaCliente;
    private List<Empleado> listaEmpleado;
    private List<Repuesto> listaRepuestos;
    private List<Venta> listaVentas;
    private List<Alquiler> listaAlquiler;
    private List<PlanesPago> listaPlanesPago;


    public void addItemListVehiculos(Vehiculo mi_vehiculo){
        this.listaVehiculos.add(mi_vehiculo);
    }
    public void addItemListaCliente(Cliente cliente){
        this.listaCliente.add(cliente);
    }
    public void addItemListaEmpleado(Empleado empleado){
        this.listaEmpleado.add(empleado);
    }



    public Vehiculo getItemByIDVehiculo(Long id){
        return new Vehiculo();
    }


    public List<Vehiculo> getAllVehiculos(){
        return listaVehiculos;
    }
}
