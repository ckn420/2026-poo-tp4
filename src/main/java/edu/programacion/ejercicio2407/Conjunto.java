package edu.programacion.ejercicio2407;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Conjunto de personas: una colección sin elementos repetidos.
 *
 * <p>Internamente usa una {@link ArrayList} y es la propia clase la que
 * controla que no haya repetidos (usando {@code equals} de {@link Persona}).
 * Las operaciones de conjuntos no modifican a los conjuntos originales:
 * devuelven un conjunto nuevo.</p>
 */
public class Conjunto {
    private List<Persona> elementos;

    /**
     * Crea un conjunto vacío.
     */
    public Conjunto() {
        this.elementos = new ArrayList<>();
    }

    /**
     * Crea un conjunto con las personas dadas (los repetidos se ignoran).
     *
     * @param personas personas iniciales
     */
    public Conjunto(Persona... personas) {
        this();
        for (Persona persona : personas) {
            if (!elementos.contains(persona)) {
                elementos.add(persona);
            }
        }
    }

    /**
     * Agrega una persona si no está en el conjunto.
     *
     * @param persona persona a agregar
     * @return true si se agregó, false si ya estaba
     */
    public boolean add(Persona persona) {
        if (contiene(persona)) {
            return false;
        }
        return elementos.add(persona);
    }

    /**
     * Quita una persona del conjunto.
     *
     * @param persona persona a quitar
     * @return true si estaba en el conjunto
     */
    public boolean remove(Persona persona) {
        return elementos.remove(persona);
    }

    /**
     * @param persona persona a buscar
     * @return true si pertenece al conjunto
     */
    public boolean contiene(Persona persona) {
        return elementos.contains(persona);
    }

    /**
     * @return cantidad de elementos
     */
    public int tamanio() {
        return elementos.size();
    }

    /**
     * @return true si el conjunto no tiene elementos
     */
    public boolean estaVacio() {
        return elementos.isEmpty();
    }

    /**
     * A ∪ B: los elementos que están en A o en B.
     *
     * @param set el otro conjunto
     * @return un conjunto nuevo con la unión
     */
    public Conjunto union(Conjunto set) {
        Conjunto resultado = copia();
        for (Persona persona : set.elementos) {
            resultado.add(persona);
        }
        return resultado;
    }

    /**
     * A ∩ B: los elementos que están en A y también en B.
     *
     * @param set el otro conjunto
     * @return un conjunto nuevo con la intersección
     */
    public Conjunto interseccion(Conjunto set) {
        Conjunto resultado = new Conjunto();
        for (Persona persona : elementos) {
            if (set.contiene(persona)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }

    /**
     * A − B: los elementos de A que no están en B.
     *
     * @param set el otro conjunto
     * @return un conjunto nuevo con la diferencia
     */
    public Conjunto diferencia(Conjunto set) {
        Conjunto resultado = new Conjunto();
        for (Persona persona : elementos) {
            if (!set.contiene(persona)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }

    /**
     * A Δ B: los elementos que están en A o en B, pero no en ambos.
     * Equivale a (A − B) ∪ (B − A).
     *
     * @param set el otro conjunto
     * @return un conjunto nuevo con la diferencia simétrica
     */
    public Conjunto diferenciaSimetrica(Conjunto set) {
        return this.diferencia(set).union(set.diferencia(this));
    }

    /**
     * @return los elementos (solo lectura)
     */
    public List<Persona> getElementos() {
        return Collections.unmodifiableList(elementos);
    }

    private Conjunto copia() {
        Conjunto copia = new Conjunto();
        copia.elementos.addAll(elementos);
        return copia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Conjunto)) {
            return false;
        }
        Conjunto otro = (Conjunto) o;
        return tamanio() == otro.tamanio() && elementos.containsAll(otro.elementos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (Persona persona : elementos) {
            hash += persona.hashCode();
        }
        return hash;
    }

    @Override
    public String toString() {
        return "{" + String.join(", ", elementos.stream().map(Persona::toString).toList()) + "}";
    }
}
