package Entities;

import java.util.Date;

public class ModelAlquiler extends ModelOperaciones {

    public ModelAlquiler(int legajo, String dni, String nombre, String apellido, Date fecha, Long idAuto, Long idPlan) {
        super(legajo, dni, nombre, apellido, fecha, idAuto, idPlan);
    }
}