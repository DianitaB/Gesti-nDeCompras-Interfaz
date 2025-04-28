package ec.edu.ups.poo.models;
import ec.edu.ups.poo.interfaces.IGestionable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ec.edu.ups.poo.enums.EstadoSolicitud;


public class SolicitudCompra implements IGestionable {

    private int idSolicitud;
    private Date fecha;
    private EstadoSolicitud estado;
    private String observaciones;
    private Double total;
    private static Scanner scanner = new Scanner(System.in);
    private static Producto producto = new Producto();
    private static ArrayList<SolicitudCompra> solicitudes = new ArrayList<SolicitudCompra>();
    private List<DetalleSolicitud> detalles;


    public SolicitudCompra() {
        this.idSolicitud = idSolicitud;
        this.fecha = fecha;
        this.estado = estado;
        this.observaciones = observaciones;
        this.detalles = new ArrayList<>();
        this.total = total;
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
        System.out.print("Ingrese ID de la solicitud: ");
        int idSolicitud = Integer.parseInt(scanner.nextLine());
        Date fecha = new Date();
        EstadoSolicitud estado = EstadoSolicitud.SOLICITADO;
        System.out.print("Ingrese observaciones: ");
        String observaciones = scanner.nextLine();

        this.idSolicitud = idSolicitud;
        this.fecha = fecha;
        this.estado = estado;
        this.observaciones = observaciones;

        //ArrayList<DetalleSolicitud> details = new ArrayList<DetalleSolicitud>();

        System.out.println("-- Detalle --");
        int op;
        do {
            DetalleSolicitud det = new DetalleSolicitud();
            System.out.println("Escoja una opcion: ");
            System.out.println("1. Nuevo detalle");
            System.out.println("0. Finalizar");

            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1:
                    System.out.print("Ingrese ID del producto: ");
                    int idProducto = Integer.parseInt(scanner.nextLine());
                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = Integer.parseInt(scanner.nextLine());

                    Producto idProd = producto.buscarPorId(idProducto);

                    det.setSolicitud(this);
                    det.setProducto(idProd);
                    det.setCantidad(cantidad);
                    det.setTotal(det.calcularValorTotal());
                    this.detalles.add(det);
                    break;
                case 0:
                    System.out.println("Detalle completado");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (op != 0);

        solicitudes.add(this);
        System.out.println("Solicitud de compra registrada exitosamente.");
    }

    @Override
    public void listar() {
        System.out.println("Todos los Productos: ");
        for (SolicitudCompra solicitudCompra : solicitudes) {
            System.out.println(solicitudCompra.toString());
            System.out.println("Detalles: ");
            for (DetalleSolicitud detail : solicitudCompra.detalles) {
                if (detail.getSolicitud() == solicitudCompra) {
                    System.out.println(detail.toString());
                }
            }
        }
        System.out.println("");
    }

    @Override
    public void buscar() {
        System.out.print("Ingrese número de solicitud: ");
        int numero = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;

        for (SolicitudCompra solicitud : solicitudes) {
            if (solicitud.getIdSolicitud() == numero) {
                System.out.println(solicitud);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Solicitud no encontrada.");
        }
    }

    public void calcularTotalSolicitud() {
        System.out.print("Ingrese ID de la solicitud: ");
        int idSolicitud = Integer.parseInt(scanner.nextLine());

        double totalSolicitud = 0.0;

        SolicitudCompra solicitudEncontrada = null;
        for (SolicitudCompra solicitud : solicitudes) {
            if (solicitud.getIdSolicitud() == idSolicitud) {
                solicitudEncontrada = solicitud;
                break;
            }
        }

        if (solicitudEncontrada == null) {
            System.out.println("Solicitud no encontrada.");
        } else {
            for (DetalleSolicitud detalle : solicitudEncontrada.detalles) {
                totalSolicitud += detalle.getTotal();
            }
            System.out.println("Total de la solicitud: " + totalSolicitud);
        }
    }

    @Override
    public String toString() {
        return "Solicitud ID: " + idSolicitud + ", Fecha: " + fecha + ", Estado: " + estado + ", Observaciones: " + observaciones;
    }


}
