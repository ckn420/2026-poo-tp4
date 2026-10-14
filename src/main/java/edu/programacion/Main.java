package edu.programacion;

import edu.programacion.ejercicio2401.CarreraUniversitaria;
import edu.programacion.ejercicio2401.Docente;
import edu.programacion.ejercicio2401.Facultad;
import edu.programacion.ejercicio2401.LenguajeDeProgramacion;
import edu.programacion.ejercicio2401.Materia;
import edu.programacion.ejercicio2401.Universidad;
import edu.programacion.ejercicio2402.AlbumDeFotos;
import edu.programacion.ejercicio2402.Foto;
import edu.programacion.ejercicio2403.Escala;
import edu.programacion.ejercicio2403.Temperature;
import edu.programacion.ejercicio2404.Circulo;
import edu.programacion.ejercicio2404.Cuadrado;
import edu.programacion.ejercicio2404.EditorDeFiguras;
import edu.programacion.ejercicio2404.Linea;
import edu.programacion.ejercicio2404.Triangulo;
import edu.programacion.ejercicio2405.Libreria;
import edu.programacion.ejercicio2405.Libro;
import edu.programacion.ejercicio2406.Actor;
import edu.programacion.ejercicio2406.Capitulo;
import edu.programacion.ejercicio2406.Catalogo;
import edu.programacion.ejercicio2406.Director;
import edu.programacion.ejercicio2406.Pelicula;
import edu.programacion.ejercicio2406.Personaje;
import edu.programacion.ejercicio2406.Serie;
import edu.programacion.ejercicio2407.Conjunto;
import edu.programacion.ejercicio2407.Persona;
import edu.programacion.ejercicio2408.Administrativo;
import edu.programacion.ejercicio2408.Empresa;
import edu.programacion.ejercicio2408.Tecnico;

import java.time.LocalDate;
import java.util.List;

/**
 * Demostración de los ejercicios 2401 a 2408.
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
        ejercicio2401();
        ejercicio2402();
        ejercicio2403();
        ejercicio2404();
        ejercicio2405();
        ejercicio2406();
        ejercicio2407();
        ejercicio2408();
    }

    private static void titulo(String texto) {
        System.out.println();
        System.out.println("=== " + texto + " ===");
    }

    private static void ejercicio2401() {
        titulo("2401 - Clases e instancias");
        List<Object> instancias = List.of(
                new Universidad("UTN"), new Universidad("UNLP"), new Universidad("UBA"),
                new Facultad("Facultad de Derecho"), new Facultad("Facultad de Ciencias Exactas"),
                new CarreraUniversitaria("Abogacía"),
                new CarreraUniversitaria("Licenciatura en Informática"),
                new Materia("Programación Orientada a Objetos"),
                new Materia("Metodologías de Programación"),
                new Materia("Paradigmas de Programación"),
                new Materia("Redes"), new Materia("BBDD"),
                new Docente("Natalia Palmieri"), new Docente("Daniela Gratone"),
                new Docente("Alejandro Ottaviani"), new Docente("Franco Borzi"),
                new LenguajeDeProgramacion("Pascal"), new LenguajeDeProgramacion("Smalltalk"),
                new LenguajeDeProgramacion("Java"), new LenguajeDeProgramacion("C++"),
                new LenguajeDeProgramacion("Lisp"), new LenguajeDeProgramacion("Python"));
        instancias.forEach(System.out::println);

        edu.programacion.ejercicio2401.Cuadrado cuadrado = new edu.programacion.ejercicio2401.Cuadrado(2);
        System.out.println("Un Cuadrado es un Rectangulo? "
                + (cuadrado instanceof edu.programacion.ejercicio2401.Rectangulo));
        System.out.println("Un Circulo es una Elipse? "
                + (new edu.programacion.ejercicio2401.Circulo(1) instanceof edu.programacion.ejercicio2401.Elipse));
    }

    private static void ejercicio2402() {
        titulo("2402 - Álbum de fotos");
        AlbumDeFotos album = new AlbumDeFotos("Vacaciones");
        album.agregarFoto(new Foto("playa.jpg"));
        album.agregarFotos(List.of(new Foto("montania.jpg"), new Foto("rio.jpg")));
        System.out.println(album + " -> " + album.cantidadDeFotos() + " fotos");
        album.eliminarFoto(new Foto("rio.jpg"));
        System.out.println("Después de eliminar rio.jpg: " + album.cantidadDeFotos());
        album.setNombre("Verano 2026");
        album.limpiar();
        System.out.println(album + " vacío? " + album.estaVacio());
    }

    private static void ejercicio2403() {
        titulo("2403 - Convertidor de temperaturas");
        Temperature t = new Temperature();
        System.out.println("new: " + t.getCelsius() + " °C");
        t.setCelsius(100);
        System.out.printf("100 °C = %.2f °F = %.2f K%n", t.getFahrenheit(), t.getKelvin());
        t.setFahrenheit(32);
        System.out.println("setFahrenheit(32) -> " + t);
        System.out.printf("convertTemperature(0, KELVIN, CELSIUS) = %.2f%n",
                t.convertTemperature(0, Escala.KELVIN, Escala.CELSIUS));
    }

    private static void ejercicio2404() {
        titulo("2404 - Editor de figuras");
        EditorDeFiguras editor = new EditorDeFiguras();
        editor.agregarFigura(new Cuadrado("rojo", 2));
        editor.agregarFigura(new Circulo("azul", 1));
        editor.agregarFigura(new Triangulo("verde", 3, 4));
        editor.agregarFigura(new Linea("negro", 10));
        editor.pintar();
        System.out.printf("Área total: %.2f%n", editor.calcularArea());
    }

    private static void ejercicio2405() {
        titulo("2405 - Librería");
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

    private static void ejercicio2406() {
        titulo("2406 - Películas y series");
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

    private static void ejercicio2407() {
        titulo("2407 - Conjuntos");
        Persona ana = new Persona("Ana", 1);
        Persona beto = new Persona("Beto", 2);
        Persona carla = new Persona("Carla", 3);
        Persona dani = new Persona("Dani", 4);
        Persona eva = new Persona("Eva", 5);

        Conjunto a = new Conjunto(ana, beto, carla);
        Conjunto b = new Conjunto(carla, dani);
        Conjunto c = new Conjunto(beto, eva);
        System.out.println("A = " + a + "  B = " + b + "  C = " + c);
        System.out.println("Unión A y B = " + a.union(b));
        System.out.println("Unión A y C = " + a.union(c));
        System.out.println("Intersección A y B = " + a.interseccion(b));
        System.out.println("Intersección A y C = " + a.interseccion(c));
        System.out.println("Diferencia A - B = " + a.diferencia(b));
        System.out.println("Dif. simétrica A y B = " + a.diferenciaSimetrica(b));
        System.out.println("add(Ana) de nuevo en A? " + a.add(new Persona("Ana", 1)));
    }

    private static void ejercicio2408() {
        titulo("2408 - Jerarquía de empleados");
        Empresa empresa = new Empresa("Quales");
        empresa.agregarEmpleado(new Tecnico("Lucía Gómez", 30111222, "Mitre 123", 1990, 'F',
                "Soporte", "Técnica en Redes", 850000));
        empresa.agregarEmpleado(new Administrativo("Pedro Ruiz", 28333444, "Belgrano 45", 1985, 'M',
                "Facturación", 3, 10));
        empresa.getEmpleados().forEach(e -> System.out.println(e + " -> " + e.getSueldo()));
        System.out.println("Monto total: " + empresa.montoTotal());
    }
}
