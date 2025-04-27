package ec.edu.ups.poo.models;

import ec.edu.ups.poo.enums.EstadoSolicitud;
import ec.edu.ups.poo.interfaces.IGestionable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solicitud implements IGestionable {
    private int id;
    private Empleado empleadoSolicitante;
    private EstadoSolicitud estado;
    private Date fecha;
    private List<DetalleSolicitud> detalles;

    public Solicitud(int id, Empleado empleadoSolicitante) {
        this.id = id;
        this.empleadoSolicitante = empleadoSolicitante;
        this.estado = EstadoSolicitud.PENDIENTE;
        this.fecha = new Date();
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleSolicitud detalle) {
        detalles.add(detalle);
    }

    public List<DetalleSolicitud> getDetalles() {
        return detalles;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public Empleado getEmpleadoSolicitante() {
        return empleadoSolicitante;
    }

    @Override
    public void gestionar() {
        System.out.println("Gestionando Solicitud ID: " + id);
    }
}
