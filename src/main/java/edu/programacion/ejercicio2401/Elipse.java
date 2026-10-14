package edu.programacion.ejercicio2401;

/**
 * Figura cerrada curva definida por dos semiejes.
 */
public class Elipse extends FiguraCerrada {
    private double semiejeMayor;
    private double semiejeMenor;

    /**
     * @param semiejeMayor semieje mayor
     * @param semiejeMenor semieje menor
     */
    public Elipse(double semiejeMayor, double semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    @Override
    public double area() {
        return Math.PI * semiejeMayor * semiejeMenor;
    }

    /**
     * @return semieje mayor
     */
    public double getSemiejeMayor() {
        return semiejeMayor;
    }
}
