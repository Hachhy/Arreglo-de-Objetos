package practica_2;

import java.util.Scanner;

public class main_Persona {

    static Scanner sc = new Scanner(System.in);
    static arreglo_Persona aper;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion;
        do {
            System.out.println("\n*************************************\n"
                    + "Maestro SAC - Control de Pago       *\n"
                    + "*************************************\n"
                    + "1.- Crear Arreglo                   *\n"
                    + "2.- Ingresar Datos de las Personas  *\n"
                    + "3.- Eliminar Datos de las Personas  *\n"
                    + "4.- Mostrar Datos de las Personas   *\n"
                    + "5.- Buscar Datos de una Persona     *\n"
                    + "0.- Salir                           *\n"
                    + "*************************************");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearArreglo();
                    break;
                case 2:
                    ingresoDatos();
                    break;
                case 3:
                    aper.eliminarDatos();
                    break;
                case 4:
                    aper.mostrarDatos();
                    break;
                case 5:
                    aper.buscardatos();
                    break;
                case 0:
                    System.out.println("Saliendo del Sistema");
                    break;
                default:
                    break;

            }
        } while (opcion != 0);
    }

    static void crearArreglo() {
        System.out.print("Ingrese Tamaño del arreglo: ");
        int tam = sc.nextInt();
        aper = new arreglo_Persona(tam);
        System.out.println("Felicidades --> Arreglo Creado!!");
    }

    static void ingresoDatos() {

        System.out.print("Ingrese Codigo: ");
        String cod = sc.next();
        sc.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nom = sc.nextLine();
        double tar;
        do {
            System.out.print("Ingrese Tarifa: ");
            tar = sc.nextDouble();
        } while (tar < 0);
        System.out.print("Ingrese horas: ");
        int h = sc.nextInt();
        aper.ingresarDatos(cod, nom, tar, h);
    }

}
