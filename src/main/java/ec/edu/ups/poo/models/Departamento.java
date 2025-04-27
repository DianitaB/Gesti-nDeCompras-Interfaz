package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;
import java.util.ArrayList;
import java.util.List;

public class Departamento implements IGestionable {
    private int id;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public void gestionar() {
        System.out.println("Gestionando Departamento: " + nombre);
    }
}
