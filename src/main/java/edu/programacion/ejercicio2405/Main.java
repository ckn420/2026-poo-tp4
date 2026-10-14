package edu.programacion.ejercicio2405;

import java.time.LocalDate;

/**
 * Prueba del ejercicio 2405.
 */
public final class Main {

    private Main() {
    }

    /**
     * Punto de entrada.
     *
     * @param args no se usan
     */
    public static void main(String[] args) {
        System.out.println("=== 2405 - Librería ===");
        Libreria libreria = new Libreria("El Ateneo");
        Libro ficciones = new Libro("Ficciones", "Jorge Luis Borges", LocalDate.of(1944, 1, 1), 5);
        Libro rayuela = new Libro("Rayuela", "Julio Cortázar", LocalDate.of(1963, 6, 28), 3);
        rayuela.agregarPersonaje("Horacio Oliveira");
        rayuela.agregarPersonaje("La Maga");
        libreria.agregarLibro(ficciones);
        libreria.agregarLibro(rayuela);
        System.out.println("Libros: " + libreria.cantidadDeLibros()
                + " | Copias: " + libreria.cantidadTotalDeCopias());
        libreria.eliminarLibro(ficciones);
        System.out.println("Después de eliminar Ficciones: " + libreria.getLibros());
    }
}
