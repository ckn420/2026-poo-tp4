package edu.programacion.ejercicio2405;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Libro de la librería.
 */
public class Libro {
    private String titulo;
    private String autor;
    private LocalDate fechaDePublicacion;
    private List<String> personajes;
    private int cantidadDeCopias;

    /**
     * @param titulo             título del libro
     * @param autor              autor
     * @param fechaDePublicacion fecha de publicación
     * @param cantidadDeCopias   copias en stock
     */
    public Libro(String titulo, String autor, LocalDate fechaDePublicacion, int cantidadDeCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaDePublicacion = fechaDePublicacion;
        this.cantidadDeCopias = cantidadDeCopias;
        this.personajes = new ArrayList<>();
    }

    /**
     * @param personaje nombre del personaje a agregar
     */
    public void agregarPersonaje(String personaje) {
        personajes.add(personaje);
    }

    /**
     * @return los personajes del libro (solo lectura)
     */
    public List<String> getPersonajes() {
        return Collections.unmodifiableList(personajes);
    }

    /**
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return fecha de publicación
     */
    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    /**
     * @return copias en stock
     */
    public int getCantidadDeCopias() {
        return cantidadDeCopias;
    }

    /**
     * @param cantidadDeCopias nueva cantidad de copias en stock
     */
    public void setCantidadDeCopias(int cantidadDeCopias) {
        this.cantidadDeCopias = cantidadDeCopias;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ") x" + cantidadDeCopias;
    }
}
