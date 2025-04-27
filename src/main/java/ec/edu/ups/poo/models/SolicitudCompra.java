package ec.edu.ups.poo.models;

import java.util.Date;
import ec.edu.ups.poo.enums.EstadoSolicitud;
import java.util.GregorianCalendar;


public class SolicitudCompra {

    private int idSolicitud;
    private Date fecha;
    private EstadoSolicitud estado;
    private String observaciones;
    private GregorianCalendar fechaSolicitud;

    public SolicitudCompra(int idSolicitud, Date fecha, EstadoSolicitud estado, String observaciones, GregorianCalendar fechaSolicitud) {
        this.idSolicitud = idSolicitud;
        this.fecha = fecha;
        this.estado = estado;
        this.observaciones = observaciones;
        this.fechaSolicitud = fechaSolicitud;
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

    public GregorianCalendar getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(GregorianCalendar fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public String toString() {
        return "Solicitud ID: " + idSolicitud + ", Fecha: " + fecha + ", Estado: " + estado + ", Observaciones: " + observaciones;
    }

}
