package proyecto.code.model;

public class Plataforma {
    //Atributos
    private String id_Plataforma;
    private String nombre_Plataforma;
    private String fabricante;
    private String descripcion;

    //Constructor
    public Plataforma(String id_Plataforma, String nombre_Plataforma, String fabricante, String descripcion) {
        this.id_Plataforma = id_Plataforma;
        this.nombre_Plataforma = nombre_Plataforma;
        this.fabricante = fabricante;
        this.descripcion = descripcion;
    }

    //Getters y setters
    public String getId_Plataforma() {
        return id_Plataforma;
    }

    public void setId_Plataforma(String id_Plataforma) {
        this.id_Plataforma = id_Plataforma;
    }

    public String getNombre_Plataforma() {
        return nombre_Plataforma;
    }

    public void setNombre_Plataforma(String nombre_Plataforma) {
        this.nombre_Plataforma = nombre_Plataforma;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}