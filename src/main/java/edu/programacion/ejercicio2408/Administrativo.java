package edu.programacion.ejercicio2408;

/**
 * Empleado administrativo: cobra según su categoría (1 a 4) y su
 * antigüedad, con la fórmula del enunciado: antigüedad * categoría.
 */
public class Administrativo extends Empleado {
    /** Categoría mínima válida. */
    public static final int CATEGORIA_MINIMA = 1;
    /** Categoría máxima válida. */
    public static final int CATEGORIA_MAXIMA = 4;

    private int categoria;
    private int antiguedad;

    /**
     * @param nombre           nombre completo
     * @param dni              DNI
     * @param direccion        dirección
     * @param anioDeNacimiento año de nacimiento
     * @param sexo             sexo
     * @param funcion          función
     * @param categoria        categoría (1, 2, 3 o 4)
     * @param antiguedad       años de antigüedad
     */
    public Administrativo(String nombre, int dni, String direccion, int anioDeNacimiento, char sexo,
                          String funcion, int categoria, int antiguedad) {
        super(nombre, dni, direccion, anioDeNacimiento, sexo, funcion);
        this.categoria = validarCategoria(categoria);
        this.antiguedad = antiguedad;
    }

    @Override
    public double getSueldo() {
        return antiguedad * categoria;
    }

    /**
     * @return categoría
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria nueva categoría (1 a 4)
     * @throws IllegalArgumentException si la categoría está fuera de rango
     */
    public void setCategoria(int categoria) {
        this.categoria = validarCategoria(categoria);
    }

    private static int validarCategoria(int categoria) {
        if (categoria < CATEGORIA_MINIMA || categoria > CATEGORIA_MAXIMA) {
            throw new IllegalArgumentException("La categoría debe estar entre 1 y 4");
        }
        return categoria;
    }

    /**
     * @return años de antigüedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * Suma un año de antigüedad.
     */
    public void cumplirAnio() {
        antiguedad++;
    }
}
