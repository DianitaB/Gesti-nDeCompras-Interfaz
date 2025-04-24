package ec.edu.ups.poo.clases;

public class ProductoUtiles {
    private String Marca;
    private String Color;
    private String Material;

    public ProductoUtiles(String marca, String color, String material) {
        Marca = marca;
        Color = color;
        Material = material;
    }



    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    @Override
    public String toString() {
        return "ProductoUtiles{" +
                "Marca='" + Marca + '\'' +
                ", Color='" + Color + '\'' +
                ", Material='" + Material + '\'' +
                '}';
    }
}
