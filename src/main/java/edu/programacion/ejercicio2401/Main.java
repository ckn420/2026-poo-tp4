package edu.programacion.ejercicio2401;

import java.util.List;

/**
 * Prueba del ejercicio 2401.
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
        System.out.println("=== 2401 - Clases e instancias ===");
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

        Cuadrado cuadrado = new Cuadrado(2);
        System.out.println("Un Cuadrado es un Rectangulo? "
                + (cuadrado instanceof Rectangulo));
        System.out.println("Un Circulo es una Elipse? "
                + (new Circulo(1) instanceof Elipse));
    }
}
