package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

public class Empleado extends Persona implements IGestionable {
    private Departamento departamento;
    private String cargo;

    public Empleado(int id, String nombre, String correoElectronico, String telefono, Departamento departamento) {
        super(id, nombre, correoElectronico,telefono);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public void registrar() {

    }
    @Override
    public void listar() {

    }
    @Override
    public void buscar() {

    }

    @Override
    public String toString() {
        return "Empleado ID: " + id +
                "\nNombre: " + nombre +
                "\nCorreo: " + correoElectronico +
                "\nTeléfono: " + telefono +
                "\nDepartamento: " + departamento.getNombre();
    }


}