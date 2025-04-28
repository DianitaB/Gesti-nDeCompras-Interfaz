package ec.edu.ups.poo.models;
import ec.edu.ups.poo.interfaces.IGestionable;


public class Departamento implements IGestionable {
    private int idDepartamento;
    private String nomDepartamento;

    // Constructor, getters y setters
    public Departamento(int id, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nomDepartamento = nomDepartamento;
    }

    public int getId() {
        return idDepartamento;
    }
    public String getNombre() {
        return nomDepartamento;
    }
    public void setId(int id) {
        this.idDepartamento = idDepartamento;
    }
    public void setNombre(String nombre) {
        this.nomDepartamento = nomDepartamento;
    }

    @Override
    public void registrar() {

    }
    @Override
    public void listar() {
    }
    @Override
    public void buscar() {
    }

    @Override
    public String toString() {
        return "Departamento ID: " + idDepartamento + ", Nombre: " + nomDepartamento;
    }

}
