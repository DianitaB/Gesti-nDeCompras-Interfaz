package ec.edu.ups.poo.models;
import java.util.ArrayList;
import java.util.List;

public class DetalleSolicitud {
    private int cantidad;
    private Producto producto;
    private SolicitudCompra solicitud;
    private Double totalDet;
    private static ArrayList<DetalleSolicitud> detalles = new ArrayList<DetalleSolicitud>();

    public DetalleSolicitud() {
        this.cantidad = cantidad;
        this.producto = producto;
        this.solicitud = solicitud;
        this.totalDet = calcularValorTotal();
    }

    public int getCantidad() { return cantidad; }
    public Producto getProducto() { return producto; }
    public SolicitudCompra getSolicitud() { return solicitud; }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotalDet() {
        return totalDet;
    }

    public void setTotalDet(Double totalDet) {
        this.totalDet = totalDet;
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
                "\ncantidad=" + cantidad +
                "\nproducto=" + producto +
                "\ntotal=" + totalDet +
                '}';
    }
}
