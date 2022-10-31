package Seeder;

import DataBase.DDLOperations;

public class Index {
    public static void inicio() {
        DDLOperations.createDB();
        CreacionDeTablas.crearTablas();
        SeederCargaTablas.cargar();
    }
}
