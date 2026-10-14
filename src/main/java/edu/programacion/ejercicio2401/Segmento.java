package edu.programacion.ejercicio2401;

/**
 * Segmento de recta definido por dos puntos. Es una figura abierta.
 */
public class Segmento extends FiguraAbierta {
    private Punto inicio;
    private Punto fin;

    /**
     * Crea un segmento entre dos puntos.
     *
     * @param inicio punto inicial
     * @param fin    punto final
     */
    public Segmento(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * @return la longitud del segmento
     */
    public double longitud() {
        return inicio.distanciaA(fin);
    }

    /**
     * @return punto inicial
     */
    public Punto getInicio() {
        return inicio;
    }

    /**
     * @return punto final
     */
    public Punto getFin() {
        return fin;
    }
}
