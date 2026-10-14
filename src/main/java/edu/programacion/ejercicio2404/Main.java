package edu.programacion.ejercicio2404;

/**
 * Prueba del ejercicio 2404.
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
        System.out.println("=== 2404 - Editor de figuras ===");
        EditorDeFiguras editor = new EditorDeFiguras();
        editor.agregarFigura(new Cuadrado("rojo", 2));
        editor.agregarFigura(new Circulo("azul", 1));
        editor.agregarFigura(new Triangulo("verde", 3, 4));
        editor.agregarFigura(new Linea("negro", 10));
        editor.pintar();
        System.out.printf("Área total: %.2f%n", editor.calcularArea());
    }
}
