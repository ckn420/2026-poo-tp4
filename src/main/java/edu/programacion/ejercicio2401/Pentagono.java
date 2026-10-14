package edu.programacion.ejercicio2401;

/**
 * Pentágono regular.
 */
public class Pentagono extends Poligono {
    private double lado;
    private double apotema;

    /**
     * @param lado    longitud del lado
     * @param apotema apotema
     */
    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public int cantidadDeLados() {
        return 5;
    }

    @Override
    public double area() {
        return cantidadDeLados() * lado * apotema / 2;
    }
}
