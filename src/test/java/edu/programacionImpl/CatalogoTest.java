package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.programacion.ejercicio2406.Actor;
import edu.programacion.ejercicio2406.Capitulo;
import edu.programacion.ejercicio2406.Catalogo;
import edu.programacion.ejercicio2406.Pelicula;
import edu.programacion.ejercicio2406.Personaje;
import edu.programacion.ejercicio2406.Serie;
import org.junit.jupiter.api.Test;

class CatalogoTest {

    @Test
    void serieSumaCapitulos() {
        Serie serie = new Serie("S", 2020, "Drama");
        serie.agregarCapitulo(new Capitulo(1, 1, "Uno", 40));
        serie.agregarCapitulo(new Capitulo(2, 1, "Dos", 45));
        assertEquals(2, serie.cantidadDeCapitulos());
        assertEquals(2, serie.cantidadDeTemporadas());
        assertEquals(85, serie.duracionTotal());
    }

    @Test
    void personajeSumaActorAlElencoSinRepetir() {
        Actor actor = new Actor("X", "AR");
        Pelicula pelicula = new Pelicula("P", 2000, "Acción", 90);
        pelicula.agregarPersonaje(new Personaje("Uno", actor));
        pelicula.agregarPersonaje(new Personaje("Dos", actor));
        assertEquals(1, pelicula.getActores().size());
        assertEquals(2, pelicula.getPersonajes().size());
    }

    @Test
    void catalogoFiltraPorTipo() {
        Catalogo catalogo = new Catalogo();
        catalogo.agregar(new Pelicula("P", 2000, "Acción", 90));
        catalogo.agregar(new Serie("S", 2020, "Drama"));
        assertEquals(1, catalogo.getPeliculas().size());
        assertEquals(1, catalogo.getSeries().size());
        assertEquals("S", catalogo.buscarPorTitulo("s").getTitulo());
    }
}
