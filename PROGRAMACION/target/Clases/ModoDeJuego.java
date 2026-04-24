public class ModoDeJuego {
    //Atributos
    private String id_ModoJuego;
    private String nombre_Modo;
    private String descripcion_Modo;

    //Constructor
    public ModoDeJuego(String id_ModoJuego, String nombre_Modo, String descripcion_Modo) {
        this.id_ModoJuego = id_ModoJuego;
        this.nombre_Modo = nombre_Modo;
        this.descripcion_Modo = descripcion_Modo;
    }

    //Getters y setters
    public String getId_ModoJuego() {
        return id_ModoJuego;
    }

    public void setId_ModoJuego(String id_ModoJuego) {
        this.id_ModoJuego = id_ModoJuego;
    }

    public String getNombre_Modo() {
        return nombre_Modo;
    }

    public void setNombre_Modo(String nombre_Modo) {
        this.nombre_Modo = nombre_Modo;
    }

    public String getDescripcion_Modo() {
        return descripcion_Modo;
    }

    public void setDescripcion_Modo(String descripcion_Modo) {
        this.descripcion_Modo = descripcion_Modo;
    }
}