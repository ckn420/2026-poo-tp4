package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.programacion.ejercicio2407.Conjunto;
import edu.programacion.ejercicio2407.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConjuntoTest {
    private Persona ana;
    private Persona beto;
    private Persona carla;
    private Persona dani;
    private Conjunto a;
    private Conjunto b;

    @BeforeEach
    void setUp() {
        ana = new Persona("Ana", 1);
        beto = new Persona("Beto", 2);
        carla = new Persona("Carla", 3);
        dani = new Persona("Dani", 4);
        a = new Conjunto(ana, beto, carla);
        b = new Conjunto(carla, dani);
    }

    @Test
    void noAdmiteRepetidos() {
        assertFalse(a.add(new Persona("Ana otra vez", 1)));
        assertEquals(3, a.tamanio());
    }

    @Test
    void union() {
        assertEquals(new Conjunto(ana, beto, carla, dani), a.union(b));
    }

    @Test
    void interseccion() {
        assertEquals(new Conjunto(carla), a.interseccion(b));
    }

    @Test
    void diferencia() {
        assertEquals(new Conjunto(ana, beto), a.diferencia(b));
    }

    @Test
    void diferenciaSimetrica() {
        assertEquals(new Conjunto(ana, beto, dani), a.diferenciaSimetrica(b));
    }

    @Test
    void lasOperacionesNoModificanLosOriginales() {
        a.union(b);
        assertEquals(3, a.tamanio());
        assertEquals(2, b.tamanio());
    }

    @Test
    void remove() {
        assertTrue(a.remove(ana));
        assertFalse(a.contiene(ana));
    }
}
