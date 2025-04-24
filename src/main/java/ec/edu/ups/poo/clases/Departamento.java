package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enumss.TipoDepartamento;

public class Departamento {
    private String ubicacion;
    private TipoDepartamento tipoDepartamento;

    public Departamento(String ubicacion, TipoDepartamento tipoDepartamento) {
        this.ubicacion = ubicacion;
        this.tipoDepartamento = tipoDepartamento;
    }

    public TipoDepartamento getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartamento(TipoDepartamento tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "ubicacion='" + ubicacion + '\'' +
                ", tipoDepartamento=" + tipoDepartamento +
                '}';
    }
}
