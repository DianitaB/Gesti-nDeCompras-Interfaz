package ec.edu.ups.poo.clases;

public class Proveedor {
    private String nombre;
    private int numero;
    private int ruc;

    public Proveedor(String nombre, int ruc, int numero) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", ruc=" + ruc +
                '}';
    }
}
