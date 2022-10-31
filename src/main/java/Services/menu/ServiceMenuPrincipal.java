package Services.menu;

import java.util.Scanner;

public class ServiceMenuPrincipal {

    public static void mostrarMenu() throws InterruptedException {

        String rta = null;
        Scanner sc = new Scanner(System.in);

        Thread.sleep(1*1000);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXO------------OXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Thread.sleep(200);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|            |XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Thread.sleep(200);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|Team pro_Utn|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Thread.sleep(200);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|            |XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Thread.sleep(200);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXO------------OXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("                                             _._");
        System.out.println("                                        _.-=´´_-         _");
        System.out.println("                                   _.-=´´   _-          | |´´´´´´´---._______     __..");
        System.out.println("                       ___.===¨¨¨¨-.______-,,,,,,,,,,,,`-¨ ¨----´¨¨ ¨¨¨¨       ¨¨¨¨  __¨¨");
        System.out.println("                _.--¨¨¨     _        ,´                   o \\           _        [_]|");
        System.out.println("           __-´´=======.--¨¨  ¨¨--.=================================.--¨¨  ¨¨--.=======:");
        System.out.println("          ]       [w] : /        \\ : |========================|    : /        \\ :  [w] :");
        System.out.println("          V___________:|          |: |========================|    :|          |:   _-´");
        System.out.println("           V__________: \\        / :_|=======================/_____: \\        / :__-´");
        System.out.println("           -----------´  ¨¨____¨¨  `-------------------------------´  ¨¨____¨¨");


      do {
        System.out.println(" ");
        System.out.println("                    Bienvenido a Fast&will - Software de gestión de concesionarias");
        System.out.println("*****************************************************************************************************");

        System.out.println("""
                            Elija una opción para operar:
                            ---------------------------------------------------
                            Opción 1: Ventas
                            Opción 2: Buscar
                            Opción 3: Servicios de alquiler
                            Opción 4: Carga de datos
                            Opción 5: Compras
                            Opción 0: Salír
                            
                            Ingrese opcion:""");

            rta = sc.next();
            switch (rta) {
                case "1" -> ServiceMenuVenta.mostrarMenu();
                case "2" -> ServiceMenuBusqueda.mostrarMenu();
                case "3" -> ServiceMenuAlquiler.mostrarMenu();
                case "4" -> ServiceMenuCargaDatos.mostrarMenu();
                case "5" -> ServiceMenuCompra.mostrarMenu();
                case "0" -> System.out.println("Saliendo de la aplicacion...");
                default ->  System.out.println("No es una opcion valida");
            }
        } while(!rta.equals("0"));

    }
}
