package edu.programacion.ejercicio2401;

/**
 * Polígono de tres lados.
 */
public class Triangulo extends Poligono {
    private double base;
    private double altura;

    /**
     * @param base   base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int cantidadDeLados() {
        return 3;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}
