package ec.edu.ups.poo.main;

import ec.edu.ups.poo.models.Empleado;
import ec.edu.ups.poo.models.Proveedor;
import ec.edu.ups.poo.models.Departamento;
import ec.edu.ups.poo.models.Producto;
import ec.edu.ups.poo.models.Solicitud;
import ec.edu.ups.poo.enums.EstadoSolicitud;
import ec.edu.ups.poo.interfaces.IGestionable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<IGestionable> elementos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN ===");
            System.out.println("1. Gestionar Empleados");
            System.out.println("2. Gestionar Proveedores");
            System.out.println("3. Gestionar Departamentos");
            System.out.println("4. Gestionar Productos");
            System.out.println("5. Gestionar Solicitudes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    gestionar(new Empleado());
                    break;
                case 2:
                    gestionar(new Proveedor());
                    break;
                case 3:
                    gestionar(new Departamento());
                    break;
                case 4:
                    gestionar(new Producto());
                    break;
                case 5:
                    gestionar(new Solicitud());
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void gestionar(IGestionable objeto) {
        int opcionGestion;

        do {
            System.out.println("\n--- Gestión de " + objeto.getClass().getSimpleName() + " ---");
            System.out.println("1. Registrar");
            System.out.println("2. Listar");
            System.out.println("3. Buscar");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcionGestion = Integer.parseInt(scanner.nextLine());

            switch (opcionGestion) {
                case 1:
                    objeto.registrar();
                    elementos.add(objeto);
                    break;
                case 2:
                    objeto.listar();
                    break;
                case 3:
                    objeto.buscar();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida..");
            }
        } while (opcionGestion != 0);
    }
}
