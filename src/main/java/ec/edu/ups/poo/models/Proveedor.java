package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

public class Proveedor extends Persona implements IGestionable {
    public Proveedor(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    @Override
    public void gestionar() {
        System.out.println("Gestionando Proveedor: " + nombre);
    }
}
