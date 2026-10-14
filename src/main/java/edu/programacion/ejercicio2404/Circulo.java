package edu.programacion.ejercicio2404;

/**
 * Círculo definido por su radio.
 */
public class Circulo extends Figura {
    private double radio;

    /**
     * @param color color de la figura
     * @param radio radio del círculo
     */
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    /**
     * @return radio del círculo
     */
    public double getRadio() {
        return radio;
    }
}
