package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

public class Empleado extends Persona implements IGestionable {
    private Departamento departamento;

    public Empleado(int id, String nombre, String correo, Departamento departamento) {
        super(id, nombre, correo);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public void gestionar() {
        System.out.println("Gestionando Empleado: " + nombre);
    }
}