package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.programacion.ejercicio2404.Circulo;
import edu.programacion.ejercicio2404.Cuadrado;
import edu.programacion.ejercicio2404.EditorDeFiguras;
import edu.programacion.ejercicio2404.Figura;
import edu.programacion.ejercicio2404.Linea;
import edu.programacion.ejercicio2404.Triangulo;
import org.junit.jupiter.api.Test;

class EditorDeFigurasTest {

    @Test
    void calcularAreaSumaTodas() {
        EditorDeFiguras editor = new EditorDeFiguras();
        editor.agregarFigura(new Cuadrado("rojo", 2));
        editor.agregarFigura(new Triangulo("verde", 3, 4));
        editor.agregarFigura(new Linea("negro", 10));
        assertEquals(10, editor.calcularArea(), 1e-9);
    }

    @Test
    void borrarFigura() {
        EditorDeFiguras editor = new EditorDeFiguras();
        Figura circulo = new Circulo("azul", 1);
        editor.agregarFigura(circulo);
        assertTrue(editor.borrarFigura(circulo));
        assertEquals(0, editor.cantidadDeFiguras());
    }

    @Test
    void colorYPintado() {
        Figura cuadrado = new Cuadrado("rojo", 1);
        cuadrado.setColor("azul");
        assertEquals("azul", cuadrado.getColor());
        assertEquals("Pintando CUADRADO AZUL", cuadrado.descripcionPintado());
    }
}
