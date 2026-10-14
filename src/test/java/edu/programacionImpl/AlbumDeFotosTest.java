package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.programacion.ejercicio2402.AlbumDeFotos;
import edu.programacion.ejercicio2402.Foto;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlbumDeFotosTest {
    private AlbumDeFotos album;

    @BeforeEach
    void setUp() {
        album = new AlbumDeFotos("Vacaciones");
    }

    @Test
    void agregarDeAUnaYVarias() {
        album.agregarFoto(new Foto("a.jpg"));
        album.agregarFotos(List.of(new Foto("b.jpg"), new Foto("c.jpg")));
        assertEquals(3, album.cantidadDeFotos());
    }

    @Test
    void eliminarUnaFoto() {
        album.agregarFotos(List.of(new Foto("a.jpg"), new Foto("b.jpg")));
        assertTrue(album.eliminarFoto(new Foto("a.jpg")));
        assertEquals(1, album.cantidadDeFotos());
        assertFalse(album.contiene(new Foto("a.jpg")));
    }

    @Test
    void limpiarYRenombrar() {
        album.agregarFoto(new Foto("a.jpg"));
        album.limpiar();
        album.setNombre("Nuevo");
        assertTrue(album.estaVacio());
        assertEquals("Nuevo", album.getNombre());
    }
}
