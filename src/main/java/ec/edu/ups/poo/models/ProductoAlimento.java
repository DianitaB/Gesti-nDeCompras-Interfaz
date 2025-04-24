package ec.edu.ups.poo.models;

import java.util.GregorianCalendar;

public class ProductoAlimento extends Producto {
    private GregorianCalendar fechaVencimiento;

    //implementando clases
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
        return super.toString() + "ProductoAlimento{" +
                "fechaVencimiento=" +
                fechaVencimiento.getTime() +
                '}';
        //
    }
}