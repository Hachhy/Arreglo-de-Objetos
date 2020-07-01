package practica_2;

public class persona {

    private String codigo, nombre;
    private double tarifa, sueldo;
    private int horas;

    public void registrar(String cod, String nom, double tar, int h) {
        this.codigo = cod;
        this.nombre = nom;
        this.tarifa = tar;
        this.horas = h;
        this.sueldo = 0;

    }

    public double obtenerSueldo() {
        sueldo = tarifa * horas;
        return sueldo;
    }

    public String getCodigo() {

        return codigo;
    }

    public void mostrar() {
        System.out.println(codigo + "\t" + nombre + "\t" + tarifa + "\t" + horas + "\t" + obtenerSueldo());
    }
}
