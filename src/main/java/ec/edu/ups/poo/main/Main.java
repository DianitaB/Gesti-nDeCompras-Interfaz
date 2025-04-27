package ec.edu.ups.poo.main;

import ec.edu.ups.poo.models.Proveedor;
import ec.edu.ups.poo.models.Producto;
import ec.edu.ups.poo.models.SolicitudCompra;

import java.util.ArrayList;
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
                case 1:
                    registrarProveedor();
                    break;
                case 2:
                    registrarProducto();
                    break;
                case 3:
                    registrarSolicitudCompra();
                    break;
                case 4:
                    listarProveedores();
                    break;
                case 5:
                    listarProductos();
                    break;
                case 6:
                    listarSolicitudesCompra();
                    break;
                case 7:
                    buscarProveedorPorID();
                    break;
                case 8:
                    buscarProductoPorNombre();
                    break;
                case 9:
                    buscarSolicitudPorNumero();
                    break;
                case 10:
                    aprobarSolicitudCompra();
                    break;
                case 11:
                    rechazarSolicitudCompra();
                    break;
                case 12:
                    calcularTotalSolicitud();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    // Métodos básicos: de momento solo impresión de mensajes (luego tú puedes completar)
    private static void registrarProveedor() {
        System.out.println("Registrar proveedor...");
    }

    private static void registrarProducto() {
        System.out.println("Registrar producto...");
    }

    private static void registrarSolicitudCompra() {
        System.out.println("Registrar solicitud de compra...");
    }

    private static void listarProveedores() {
        System.out.println("Listar proveedores...");
    }

    private static void listarProductos() {
        System.out.println("Listar productos...");
    }

    private static void listarSolicitudesCompra() {
        System.out.println("Listar solicitudes de compra...");
    }

    private static void buscarProveedorPorID() {
        System.out.println("Buscar proveedor por ID...");
    }

    private static void buscarProductoPorNombre() {
        System.out.println("Buscar producto por nombre...");
    }

    private static void buscarSolicitudPorNumero() {
        System.out.println("Buscar solicitud por número...");
    }

    private static void aprobarSolicitudCompra() {
        System.out.println("Aprobar solicitud de compra...");
    }

    private static void rechazarSolicitudCompra() {
        System.out.println("Rechazar solicitud de compra...");
    }

    private static void calcularTotalSolicitud() {
        System.out.println("Calcular total de solicitud...");
    }
}
