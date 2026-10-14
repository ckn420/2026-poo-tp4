package edu.programacion.ejercicio2404;

/**
 * Línea definida por su longitud. Al no ser cerrada, su área es 0.
 */
public class Linea extends Figura {
    private double longitud;

    /**
     * @param color color de la figura
     * @param longitud longitud de la línea
     */
    public Linea(String color, double longitud) {
        super(color);
        this.longitud = longitud;
    }

    @Override
    public double getArea() {
        return 0;
    }

    /**
     * @return longitud de la línea
     */
    public double getLongitud() {
        return longitud;
    }
}
