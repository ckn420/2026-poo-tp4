package edu.programacion.ejercicio2401;

/**
 * Polígono de cuatro lados con ángulos rectos.
 */
public class Rectangulo extends Poligono {
    private double base;
    private double altura;

    /**
     * @param base   base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int cantidadDeLados() {
        return 4;
    }

    @Override
    public double area() {
        return base * altura;
    }

    /**
     * @return la base
     */
    public double getBase() {
        return base;
    }

    /**
     * @return la altura
     */
    public double getAltura() {
        return altura;
    }
}
