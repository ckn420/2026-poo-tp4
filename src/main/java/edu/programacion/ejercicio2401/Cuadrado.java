package edu.programacion.ejercicio2401;

/**
 * Un cuadrado es un rectángulo con todos sus lados iguales.
 *
 * <p>Conceptualmente también es un rombo (lados iguales), pero Java no
 * admite herencia múltiple de clases, así que se lo ubica bajo
 * {@link Rectangulo}.</p>
 */
public class Cuadrado extends Rectangulo {

    /**
     * @param lado longitud del lado
     */
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    /**
     * @return la longitud del lado
     */
    public double getLado() {
        return getBase();
    }
}
