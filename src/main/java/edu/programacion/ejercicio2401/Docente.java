package edu.programacion.ejercicio2401;

/**
 * Persona que dicta materias (instancias: Natalia Palmieri, Daniela Gratone, Alejandro Ottaviani, Franco Borzi).
 */
public class Docente {
    private String nombre;

    /**
     * @param nombre nombre de la instancia
     */
    public Docente(String nombre) {
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
