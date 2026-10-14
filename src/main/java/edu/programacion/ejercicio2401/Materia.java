package edu.programacion.ejercicio2401;

/**
 * Asignatura de una carrera (instancias: Programación Orientada a Objetos, Metodologías de Programación, Paradigmas de Programación, Redes, BBDD).
 */
public class Materia {
    private String nombre;

    /**
     * @param nombre nombre de la instancia
     */
    public Materia(String nombre) {
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
