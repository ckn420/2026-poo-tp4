package edu.programacion.ejercicio2401;

/**
 * Institución de educación superior (instancias: UTN, UNLP, UBA).
 */
public class Universidad {
    private String nombre;

    /**
     * @param nombre nombre de la instancia
     */
    public Universidad(String nombre) {
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
