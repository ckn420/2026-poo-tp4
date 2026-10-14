package edu.programacion.ejercicio2401;

/**
 * Figura que delimita una región del plano y por lo tanto tiene área.
 */
public abstract class FiguraCerrada extends Figura {

    @Override
    public boolean esCerrada() {
        return true;
    }

    /**
     * Calcula el área de la figura.
     *
     * @return el área
     */
    public abstract double area();
}
