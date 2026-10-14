package edu.programacion.ejercicio2408;

/**
 * Datos relevantes de una persona.
 */
public class Persona {
    private String nombre;
    private int dni;
    private String direccion;
    private int anioDeNacimiento;
    private char sexo;

    /**
     * @param nombre           nombre completo
     * @param dni              DNI
     * @param direccion        dirección
     * @param anioDeNacimiento año de nacimiento
     * @param sexo             'M', 'F' u otro carácter
     */
    public Persona(String nombre, int dni, String direccion, int anioDeNacimiento, char sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.anioDeNacimiento = anioDeNacimiento;
        this.sexo = sexo;
    }

    /**
     * @param anioActual año de referencia
     * @return edad aproximada en ese año
     */
    public int edadEn(int anioActual) {
        return anioActual - anioDeNacimiento;
    }

    /**
     * @return nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return DNI
     */
    public int getDni() {
        return dni;
    }

    /**
     * @return dirección
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return año de nacimiento
     */
    public int getAnioDeNacimiento() {
        return anioDeNacimiento;
    }

    /**
     * @return sexo
     */
    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}
