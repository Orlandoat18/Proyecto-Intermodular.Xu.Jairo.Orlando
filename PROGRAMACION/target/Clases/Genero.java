public class Genero {
    //Atributos
    private String id_Genero;
    private String nombre_Genero;
    private String descripcion_Genero;

    //Constructor
    public Genero(String id_Genero, String nombre_Genero, String descripcion_Genero) {
        this.id_Genero = id_Genero;
        this.nombre_Genero = nombre_Genero;
        this.descripcion_Genero = descripcion_Genero;
    }

    //Getters y setters
    public String getId_Genero() {
        return id_Genero;
    }

    public void setId_Genero(String id_Genero) {
        this.id_Genero = id_Genero;
    }

    public String getNombre_Genero() {
        return nombre_Genero;
    }

    public void setNombre_Genero(String nombre_Genero) {
        this.nombre_Genero = nombre_Genero;
    }

    public String getDescripcion_Genero() {
        return descripcion_Genero;
    }

    public void setDescripcion_Genero(String descripcion_Genero) {
        this.descripcion_Genero = descripcion_Genero;
    }
}