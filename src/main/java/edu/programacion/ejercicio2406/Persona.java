package edu.programacion.ejercicio2406;

/**
 * Persona que participa en una producción (actor o director).
 */
public abstract class Persona {
    private String nombre;
    private String nacionalidad;

    /**
     * @param nombre       nombre completo
     * @param nacionalidad nacionalidad
     */
    protected Persona(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
