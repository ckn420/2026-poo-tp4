package edu.programacion.ejercicio2401;

/**
 * Lenguaje de programación (instancias: Pascal, Smalltalk, Java, C++, Lisp, Python).
 */
public class LenguajeDeProgramacion {
    private String nombre;

    /**
     * @param nombre nombre de la instancia
     */
    public LenguajeDeProgramacion(String nombre) {
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
