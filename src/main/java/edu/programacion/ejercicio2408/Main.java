package edu.programacion.ejercicio2408;

/**
 * Prueba del ejercicio 2408.
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
        System.out.println("=== 2408 - Jerarquía de empleados ===");
        Empresa empresa = new Empresa("Quales");
        empresa.agregarEmpleado(new Tecnico("Lucía Gómez", 30111222, "Mitre 123", 1990, 'F',
                "Soporte", "Técnica en Redes", 850000));
        empresa.agregarEmpleado(new Administrativo("Pedro Ruiz", 28333444, "Belgrano 45", 1985, 'M',
                "Facturación", 3, 10));
        empresa.getEmpleados().forEach(e -> System.out.println(e + " -> " + e.getSueldo()));
        System.out.println("Monto total: " + empresa.montoTotal());
    }
}
