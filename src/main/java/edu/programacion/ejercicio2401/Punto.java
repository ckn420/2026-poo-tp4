package edu.programacion.ejercicio2401;

/**
 * Un punto del plano. Es la figura más simple: no tiene dimensión.
 */
public class Punto extends Figura {
    private double x;
    private double y;

    /**
     * Crea un punto en el origen.
     */
    public Punto() {
        this(0, 0);
    }

    /**
     * Crea un punto en las coordenadas dadas.
     *
     * @param x coordenada x
     * @param y coordenada y
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return coordenada x
     */
    public double getX() {
        return x;
    }

    /**
     * @return coordenada y
     */
    public double getY() {
        return y;
    }

    /**
     * Calcula la distancia a otro punto.
     *
     * @param otro el otro punto
     * @return la distancia entre ambos puntos
     */
    public double distanciaA(Punto otro) {
        return Math.hypot(x - otro.x, y - otro.y);
    }

    @Override
    public boolean esCerrada() {
        return false;
    }
}
