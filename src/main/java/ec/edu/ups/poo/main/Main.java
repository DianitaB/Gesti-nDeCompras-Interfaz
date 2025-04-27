package ec.edu.ups.poo.main;

import ec.edu.ups.poo.models.Proveedor;
import ec.edu.ups.poo.models.Producto;
import ec.edu.ups.poo.models.SolicitudCompra;
import ec.edu.ups.poo.enums.EstadoSolicitud;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Proveedor> proveedores = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    private static List<SolicitudCompra> solicitudesCompra = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrar Proveedor");
            System.out.println("2. Registrar Producto");
            System.out.println("3. Registrar Solicitud de Compra");
            System.out.println("4. Listar Proveedores");
            System.out.println("5. Listar Productos");
            System.out.println("6. Listar Solicitudes de Compra");
            System.out.println("7. Buscar Proveedor por ID");
            System.out.println("8. Buscar Producto por Nombre");
            System.out.println("9. Buscar Solicitud por Número");
            System.out.println("10. Aprobar Solicitud de Compra");
            System.out.println("11. Rechazar Solicitud de Compra");
            System.out.println("12. Calcular Total de Solicitud");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1: registrarProveedor(); break;
                case 2: registrarProducto(); break;
                case 3: registrarSolicitudCompra(); break;
                case 4: listarProveedores(); break;
                case 5: listarProductos(); break;
                case 6: listarSolicitudesCompra(); break;
                case 7: buscarProveedorPorID(); break;
                case 8: buscarProductoPorNombre(); break;
                case 9: buscarSolicitudPorNumero(); break;
                case 10: aprobarSolicitudCompra(); break;
                case 11: rechazarSolicitudCompra(); break;
                case 12: calcularTotalSolicitud(); break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void registrarProveedor() {
        System.out.print("Ingrese ID del proveedor: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese nombre del proveedor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        int telefono = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese tipo de contribuyente: ");
        String tipo = scanner.nextLine();

        proveedores.add(new Proveedor(id, nombre, correo, telefono, tipo));
        System.out.println("Proveedor registrado exitosamente.");
    }

    private static void registrarProducto() {
        System.out.print("Ingrese ID del producto: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Seleccione un proveedor disponible:");
        listarProveedores();
        System.out.print("Ingrese ID del proveedor: ");
        int idProveedor = Integer.parseInt(scanner.nextLine());

        Proveedor proveedorEncontrado = null;
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == idProveedor) {
                proveedorEncontrado = proveedor;
                break;
            }
        }

        if (proveedorEncontrado != null) {
            productos.add(new Producto(id, precio, proveedorEncontrado));
            System.out.println("Producto registrado exitosamente.");
        } else {
            System.out.println("Proveedor no encontrado. No se registró el producto.");
        }
    }

    private static void registrarSolicitudCompra() {
        System.out.print("Ingrese ID de la solicitud: ");
        int idSolicitud = Integer.parseInt(scanner.nextLine());
        Date fecha = new Date();
        EstadoSolicitud estado = EstadoSolicitud.SOLICITADO;
        System.out.print("Ingrese observaciones: ");
        String observaciones = scanner.nextLine();


        SolicitudCompra solicitud = new SolicitudCompra(idSolicitud, fecha, estado, observaciones);
        solicitudesCompra.add(solicitud);
        System.out.println("Solicitud de compra registrada exitosamente.");
    }

    private static void listarProveedores() {
        if (proveedores.isEmpty()) {
            System.out.println("No hay proveedores registrados.");
        } else {
            for (Proveedor proveedor : proveedores) {
                System.out.println(proveedor);
            }
        }
    }

    private static void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    private static void listarSolicitudesCompra() {
        if (solicitudesCompra.isEmpty()) {
            System.out.println("No hay solicitudes de compra registradas.");
        } else {
            for (SolicitudCompra solicitud : solicitudesCompra) {
                System.out.println(solicitud);
            }
        }
    }

    private static void buscarProveedorPorID() {
        System.out.print("Ingrese ID del proveedor: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;

        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == id) {
                System.out.println(proveedor);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Proveedor no encontrado.");
        }
    }

    private static void buscarProductoPorNombre() {
        System.out.print("Ingrese nombre del proveedor del producto: ");
        String nombre = scanner.nextLine();
        boolean encontrado = false;

        for (Producto producto : productos) {
            if (producto.getProveedor().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void buscarSolicitudPorNumero() {
        System.out.print("Ingrese número de solicitud: ");
        int numero = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;

        for (SolicitudCompra solicitud : solicitudesCompra) {
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

    private static void aprobarSolicitudCompra() {
        System.out.print("Ingrese ID de solicitud a aprobar: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;

        for (SolicitudCompra solicitud : solicitudesCompra) {
            if (solicitud.getIdSolicitud() == id) {
                solicitud.setEstado(EstadoSolicitud.APROBADO);
                System.out.println("Solicitud aprobada.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Solicitud no encontrada.");
        }
    }

    private static void rechazarSolicitudCompra() {
        System.out.print("Ingrese ID de solicitud a rechazar: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;

        for (SolicitudCompra solicitud : solicitudesCompra) {
            if (solicitud.getIdSolicitud() == id) {
                solicitud.setEstado(EstadoSolicitud.RECHAZADO);
                System.out.println("Solicitud rechazada.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Solicitud no encontrada.");
        }
    }

    private static void calcularTotalSolicitud() {
        System.out.print("Ingrese ID de solicitud para calcular total: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;

        for (SolicitudCompra solicitud : solicitudesCompra) {
            if (solicitud.getIdSolicitud() == id) {
                System.out.println("(Este método requiere detalles de productos para calcular el total).");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Solicitud no encontrada.");
        }
    }
}