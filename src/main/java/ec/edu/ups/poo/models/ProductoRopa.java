package ec.edu.ups.poo.models;

public class ProductoRopa extends Producto {
    private String talla;
    private String color;

    public ProductoRopa(int id, String nombre, double precio, String talla, String color) {
        super(id, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductoRopa{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
