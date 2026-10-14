package edu.programacion.ejercicio2404;

/**
 * Cuadrado definido por su lado.
 */
public class Cuadrado extends Figura {
    private double lado;

    /**
     * @param color color de la figura
     * @param lado longitud del lado
     */
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    /**
     * @return longitud del lado
     */
    public double getLado() {
        return lado;
    }
}
