package edu.programacion.ejercicio2406;

/**
 * Película: una producción con una duración única.
 */
public class Pelicula extends Produccion {
    private int duracionMinutos;

    /**
     * @param titulo          título
     * @param anio            año de estreno
     * @param genero          género
     * @param duracionMinutos duración en minutos
     */
    public Pelicula(String titulo, int anio, String genero, int duracionMinutos) {
        super(titulo, anio, genero);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public int duracionTotal() {
        return duracionMinutos;
    }
}
