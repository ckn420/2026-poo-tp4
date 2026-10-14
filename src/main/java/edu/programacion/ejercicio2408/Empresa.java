package edu.programacion.ejercicio2408;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Empresa con su colección de empleados.
 */
public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    /**
     * @param nombre nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    /**
     * @param empleado empleado a contratar
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * @param empleado empleado a dar de baja
     * @return true si trabajaba en la empresa
     */
    public boolean quitarEmpleado(Empleado empleado) {
        return empleados.remove(empleado);
    }

    /**
     * @return el monto total que la empresa debe pagar en sueldos
     */
    public double montoTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getSueldo();
        }
        return total;
    }

    /**
     * @return cantidad de empleados
     */
    public int cantidadDeEmpleados() {
        return empleados.size();
    }

    /**
     * @return empleados (solo lectura)
     */
    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    /**
     * @return nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }
}
