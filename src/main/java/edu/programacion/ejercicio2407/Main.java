package edu.programacion.ejercicio2407;

/**
 * Prueba del ejercicio 2407.
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
        System.out.println("=== 2407 - Conjuntos ===");
        Persona ana = new Persona("Ana", 1);
        Persona beto = new Persona("Beto", 2);
        Persona carla = new Persona("Carla", 3);
        Persona dani = new Persona("Dani", 4);
        Persona eva = new Persona("Eva", 5);

        Conjunto a = new Conjunto(ana, beto, carla);
        Conjunto b = new Conjunto(carla, dani);
        Conjunto c = new Conjunto(beto, eva);
        System.out.println("A = " + a + "  B = " + b + "  C = " + c);
        System.out.println("Unión A y B = " + a.union(b));
        System.out.println("Unión A y C = " + a.union(c));
        System.out.println("Intersección A y B = " + a.interseccion(b));
        System.out.println("Intersección A y C = " + a.interseccion(c));
        System.out.println("Diferencia A - B = " + a.diferencia(b));
        System.out.println("Dif. simétrica A y B = " + a.diferenciaSimetrica(b));
        System.out.println("add(Ana) de nuevo en A? " + a.add(new Persona("Ana", 1)));
    }
}
