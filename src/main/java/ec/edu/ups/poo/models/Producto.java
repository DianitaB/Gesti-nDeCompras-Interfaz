package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

public class Producto implements IGestionable {
    private int id;
    private String nombre;
    private double precio;
    private Proveedor proveedor;

    public Producto(int id, String nombre, double precio, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public Proveedor getProveedor() { return proveedor; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setProveedor(Proveedor proveedor) { this.proveedor = proveedor; }

    @Override
    public void gestionar() {
        System.out.println("Gestionando Producto: " + nombre);
    }
}
