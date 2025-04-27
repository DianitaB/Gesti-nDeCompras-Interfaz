package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

public class Producto implements IGestionable {
    private int idProducto;
    private double precio;
    private Proveedor proveedor;

    public Producto(int idProducto, double precio, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    public int getId() {
        return idProducto;
    }
    public double getPrecio() {
        return precio;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setId(int id) {
        this.idProducto = idProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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
}
