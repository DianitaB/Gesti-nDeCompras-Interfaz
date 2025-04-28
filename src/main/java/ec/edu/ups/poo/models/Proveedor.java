package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Proveedor extends Persona implements IGestionable {
    private String tipoContribuyente;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Proveedor> proveedores = new ArrayList<>();

    public Proveedor() {
        super(0, "", "","");
        this.tipoContribuyente = "";
    }

    public String getContacto() {
        return tipoContribuyente;
    }
    public void setContacto(String contacto) {
        this.tipoContribuyente = contacto;
    }

    @Override
    public void registrar() {
        System.out.print("Ingrese ID del proveedor: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese nombre del proveedor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese tipo de contribuyente: ");
        String tipo = scanner.nextLine();

        this.setId(id);
        this.setNombre(nombre);
        this.setCorreoElectronico(correo);
        this.setTelefono(telefono);
        this.tipoContribuyente = tipo;
        proveedores.add(this);

        System.out.println("Proveedor registrado exitosamente.");
        System.out.println(this.toString());
    }

    @Override
    public void listar() {
        System.out.println("Todos los Proveedores: ");
        if (proveedores.size() > 0) {
            for (Proveedor proveedor : proveedores) {
                System.out.println(proveedor.toString());
            }
            System.out.println("");
        } else {
            System.out.println("No hay proveedores.");
        }
    }
    @Override
    public void buscar() {
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

    public List<Proveedor> obtenerProveedores() {
        return proveedores;
    }

    @Override
    public String toString() {
        return "\nProveedor ID: " + id +
                "\nNombre: " + nombre +
                "\nCorreo: " + correoElectronico +
                "\nTeléfono: " + telefono +
                "\nTipo: " + tipoContribuyente;
    }


}
