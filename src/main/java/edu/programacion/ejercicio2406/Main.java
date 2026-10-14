package edu.programacion.ejercicio2406;

/**
 * Prueba del ejercicio 2406.
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
        System.out.println("=== 2406 - Películas y series ===");
        Actor darin = new Actor("Ricardo Darín", "Argentina");
        Pelicula pelicula = new Pelicula("El secreto de sus ojos", 2009, "Drama", 129);
        pelicula.agregarDirector(new Director("Juan José Campanella", "Argentina"));
        pelicula.agregarPersonaje(new Personaje("Benjamín Espósito", darin));

        Serie serie = new Serie("El Eternauta", 2025, "Ciencia ficción");
        serie.agregarDirector(new Director("Bruno Stagnaro", "Argentina"));
        serie.agregarPersonaje(new Personaje("Juan Salvo", darin));
        serie.agregarCapitulo(new Capitulo(1, 1, "Una noche de truco", 50));
        serie.agregarCapitulo(new Capitulo(1, 2, "Paisaje", 55));

        Catalogo catalogo = new Catalogo();
        catalogo.agregar(pelicula);
        catalogo.agregar(serie);
        System.out.println("Películas: " + catalogo.getPeliculas());
        System.out.println("Series: " + catalogo.getSeries() + " - capítulos: " + serie.getCapitulos());
        System.out.println("Producciones de " + darin + ": " + catalogo.produccionesDe(darin));
    }
}
