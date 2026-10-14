package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.programacion.ejercicio2403.Escala;
import edu.programacion.ejercicio2403.Temperature;
import org.junit.jupiter.api.Test;

class TemperatureTest {
    private static final double DELTA = 1e-9;

    @Test
    void nuevaTemperaturaEsCero() {
        assertEquals(0, new Temperature().getCelsius(), DELTA);
    }

    @Test
    void conversionesDesdeCelsius() {
        Temperature t = new Temperature();
        t.setCelsius(100);
        assertEquals(212, t.getFahrenheit(), DELTA);
        assertEquals(373.15, t.getKelvin(), DELTA);
        assertEquals(671.67, t.getRankine(), DELTA);
        assertEquals(80, t.getReaumur(), DELTA);
    }

    @Test
    void settersDeOtrasEscalasGuardanEnCelsius() {
        Temperature t = new Temperature();
        t.setKelvin(273.15);
        assertEquals(0, t.getCelsius(), DELTA);
        t.setFahrenheit(212);
        assertEquals(100, t.getCelsius(), DELTA);
    }

    @Test
    void convertTemperatureEntreEscalas() {
        Temperature t = new Temperature();
        assertEquals(32, t.convertTemperature(0, Escala.CELSIUS, Escala.FAHRENHEIT), DELTA);
        assertEquals(255.3722222, t.convertTemperature(0, Escala.FAHRENHEIT, Escala.KELVIN), 1e-6);
        assertEquals(32, t.convertTemperature(273.15, Escala.KELVIN, Escala.FAHRENHEIT), DELTA);
    }
}
