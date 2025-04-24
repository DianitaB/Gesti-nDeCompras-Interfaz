package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enumss.EstadoSolicitud;

import java.util.GregorianCalendar;

public class SolicitudCompra {
    private int id;
    private GregorianCalendar fecha;
    private EstadoSolicitud estado;
    private String observaciones;
    private GregorianCalendar fechaRevision;

    public SolicitudCompra(int id, GregorianCalendar fecha, EstadoSolicitud estado, GregorianCalendar fechaRevision, String observaciones) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.fechaRevision = fechaRevision;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public GregorianCalendar getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(GregorianCalendar fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "SolicitudCompra{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", estado=" + estado +
                ", observaciones='" + observaciones + '\'' +
                ", fechaRevision=" + fechaRevision +
                '}';
    }
}
