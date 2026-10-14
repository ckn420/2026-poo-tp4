package edu.programacion.ejercicio2401;

/**
 * Hexágono regular.
 */
public class Hexagono extends Poligono {
    private double lado;
    private double apotema;

    /**
     * @param lado    longitud del lado
     * @param apotema apotema
     */
    public Hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public int cantidadDeLados() {
        return 6;
    }

    @Override
    public double area() {
        return cantidadDeLados() * lado * apotema / 2;
    }
}
