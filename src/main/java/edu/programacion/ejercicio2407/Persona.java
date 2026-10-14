package edu.programacion.ejercicio2407;

import java.util.Objects;

/**
 * Persona que puede pertenecer a un {@link Conjunto}. Dos personas son
 * iguales si tienen el mismo DNI; eso es lo que usa el conjunto para
 * evitar repetidos.
 */
public class Persona {
    private String nombre;
    private int dni;

    /**
     * @param nombre nombre de la persona
     * @param dni    DNI (identifica a la persona)
     */
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return DNI
     */
    public int getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Persona)) {
            return false;
        }
        return dni == ((Persona) o).dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
