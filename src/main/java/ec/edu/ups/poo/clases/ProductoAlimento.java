package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class ProductoAlimento extends Producto {
    private GregorianCalendar fechaVencimiento;


    public ProductoAlimento(int id, String nombre, double precio, GregorianCalendar fechaVencimiento) {
        super(id, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public GregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(GregorianCalendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "ProductoAlimento{" +
                "fechaVencimiento=" +
                fechaVencimiento.getTime() +
                '}';
    }
}