package edu.programacion.ejercicio2402;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Una foto electrónica. Se identifica por el nombre de su archivo.
 */
public class Foto {
    private String archivo;
    private String descripcion;
    private LocalDate fecha;

    /**
     * @param archivo nombre del archivo (por ejemplo "playa.jpg")
     */
    public Foto(String archivo) {
        this(archivo, "", LocalDate.now());
    }

    /**
     * @param archivo     nombre del archivo
     * @param descripcion descripción de la foto
     * @param fecha       fecha en que se tomó
     */
    public Foto(String archivo, String descripcion, LocalDate fecha) {
        this.archivo = archivo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    /**
     * @return nombre del archivo
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * @return descripción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return fecha de la foto
     */
    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Foto)) {
            return false;
        }
        return Objects.equals(archivo, ((Foto) o).archivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archivo);
    }

    @Override
    public String toString() {
        return archivo;
    }
}
