package proyecto.code.model;

public class Videojuego {
    //Atributos
    private String id_Videojuego;
    private String titulo;
    private String descripcion_Videojuego;
    private String clasificacion_edad;

    //Constructor
    public Videojuego(String id_Videojuego, String titulo, String descripcion_Videojuego, String clasificacion_edad) {
        this.id_Videojuego = id_Videojuego;
        this.titulo = titulo;
        this.descripcion_Videojuego = descripcion_Videojuego;
        this.clasificacion_edad = clasificacion_edad;
    }

    //Getters y setters
    public String getId_Videojuego() {
        return id_Videojuego;
    }

    public void setId_Videojuego(String id_Videojuego) {
        this.id_Videojuego = id_Videojuego;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion_Videojuego() {
        return descripcion_Videojuego;
    }

    public void setDescripcion_Videojuego(String descripcion_Videojuego) {
        this.descripcion_Videojuego = descripcion_Videojuego;
    }

    public String getClasificacion_edad() {
        return clasificacion_edad;
    }

    public void setClasificacion_edad(String clasificacion_edad) {
        this.clasificacion_edad = clasificacion_edad;
    }

}