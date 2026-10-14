package edu.programacion.ejercicio2406;

/**
 * Capítulo de una serie.
 */
public class Capitulo {
    private int temporada;
    private int numero;
    private String titulo;
    private int duracionMinutos;

    /**
     * @param temporada       número de temporada
     * @param numero          número de capítulo dentro de la temporada
     * @param titulo          título del capítulo
     * @param duracionMinutos duración en minutos
     */
    public Capitulo(int temporada, int numero, String titulo, int duracionMinutos) {
        this.temporada = temporada;
        this.numero = numero;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    /**
     * @return número de temporada
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * @return número de capítulo
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return título del capítulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return duración en minutos
     */
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    @Override
    public String toString() {
        return "T" + temporada + "E" + numero + " - " + titulo;
    }
}
