package practica_2;

import java.util.Scanner;

public class arreglo_Persona {

    int tope = 0, max;
    static Scanner sc = new Scanner(System.in);
    persona per = new persona();
    persona[] arregloPersona;

    public arreglo_Persona(int tam) {
        this.tope = 0;
        this.max = tam;
        this.arregloPersona = new persona[this.max + 1];
        for (int i = 0; i < this.max + 1; i++) {
            arregloPersona[i] = new persona();
        }
    }

    public void ingresarDatos(String cod, String nom, double tar, int h) {
        if (tope == max) {
            System.out.println("El arreglo esta lleno...");
        } else {
            tope++;
            this.arregloPersona[tope].registrar(cod, nom, tar, h);
        }
    }

    public void eliminarDatos() {
        if (tope == 0) {
            System.out.println("El arreglo esta vacio...");
        } else {
            System.out.print("Ingrese codigo a eliminar: ");
            String cod = sc.next();
            for (int i = 0; i <= tope; i++) {

                if (arregloPersona[i].getCodigo() == null ? (cod) == null : arregloPersona[i].getCodigo().equals(cod)) {
                    for (int p = i + 1; p <= max; p++) {
                        arregloPersona[p - 1] = arregloPersona[p];
                    }
                    System.out.println("Persona eliminada...");
                    tope--;
                }
            }
        }
    }

    public void mostrarDatos() {
        if (tope == 0) {
            System.out.println("El arreglo esta vacio...");
        } else {
            System.out.println("");
            encabezado();
            for (int i = 1; i <= tope; i++) {
                arregloPersona[i].mostrar();
            }
        }
    }

    public void buscardatos() {

        if (tope == 0) {
            System.out.println("El arreglo esta vacio...");
        } else {
            System.out.print("Ingrese Codigo a buscar: ");
            String cod = sc.next();
            for (int i = 0; i <= max; i++) {

                if (arregloPersona[i].getCodigo() == null ? cod == null : arregloPersona[i].getCodigo().equals(cod)) {
                    System.out.println("");
                    encabezado();
                    arregloPersona[i].mostrar();
                    break;
                } else if (i == max) {
                    System.out.println("No se encontró resultados...");

                }

            }

        }
    }

    public void encabezado() {
        linea();
        System.out.println("Codigo\tNombre\t\tTarifa\tHoras\tSueldo");
        linea();
    }

    public void linea() {
        System.out.println("*********************************************************");
    }
}
