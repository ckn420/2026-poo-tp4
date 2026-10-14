package edu.programacion.ejercicio2401;

/**
 * Unidad académica de una universidad (instancias: Facultad de Derecho, Facultad de Ciencias Exactas).
 */
public class Facultad {
    private String nombre;

    /**
     * @param nombre nombre de la instancia
     */
    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + getClass().getSimpleName() + ")";
    }
}
