package ec.edu.ups.poo.models;

import ec.edu.ups.poo.interfaces.IGestionable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Producto implements IGestionable {
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private Proveedor rProveedor;
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Producto> productos = new ArrayList<Producto>();
    private static Proveedor proveedor = new Proveedor();

    public Producto() {
        this.idProducto = 0;
        this.nombreProducto = "";
        this.precio = 0.0;
        this.rProveedor = null;
    }

    public int getId() {
        return idProducto;
    }
    public String getNombreProducto() {return nombreProducto;}
    public double getPrecio() {
        return precio;
    }
    public Proveedor getProveedor() {
        return rProveedor;
    }

    public void setId(int id) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {this.nombreProducto = nombreProducto;}
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setProveedor(Proveedor proveedor) {
        this.rProveedor = proveedor;
    }

    @Override
    public void registrar() {
        System.out.print("Ingrese ID del producto: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = scanner.nextLine();
        System.out.print("Ingrese precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Seleccione un proveedor disponible:");
        proveedor.listar();
        System.out.print("Ingrese ID del proveedor: ");
        int idProveedor = Integer.parseInt(scanner.nextLine());

        Proveedor proveedorEncontrado = null;
        for (Proveedor proveedor : proveedor.obtenerProveedores()) {
            if (proveedor.getId() == idProveedor) {
                proveedorEncontrado = proveedor;
                break;
            }
        }

        if (proveedorEncontrado != null) {
            this.idProducto = id;
            this.precio = precio;
            this.proveedor = proveedorEncontrado;
            productos.add(this);
            System.out.println("Producto registrado exitosamente.");
        } else {
            System.out.println("Proveedor no encontrado. No se registró el producto.");
        }
    }
    @Override
    public void listar() {
        System.out.println("Todos los Productos: ");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
        System.out.println("");
    }
    @Override
    public void buscar() {
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

    public Producto buscarPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nProducto ID: " + idProducto + "\nNombre " + nombreProducto + "\nPrecio: $" + precio + "\nProveedor: " + proveedor.getNombre();
    }

}
