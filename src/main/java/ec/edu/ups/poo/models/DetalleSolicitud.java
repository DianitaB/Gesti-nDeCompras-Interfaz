package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;

import java.util.ArrayList;
import java.util.List;

public class DetalleSolicitud {
    private int cantidad;
    private Producto producto;
    private SolicitudCompra solicitud;
    private Double total;
    private static ArrayList<DetalleSolicitud> detalles = new ArrayList<DetalleSolicitud>();

    public DetalleSolicitud() {
        this.cantidad = cantidad;
        this.producto = producto;
        this.solicitud = solicitud;
        this.total = calcularValorTotal();
    }

    public int getCantidad() { return cantidad; }
    public Producto getProducto() { return producto; }
    public SolicitudCompra getSolicitud() { return solicitud; }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setSolicitud(SolicitudCompra solicitud) {
        this.solicitud = solicitud;
    }

    public double calcularValorTotal() {
        if (producto == null) {
            return 0;
        }
        return cantidad * producto.getPrecio();
    }

    public List<DetalleSolicitud> obtenerDetalles() {
        return detalles;
    }

    @Override
    public String toString() {
        return "DetalleSolicitud{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                ". total=" + total +
                '}';
    }
}
