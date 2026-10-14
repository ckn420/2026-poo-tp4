package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lo común a películas y series: título, año, género, actores,
 * directores y personajes.
 */
public abstract class Produccion {
    private String titulo;
    private int anio;
    private String genero;
    private List<Actor> actores;
    private List<Director> directores;
    private List<Personaje> personajes;

    /**
     * @param titulo título
     * @param anio   año de estreno
     * @param genero género
     */
    protected Produccion(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.actores = new ArrayList<>();
        this.directores = new ArrayList<>();
        this.personajes = new ArrayList<>();
    }

    /**
     * @param actor actor a agregar al elenco
     */
    public void agregarActor(Actor actor) {
        if (!actores.contains(actor)) {
            actores.add(actor);
        }
    }

    /**
     * @param director director a agregar
     */
    public void agregarDirector(Director director) {
        if (!directores.contains(director)) {
            directores.add(director);
        }
    }

    /**
     * Agrega un personaje y suma automáticamente a su actor al elenco.
     *
     * @param personaje personaje a agregar
     */
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
        agregarActor(personaje.getInterpretadoPor());
    }

    /**
     * @return duración total en minutos
     */
    public abstract int duracionTotal();

    /**
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return año de estreno
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @return género
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @return actores (solo lectura)
     */
    public List<Actor> getActores() {
        return Collections.unmodifiableList(actores);
    }

    /**
     * @return directores (solo lectura)
     */
    public List<Director> getDirectores() {
        return Collections.unmodifiableList(directores);
    }

    /**
     * @return personajes (solo lectura)
     */
    public List<Personaje> getPersonajes() {
        return Collections.unmodifiableList(personajes);
    }

    @Override
    public String toString() {
        return titulo + " (" + anio + ")";
    }
}
