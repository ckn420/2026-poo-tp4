package edu.programacion.ejercicio2402;

import java.util.List;

/**
 * Prueba del ejercicio 2402.
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
        System.out.println("=== 2402 - Álbum de fotos ===");
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
}
