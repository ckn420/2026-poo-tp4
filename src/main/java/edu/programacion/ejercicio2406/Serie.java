package edu.programacion.ejercicio2406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Serie: una producción que además tiene capítulos.
 */
public class Serie extends Produccion {
    private List<Capitulo> capitulos;

    /**
     * @param titulo título
     * @param anio   año de estreno
     * @param genero género
     */
    public Serie(String titulo, int anio, String genero) {
        super(titulo, anio, genero);
        this.capitulos = new ArrayList<>();
    }

    /**
     * @param capitulo capítulo a agregar
     */
    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    /**
     * @return cantidad de capítulos
     */
    public int cantidadDeCapitulos() {
        return capitulos.size();
    }

    /**
     * @return cantidad de temporadas distintas
     */
    public int cantidadDeTemporadas() {
        int maxima = 0;
        for (Capitulo capitulo : capitulos) {
            maxima = Math.max(maxima, capitulo.getTemporada());
        }
        return maxima;
    }

    @Override
    public int duracionTotal() {
        int total = 0;
        for (Capitulo capitulo : capitulos) {
            total += capitulo.getDuracionMinutos();
        }
        return total;
    }

    /**
     * @return capítulos (solo lectura)
     */
    public List<Capitulo> getCapitulos() {
        return Collections.unmodifiableList(capitulos);
    }
}
