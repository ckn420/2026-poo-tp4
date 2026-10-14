package edu.programacion.ejercicio2408;

/**
 * Persona que desempeña una función en una empresa y recibe un salario.
 * Cada tipo de empleado sabe calcular su propio sueldo.
 */
public abstract class Empleado extends Persona {
    private String funcion;

    /**
     * @param nombre           nombre completo
     * @param dni              DNI
     * @param direccion        dirección
     * @param anioDeNacimiento año de nacimiento
     * @param sexo             sexo
     * @param funcion          función que desempeña
     */
    protected Empleado(String nombre, int dni, String direccion, int anioDeNacimiento, char sexo,
                       String funcion) {
        super(nombre, dni, direccion, anioDeNacimiento, sexo);
        this.funcion = funcion;
    }

    /**
     * @return el sueldo que hay que pagarle
     */
    public abstract double getSueldo();

    /**
     * @return función que desempeña
     */
    public String getFuncion() {
        return funcion;
    }
}
