package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

public class Proveedor extends Persona implements IGestionable {
    private String tipoContribuyente;

    public Proveedor(int id, String nombre, String correoElectronico, int telefono, String tipoContribuyente) {
        super(id, nombre, correoElectronico,telefono);
        this.tipoContribuyente = tipoContribuyente;
    }

    public String getContacto() {
        return tipoContribuyente;
    }
    public void setContacto(String contacto) {
        this.tipoContribuyente = contacto;
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
        return "Proveedor ID: " + id + ", Nombre: " + nombre + ", Correo: " + correoElectronico + ", Teléfono: " + telefono + ", Tipo: " + tipoContribuyente;
    }


}
