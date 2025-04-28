package ec.edu.ups.poo.main;

import ec.edu.ups.poo.models.Proveedor;
import ec.edu.ups.poo.models.Producto;
import ec.edu.ups.poo.models.SolicitudCompra;
import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Producto> productos = new ArrayList<>();
    private static List<SolicitudCompra> solicitudesCompra = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opp;

        do {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE COMPRAS ERP =====");
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

            opp= Integer.parseInt(scanner.nextLine());

            Proveedor proveedor = new Proveedor();
            Producto producto = new Producto();
            SolicitudCompra solicitudCompra = new SolicitudCompra();

            switch (opp) {
                case 1:
                    proveedor.registrar();
                    break;
                case 2:
                    producto.registrar();
                    break;
                case 3:
                    solicitudCompra.registrar();
                    break;
                case 4:
                    proveedor.listar();
                    break;
                case 5:
                    producto.listar();
                    break;
                case 6:
                    solicitudCompra.listar();
                    break;
                case 7:
                    proveedor.buscar();
                    break;
                case 8:
                    producto.buscar();
                    break;
                case 9:
                    solicitudCompra.buscar();
                    break;
                case 10:
                    solicitudCompra.aprobarSolicitud();
                    break;
                case 11:
                    solicitudCompra.rechazarSolicitud();
                    break;
                case 12:
                    solicitudCompra.calcularTotalSolicitud();
                    break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opp != 0);
    }
}