package ec.edu.ups.poo.models;

public class DetalleSolicitud {
    private int cantidad;
    private Producto producto;
    private Solicitud solicitud;

    public DetalleSolicitud(int cantidad, Producto producto, Solicitud solicitud) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.solicitud = solicitud;
    }

    public double calcularValorTotal() {
        return cantidad * producto.getPrecio();
    }

    public int getCantidad() { return cantidad; }
    public Producto getProducto() { return producto; }
    public Solicitud getSolicitud() { return solicitud; }
}
