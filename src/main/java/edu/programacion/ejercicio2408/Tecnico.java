package edu.programacion.ejercicio2408;

/**
 * Empleado con título que trabaja por contrato: cobra siempre el
 * monto fijo que establece su contrato.
 */
public class Tecnico extends Empleado {
    private String titulo;
    private double montoDelContrato;

    /**
     * @param nombre           nombre completo
     * @param dni              DNI
     * @param direccion        dirección
     * @param anioDeNacimiento año de nacimiento
     * @param sexo             sexo
     * @param funcion          función
     * @param titulo           título que posee
     * @param montoDelContrato monto fijo del contrato
     */
    public Tecnico(String nombre, int dni, String direccion, int anioDeNacimiento, char sexo,
                   String funcion, String titulo, double montoDelContrato) {
        super(nombre, dni, direccion, anioDeNacimiento, sexo, funcion);
        this.titulo = titulo;
        this.montoDelContrato = montoDelContrato;
    }

    @Override
    public double getSueldo() {
        return montoDelContrato;
    }

    /**
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return monto del contrato
     */
    public double getMontoDelContrato() {
        return montoDelContrato;
    }
}
