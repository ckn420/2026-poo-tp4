package edu.programacion.ejercicio2401;

/**
 * Carrera que se cursa en una facultad (instancias: Abogacía, Licenciatura en Informática).
 */
public class CarreraUniversitaria {
    private String nombre;

    /**
     * @param nombre nombre de la instancia
     */
    public CarreraUniversitaria(String nombre) {
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
