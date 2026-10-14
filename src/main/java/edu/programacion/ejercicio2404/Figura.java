package edu.programacion.ejercicio2404;

/**
 * Figura del editor. Todas tienen un color y saben calcular su área.
 */
public abstract class Figura {
    private String color;

    /**
     * @param color color inicial de la figura
     */
    protected Figura(String color) {
        this.color = color;
    }

    /**
     * Setea el color de la figura.
     *
     * @param color nuevo color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return el color de la figura
     */
    public String getColor() {
        return color;
    }

    /**
     * @return el área de la figura
     */
    public abstract double getArea();

    /**
     * Imprime en consola "Pintando FIGURA COLOR".
     */
    public void pintar() {
        System.out.println(descripcionPintado());
    }

    /**
     * @return el texto que imprime {@link #pintar()}
     */
    public String descripcionPintado() {
        return "Pintando " + getClass().getSimpleName().toUpperCase() + " " + color.toUpperCase();
    }
}
