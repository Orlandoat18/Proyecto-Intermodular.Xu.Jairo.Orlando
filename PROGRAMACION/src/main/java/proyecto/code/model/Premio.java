package proyecto.code.model;

public class Premio {
    //Atributos
    private String id_Premio;
    private String anio;
    private String nombre_Premio;

    //Constructor
    public Premio(String id_Premio, String anio, String nombre_Premio) {
        this.id_Premio = id_Premio;
        this.anio = anio;
        this.nombre_Premio = nombre_Premio;
    }

    //Getters y setters
    public String getId_Premio() {
        return id_Premio;
    }

    public void setId_Premio(String id_Premio) {
        this.id_Premio = id_Premio;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getNombre_Premio() {
        return nombre_Premio;
    }

    public void setNombre_Premio(String nombre_Premio) {
        this.nombre_Premio = nombre_Premio;
    }
}