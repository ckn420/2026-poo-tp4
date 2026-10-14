package edu.programacion.ejercicio2401;

/**
 * Raíz de la jerarquía de figuras geométricas.
 */
public abstract class Figura {

    /**
     * Devuelve el nombre de la figura (el nombre de su clase).
     *
     * @return nombre de la figura
     */
    public String getNombre() {
        return getClass().getSimpleName();
    }

    /**
     * Indica si la figura es cerrada (delimita una región del plano).
     *
     * @return true si es cerrada
     */
    public abstract boolean esCerrada();

    @Override
    public String toString() {
        return getNombre();
    }
}
