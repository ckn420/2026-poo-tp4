package edu.programacion.ejercicio2404;

/**
 * Triángulo definido por base y altura.
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    /**
     * @param color color de la figura
     * @param base base del triángulo
     * @param altura altura del triángulo
     */
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura / 2;
    }

    /**
     * @return base del triángulo
     */
    public double getBase() {
        return base;
    }


    /**
     * @return altura del triángulo
     */
    public double getAltura() {
        return altura;
    }
}
