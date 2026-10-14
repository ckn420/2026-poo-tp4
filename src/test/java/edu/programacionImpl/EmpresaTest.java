package edu.programacionImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.programacion.ejercicio2408.Administrativo;
import edu.programacion.ejercicio2408.Empleado;
import edu.programacion.ejercicio2408.Empresa;
import edu.programacion.ejercicio2408.Persona;
import edu.programacion.ejercicio2408.Tecnico;
import org.junit.jupiter.api.Test;

class EmpresaTest {

    @Test
    void tecnicoCobraElMontoDelContrato() {
        Tecnico tecnico = new Tecnico("T", 1, "Dir", 1990, 'F', "Soporte", "Técnico", 1000);
        assertEquals(1000, tecnico.getSueldo(), 1e-9);
        assertTrue(tecnico instanceof Empleado);
        assertTrue(tecnico instanceof Persona);
    }

    @Test
    void administrativoCobraAntiguedadPorCategoria() {
        Administrativo adm = new Administrativo("A", 2, "Dir", 1985, 'M', "Admin", 3, 10);
        assertEquals(30, adm.getSueldo(), 1e-9);
    }

    @Test
    void montoTotalSumaTodosLosSueldos() {
        Empresa empresa = new Empresa("E");
        empresa.agregarEmpleado(new Tecnico("T", 1, "Dir", 1990, 'F', "Soporte", "Técnico", 1000));
        empresa.agregarEmpleado(new Administrativo("A", 2, "Dir", 1985, 'M', "Admin", 2, 5));
        assertEquals(1010, empresa.montoTotal(), 1e-9);
    }

    @Test
    void categoriaInvalidaLanzaExcepcion() {
        boolean lanzo = false;
        try {
            new Administrativo("A", 2, "Dir", 1985, 'M', "Admin", 5, 1);
        } catch (IllegalArgumentException e) {
            lanzo = true;
        }
        assertTrue(lanzo);
    }
}
