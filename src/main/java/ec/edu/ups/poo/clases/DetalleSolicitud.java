package ec.edu.ups.poo.clases;

public class DetalleSolicitud {


    private int idDetalleSolicitud;
    private int idSolicitud;
    private int idCantidad;
    private int idProducto;
    private int cantidad;
    private double precioPorUnidad;

    public DetalleSolicitud(int idDetalleSolicitud, int idSolicitud, int idCantidad, int idProducto, int cantidad, double precioPorUnidad) {
        this.idDetalleSolicitud = idDetalleSolicitud;
        this.idSolicitud = idSolicitud;
        this.idCantidad = idCantidad;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }


    public int getIdDetalleSolicitud() {
        return idDetalleSolicitud;
    }

    public void setIdDetalleSolicitud(int idDetalleSolicitud) {
        this.idDetalleSolicitud = idDetalleSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdCantidad() {
        return idCantidad;
    }

    public void setIdCantidad(int idCantidad) {
        this.idCantidad = idCantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }


    public double calcularTotal() {
        return cantidad * precioPorUnidad;
    }

    @Override
    public String toString() {
        return "DetalleSolicitud{" +
                "idDetalleSolicitud=" + idDetalleSolicitud +
                ", idSolicitud=" + idSolicitud +
                ", idCantidad=" + idCantidad +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", precioPorUnidad=" + precioPorUnidad +
                ", total=" + calcularTotal() +
                '}';
    }
}