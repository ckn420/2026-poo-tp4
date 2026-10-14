package edu.programacion.ejercicio2406;

/**
 * Personaje de una producción, interpretado por un actor.
 */
public class Personaje {
    private String nombre;
    private Actor interpretadoPor;

    /**
     * @param nombre          nombre del personaje
     * @param interpretadoPor actor que lo interpreta
     */
    public Personaje(String nombre, Actor interpretadoPor) {
        this.nombre = nombre;
        this.interpretadoPor = interpretadoPor;
    }

    /**
     * @return nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return actor que lo interpreta
     */
    public Actor getInterpretadoPor() {
        return interpretadoPor;
    }

    @Override
    public String toString() {
        return nombre + " (" + interpretadoPor + ")";
    }
}
