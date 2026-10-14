package edu.programacion.ejercicio2402;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Álbum de fotos electrónico.
 *
 * <p>Las fotos no ocupan un lugar determinado y el álbum no tiene límite,
 * por eso se usa una {@link ArrayList}, que crece sola a medida que se
 * agregan elementos.</p>
 */
public class AlbumDeFotos {
    private String nombre;
    private List<Foto> fotos;

    /**
     * Crea un álbum vacío sin nombre.
     */
    public AlbumDeFotos() {
        this("Sin nombre");
    }

    /**
     * @param nombre nombre del álbum
     */
    public AlbumDeFotos(String nombre) {
        this.nombre = nombre;
        this.fotos = new ArrayList<>();
    }

    /**
     * Agrega una foto al álbum.
     *
     * @param foto la foto a agregar
     */
    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    /**
     * Agrega una colección de fotos al álbum.
     *
     * @param nuevasFotos las fotos a agregar
     */
    public void agregarFotos(Collection<Foto> nuevasFotos) {
        fotos.addAll(nuevasFotos);
    }

    /**
     * Elimina una foto del álbum.
     *
     * @param foto la foto a eliminar
     * @return true si la foto estaba en el álbum
     */
    public boolean eliminarFoto(Foto foto) {
        return fotos.remove(foto);
    }

    /**
     * Elimina todas las fotos del álbum.
     */
    public void limpiar() {
        fotos.clear();
    }

    /**
     * @return cantidad de fotos en el álbum
     */
    public int cantidadDeFotos() {
        return fotos.size();
    }

    /**
     * @return true si el álbum no tiene fotos
     */
    public boolean estaVacio() {
        return fotos.isEmpty();
    }

    /**
     * @param foto la foto a buscar
     * @return true si la foto está en el álbum
     */
    public boolean contiene(Foto foto) {
        return fotos.contains(foto);
    }

    /**
     * @return las fotos del álbum (vista de solo lectura)
     */
    public List<Foto> getFotos() {
        return Collections.unmodifiableList(fotos);
    }

    /**
     * @return nombre del álbum
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre del álbum
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Álbum '" + nombre + "' " + fotos;
    }
}
