package Entities;

import java.util.Date;

public class ModelVenta extends ModelOperaciones {
    public ModelVenta(int legajo, String dni, String nombre, String apellido, Date fecha, Long idAuto, Long idPlan) {
        super(legajo, dni, nombre, apellido, fecha, idAuto, idPlan);
    }
}
