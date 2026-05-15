package proyecto.code.model;

public class Videojuego {
    //Atributos
    private int id_Videojuego;
    private String titulo;
    private String descripcion_Videojuego;
    private String clasificacion_edad;

    private int id_Desarrollador;
    private int id_Personaje;


    //Constructor
    public Videojuego(int id_Videojuego, String titulo, String descripcion_Videojuego, String clasificacion_edad, int id_Desarrollador, int id_Personaje) {
        this.id_Videojuego = id_Videojuego;
        this.titulo = titulo;
        this.descripcion_Videojuego = descripcion_Videojuego;
        this.clasificacion_edad = clasificacion_edad;
        this.id_Desarrollador = id_Desarrollador;
        this.id_Personaje = id_Personaje;
    }

    //Getters y setters

    public int getId_Videojuego() {
        return id_Videojuego;
    }

    public void setId_Videojuego(int id_Videojuego) {
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

    public int getId_Desarrollador() {
        return id_Desarrollador;
    }

    public void setId_Desarrollador(int id_Desarrollador) {
        this.id_Desarrollador = id_Desarrollador;
    }

    public int getId_Personaje() {
        return id_Personaje;
    }

    public void setId_Personaje(int id_Personaje) {
        this.id_Personaje = id_Personaje;
    }

}