package ec.edu.ups.poo.models;
import ec.edu.ups.poo.interfaces.IGestionable;
import java.util.Date;
import ec.edu.ups.poo.enums.EstadoSolicitud;


public class SolicitudCompra implements IGestionable  {

    private int idSolicitud;
    private Date fecha;
    private EstadoSolicitud estado;
    private String observaciones;


    public SolicitudCompra(int idSolicitud, Date fecha, EstadoSolicitud estado, String observaciones) {
        this.idSolicitud = idSolicitud;
        this.fecha = fecha;
        this.estado = estado;
        this.observaciones = observaciones;

    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        return "Solicitud ID: " + idSolicitud + ", Fecha: " + fecha + ", Estado: " + estado + ", Observaciones: " + observaciones;
    }


}
