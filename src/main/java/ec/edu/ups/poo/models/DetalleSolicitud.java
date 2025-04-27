package ec.edu.ups.poo.models;

public class DetalleSolicitud {
    private int cantidad;
    private Producto producto;
    private SolicitudCompra solicitud;

    public DetalleSolicitud(int cantidad, Producto producto, SolicitudCompra solicitud) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.solicitud = solicitud;
    }

    public double calcularValorTotal() {
        return cantidad * producto.getPrecio();
    }

    public int getCantidad() { return cantidad; }
    public Producto getProducto() { return producto; }
    public SolicitudCompra getSolicitud() { return solicitud; }

    @Override
    public String toString() {
        return "DetalleSolicitud{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                ", solicitud=" + solicitud +
                '}';
    }
}
