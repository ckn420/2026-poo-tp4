package edu.programacion.ejercicio2401;

/**
 * Polígono de cuatro lados iguales.
 */
public class Rombo extends Poligono {
    private double diagonalMayor;
    private double diagonalMenor;

    /**
     * @param diagonalMayor diagonal mayor
     * @param diagonalMenor diagonal menor
     */
    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public int cantidadDeLados() {
        return 4;
    }

    @Override
    public double area() {
        return diagonalMayor * diagonalMenor / 2;
    }
}
