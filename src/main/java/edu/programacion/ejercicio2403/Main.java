package edu.programacion.ejercicio2403;

/**
 * Prueba del ejercicio 2403.
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
        System.out.println("=== 2403 - Convertidor de temperaturas ===");
        Temperature t = new Temperature();
        System.out.println("new: " + t.getCelsius() + " °C");
        t.setCelsius(100);
        System.out.printf("100 °C = %.2f °F = %.2f K%n", t.getFahrenheit(), t.getKelvin());
        t.setFahrenheit(32);
        System.out.println("setFahrenheit(32) -> " + t);
        System.out.printf("convertTemperature(0, KELVIN, CELSIUS) = %.2f%n",
                t.convertTemperature(0, Escala.KELVIN, Escala.CELSIUS));
    }
}
