package edu.programacion.ejercicio2403;

/**
 * Escalas de temperatura soportadas. Cada escala sabe convertirse
 * desde y hacia Celsius, que es la escala que se usa de "puente".
 */
public enum Escala {
    /** Escala Celsius (°C). */
    CELSIUS,
    /** Escala Fahrenheit (°F). */
    FAHRENHEIT,
    /** Escala Kelvin (K). */
    KELVIN,
    /** Escala Rankine (°Ra). */
    RANKINE,
    /** Escala Réaumur (°Ré). */
    REAUMUR;

    private static final double CERO_ABSOLUTO_CELSIUS = 273.15;

    /**
     * Convierte un valor expresado en esta escala a Celsius.
     *
     * @param valor valor en esta escala
     * @return el mismo valor en Celsius
     */
    public double aCelsius(double valor) {
        switch (this) {
            case FAHRENHEIT:
                return (valor - 32) / 1.8;
            case KELVIN:
                return valor - CERO_ABSOLUTO_CELSIUS;
            case RANKINE:
                return (valor - 491.67) * 5 / 9;
            case REAUMUR:
                return valor * 1.25;
            default:
                return valor;
        }
    }

    /**
     * Convierte un valor en Celsius a esta escala.
     *
     * @param celsius valor en Celsius
     * @return el mismo valor en esta escala
     */
    public double desdeCelsius(double celsius) {
        switch (this) {
            case FAHRENHEIT:
                return celsius * 1.8 + 32;
            case KELVIN:
                return celsius + CERO_ABSOLUTO_CELSIUS;
            case RANKINE:
                return celsius * 9 / 5 + 491.67;
            case REAUMUR:
                return celsius * 0.8;
            default:
                return celsius;
        }
    }
}
