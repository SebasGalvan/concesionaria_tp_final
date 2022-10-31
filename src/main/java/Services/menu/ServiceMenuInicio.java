package Services.menu;

import Seeder.Index;

import java.util.Scanner;

public class ServiceMenuInicio{

    public static void start() throws InterruptedException {

        String rta = null;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                            Elija una opción para operar:
                            ---------------------------------------------------
                            Opción 1: Inicar Aplicacion
                            Opción 2: Cargar Base de datos
                            Opción 0: Salír
                            
                            Ingrese opcion:""");

            rta = sc.next();
            switch (rta) {
                case "1" -> ServiceMenuPrincipal.mostrarMenu();
                case "2" -> Index.inicio();
                case "0" -> System.out.println("Saliendo de la aplicacion...");
                default ->  System.out.println("No es una opcion valida");
            }
        } while(rta.equals("2"));
    }
}

