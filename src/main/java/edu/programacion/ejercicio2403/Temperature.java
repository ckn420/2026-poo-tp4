package edu.programacion.ejercicio2403;

/**
 * Convertidor de temperaturas.
 *
 * <p><b>Representación interna:</b> la temperatura se guarda en una sola
 * variable, en grados Celsius (la escala que usamos en Argentina). Los
 * getters y setters de las otras escalas convierten al vuelo, así que la
 * representación interna nunca cambia aunque el valor llegue en Kelvin o
 * Fahrenheit.</p>
 *
 * <p><b>¿Y si la representación interna pasara a ser Rankine o Réaumur?</b>
 * Solo cambiaría el interior de esta clase (el atributo y las fórmulas de
 * los getters/setters). Los objetos que usan {@code Temperature} siguen
 * mandando los mismos mensajes ({@code getCelsius()}, {@code setKelvin()},
 * etc.) y no se enteran del cambio: eso es el encapsulamiento. Para soportar
 * las nuevas escalas como entrada/salida alcanza con agregar los mensajes
 * {@code getRankine()/setRankine()} y {@code getReaumur()/setReaumur()},
 * o directamente un nuevo valor en el enum {@link Escala}.</p>
 *
 * <p><b>Un único método:</b> {@link #convertTemperature(double, Escala, Escala)}
 * resuelve cualquier conversión pasando por Celsius como escala puente, así
 * que agregar una escala nueva solo requiere sumar sus dos fórmulas en
 * {@link Escala}.</p>
 */
public class Temperature {
    private double celsius;

    /**
     * Crea una temperatura de 0 °C.
     */
    public Temperature() {
        this.celsius = 0;
    }

    /**
     * Crea una temperatura con un valor inicial en Celsius.
     *
     * @param celsius valor inicial en Celsius
     */
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    /**
     * @return la temperatura en Celsius
     */
    public double getCelsius() {
        return celsius;
    }

    /**
     * @param value temperatura en Celsius
     */
    public void setCelsius(double value) {
        this.celsius = value;
    }

    /**
     * @return la temperatura en Kelvin
     */
    public double getKelvin() {
        return Escala.KELVIN.desdeCelsius(celsius);
    }

    /**
     * @param value temperatura en Kelvin
     */
    public void setKelvin(double value) {
        this.celsius = Escala.KELVIN.aCelsius(value);
    }

    /**
     * @return la temperatura en Fahrenheit
     */
    public double getFahrenheit() {
        return Escala.FAHRENHEIT.desdeCelsius(celsius);
    }

    /**
     * @param value temperatura en Fahrenheit
     */
    public void setFahrenheit(double value) {
        this.celsius = Escala.FAHRENHEIT.aCelsius(value);
    }

    /**
     * @return la temperatura en Rankine
     */
    public double getRankine() {
        return Escala.RANKINE.desdeCelsius(celsius);
    }

    /**
     * @param value temperatura en Rankine
     */
    public void setRankine(double value) {
        this.celsius = Escala.RANKINE.aCelsius(value);
    }

    /**
     * @return la temperatura en Réaumur
     */
    public double getReaumur() {
        return Escala.REAUMUR.desdeCelsius(celsius);
    }

    /**
     * @param value temperatura en Réaumur
     */
    public void setReaumur(double value) {
        this.celsius = Escala.REAUMUR.aCelsius(value);
    }

    /**
     * Convierte un valor de una escala a otra.
     *
     * @param value       valor a convertir
     * @param scale       escala en la que viene el valor
     * @param targetScale escala a la que se quiere convertir
     * @return el valor expresado en la escala destino
     */
    public double convertTemperature(double value, Escala scale, Escala targetScale) {
        return targetScale.desdeCelsius(scale.aCelsius(value));
    }

    @Override
    public String toString() {
        return String.format("%.2f °C", celsius);
    }
}
