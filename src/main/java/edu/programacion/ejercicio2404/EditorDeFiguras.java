package edu.programacion.ejercicio2404;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Editor de figuras: mantiene una colección de figuras de cualquier tipo
 * y les delega el pintado y el cálculo de área (polimorfismo).
 */
public class EditorDeFiguras {
    private List<Figura> figuras;

    /**
     * Crea un editor sin figuras.
     */
    public EditorDeFiguras() {
        this.figuras = new ArrayList<>();
    }

    /**
     * @param figura figura a agregar
     */
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    /**
     * @param figura figura a borrar
     * @return true si la figura estaba en el editor
     */
    public boolean borrarFigura(Figura figura) {
        return figuras.remove(figura);
    }

    /**
     * Pinta todas las figuras de la colección.
     */
    public void pintar() {
        for (Figura figura : figuras) {
            figura.pintar();
        }
    }

    /**
     * @return la suma de las áreas de todas las figuras
     */
    public double calcularArea() {
        double total = 0;
        for (Figura figura : figuras) {
            total += figura.getArea();
        }
        return total;
    }

    /**
     * @return cantidad de figuras en el editor
     */
    public int cantidadDeFiguras() {
        return figuras.size();
    }

    /**
     * @return las figuras (vista de solo lectura)
     */
    public List<Figura> getFiguras() {
        return Collections.unmodifiableList(figuras);
    }
}
