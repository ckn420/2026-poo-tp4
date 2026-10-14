package edu.programacion.ejercicio2401;

/**
 * Figura que no delimita una región del plano (por ejemplo, un segmento).
 */
public abstract class FiguraAbierta extends Figura {

    @Override
    public boolean esCerrada() {
        return false;
    }
}
