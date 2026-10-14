package edu.programacion.ejercicio2405;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Librería con una colección de libros.
 */
public class Libreria {
    private String nombre;
    private List<Libro> libros;

    /**
     * @param nombre nombre de la librería
     */
    public Libreria(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    /**
     * Agrega un libro a la colección.
     *
     * @param unLibro libro a agregar
     */
    public void agregarLibro(Libro unLibro) {
        libros.add(unLibro);
    }

    /**
     * Elimina un libro de la colección.
     *
     * @param unLibro libro a eliminar
     * @return true si el libro estaba en la colección
     */
    public boolean eliminarLibro(Libro unLibro) {
        return libros.remove(unLibro);
    }

    /**
     * @return la cantidad de libros (títulos distintos) de la colección
     */
    public int cantidadDeLibros() {
        return libros.size();
    }

    /**
     * @return la cantidad total de copias sumando todos los libros
     */
    public int cantidadTotalDeCopias() {
        int total = 0;
        for (Libro libro : libros) {
            total += libro.getCantidadDeCopias();
        }
        return total;
    }

    /**
     * @return los libros (solo lectura)
     */
    public List<Libro> getLibros() {
        return Collections.unmodifiableList(libros);
    }

    /**
     * @return nombre de la librería
     */
    public String getNombre() {
        return nombre;
    }
}
