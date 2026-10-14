package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.programacion.ejercicio2405.Libreria;
import edu.programacion.ejercicio2405.Libro;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class LibreriaTest {

    @Test
    void cantidadesDeLibrosYCopias() {
        Libreria libreria = new Libreria("Test");
        Libro a = new Libro("A", "Autor A", LocalDate.of(2000, 1, 1), 5);
        Libro b = new Libro("B", "Autor B", LocalDate.of(2010, 1, 1), 3);
        libreria.agregarLibro(a);
        libreria.agregarLibro(b);
        assertEquals(2, libreria.cantidadDeLibros());
        assertEquals(8, libreria.cantidadTotalDeCopias());
        assertTrue(libreria.eliminarLibro(a));
        assertEquals(1, libreria.cantidadDeLibros());
        assertEquals(3, libreria.cantidadTotalDeCopias());
    }
}
