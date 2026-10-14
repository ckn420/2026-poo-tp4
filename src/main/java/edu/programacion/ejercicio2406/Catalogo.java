package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sistema de información de películas y series.
 */
public class Catalogo {
    private List<Produccion> producciones;

    /**
     * Crea un catálogo vacío.
     */
    public Catalogo() {
        this.producciones = new ArrayList<>();
    }

    /**
     * @param produccion película o serie a agregar
     */
    public void agregar(Produccion produccion) {
        producciones.add(produccion);
    }

    /**
     * @param titulo título a buscar (no distingue mayúsculas)
     * @return la producción encontrada o null si no existe
     */
    public Produccion buscarPorTitulo(String titulo) {
        for (Produccion produccion : producciones) {
            if (produccion.getTitulo().equalsIgnoreCase(titulo)) {
                return produccion;
            }
        }
        return null;
    }

    /**
     * @return solo las películas
     */
    public List<Pelicula> getPeliculas() {
        List<Pelicula> resultado = new ArrayList<>();
        for (Produccion produccion : producciones) {
            if (produccion instanceof Pelicula) {
                resultado.add((Pelicula) produccion);
            }
        }
        return resultado;
    }

    /**
     * @return solo las series
     */
    public List<Serie> getSeries() {
        List<Serie> resultado = new ArrayList<>();
        for (Produccion produccion : producciones) {
            if (produccion instanceof Serie) {
                resultado.add((Serie) produccion);
            }
        }
        return resultado;
    }

    /**
     * @param actor actor a buscar
     * @return producciones en las que actúa
     */
    public List<Produccion> produccionesDe(Actor actor) {
        List<Produccion> resultado = new ArrayList<>();
        for (Produccion produccion : producciones) {
            if (produccion.getActores().contains(actor)) {
                resultado.add(produccion);
            }
        }
        return resultado;
    }

    /**
     * @return todas las producciones (solo lectura)
     */
    public List<Produccion> getProducciones() {
        return Collections.unmodifiableList(producciones);
    }
}
