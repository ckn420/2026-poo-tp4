package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.programacion.ejercicio2401.Circulo;
import edu.programacion.ejercicio2401.Cuadrado;
import edu.programacion.ejercicio2401.Elipse;
import edu.programacion.ejercicio2401.FiguraAbierta;
import edu.programacion.ejercicio2401.FiguraCerrada;
import edu.programacion.ejercicio2401.Poligono;
import edu.programacion.ejercicio2401.Punto;
import edu.programacion.ejercicio2401.Rectangulo;
import edu.programacion.ejercicio2401.Segmento;
import edu.programacion.ejercicio2401.Triangulo;
import org.junit.jupiter.api.Test;

class FigurasJerarquiaTest {

    @Test
    void circuloEsUnaElipse() {
        assertTrue(new Circulo(1) instanceof Elipse);
    }

    @Test
    void cuadradoEsRectanguloYPoligono() {
        Cuadrado cuadrado = new Cuadrado(3);
        assertTrue(cuadrado instanceof Rectangulo);
        assertTrue(cuadrado instanceof Poligono);
        assertEquals(9, cuadrado.area(), 1e-9);
        assertEquals(4, cuadrado.cantidadDeLados());
    }

    @Test
    void segmentoEsFiguraAbierta() {
        Segmento segmento = new Segmento(new Punto(0, 0), new Punto(3, 4));
        assertTrue(segmento instanceof FiguraAbierta);
        assertFalse(segmento.esCerrada());
        assertEquals(5, segmento.longitud(), 1e-9);
    }

    @Test
    void trianguloEsFiguraCerrada() {
        Triangulo triangulo = new Triangulo(4, 3);
        assertTrue(triangulo instanceof FiguraCerrada);
        assertTrue(triangulo.esCerrada());
        assertEquals(6, triangulo.area(), 1e-9);
    }
}
