

public class Desarrollador {
    // Atributos
    private String id_Desarrollador;
    private String nombre_Desarrollador;
    private String pais_Desarrollador;
    private String ciudad_Desarrollador;
    private String fecha_fundacion_Des;
    private String sitio_web_Des;
    private String descripcion_Des;

    // Constructor

    // Getters and setters
    public String getId_Desarrollador() {
        return Id_Desarrollador;
    }

    public Desarrollador(String id_Desarrollador, String nombre_Desarrollador, String pais_Desarrollador,
            String ciudad_Desarrollador, String fecha_fundacion_Des, String sitio_web_Des, String descripcion_Des) {

        this.id_Desarrollador = id_Desarrollador;
        this.nombre_Desarrollador = nombre_Desarrollador;
        this.pais_Desarrollador = pais_Desarrollador;
        this.ciudad_Desarrollador = ciudad_Desarrollador;
        this.fecha_fundacion_Des = fecha_fundacion_Des;
        this.sitio_web_Des = sitio_web_Des;
        this.descripcion_Des = descripcion_Des;
    }

    public void setId_Desarrollador(String id_Desarrollador) {
        this.id_Desarrollador = id_Desarrollador;
    }

    public String getNombre_Desarrollador() {
        return nombre_Desarrollador;
    }

    public void setNombre_Desarrollador(String nombre_Desarrollador) {
        this.nombre_Desarrollador = nombre_Desarrollador;
    }

    public String getPais_Desarrollador() {
        return pais_Desarrollador;
    }

    public void setPais_Desarrollador(String pais_Desarrollador) {
        this.pais_Desarrollador = pais_Desarrollador;
    }

    public String getCiudad_Desarrollador() {
        return ciudad_Desarrollador;
    }

    public void setCiudad_Desarrollador(String ciudad_Desarrollador) {
        this.ciudad_Desarrollador = ciudad_Desarrollador;
    }

    public String getFecha_fundacion_Des() {
        return fecha_fundacion_Des;
    }

    public void setFecha_fundacion_Des(String fecha_fundacion_Des) {
        this.fecha_fundacion_Des = fecha_fundacion_Des;
    }

    public String getSitio_web_Des() {
        return sitio_web_Des;
    }

    public void setSitio_web_Des(String sitio_web_Des) {
        this.sitio_web_Des = sitio_web_Des;
    }

    public String getDescripcion_Des() {
        return descripcion_Des;
    }

    public void setDescripcion_Des(String descripcion_Des) {
        this.descripcion_Des = descripcion_Des;
    }

}