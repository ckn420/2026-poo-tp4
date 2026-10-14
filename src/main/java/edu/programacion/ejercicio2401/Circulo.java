package edu.programacion.ejercicio2401;

/**
 * Un círculo es una elipse cuyos dos semiejes son iguales (el radio).
 */
public class Circulo extends Elipse {

    /**
     * @param radio radio del círculo
     */
    public Circulo(double radio) {
        super(radio, radio);
    }

    /**
     * @return el radio
     */
    public double getRadio() {
        return getSemiejeMayor();
    }
}
