package clases;

import java.util.Date;

public class Venta extends Operaciones{
    public Venta(int legajo, String dni, String nombre, String apellido, Date fecha, Long idAuto, Long idPlan) {
        super(legajo, dni, nombre, apellido, fecha, idAuto, idPlan);
    }
}
