package proyecto.code.model;

public class Distribuidor {
    //Atributos
    private String id_Distribuidor;
    private String nombre_Distribuidor;
    private String pais_Distribuidor;
    private String ciudad_Distribuidor;
    private String fecha_fundacion_Dis;
    private String sitio_web_Dis;
    private String descripcion_Dis;

    //Constructor
    public Distribuidor(String id_Distribuidor, String nombre_Distribuidor, String pais_Distribuidor, String ciudad_Distribuidor, String fecha_fundacion_Dis, String sitio_web_Dis, String descripcion_Dis) {
        this.id_Distribuidor = id_Distribuidor;
        this.nombre_Distribuidor = nombre_Distribuidor;
        this.pais_Distribuidor = pais_Distribuidor;
        this.ciudad_Distribuidor = ciudad_Distribuidor;
        this.fecha_fundacion_Dis = fecha_fundacion_Dis;
        this.sitio_web_Dis = sitio_web_Dis;
        this.descripcion_Dis = descripcion_Dis;
    }

    //Getters y setters

    public String getId_Distribuidor() {
        return id_Distribuidor;
    }

    public void setId_Distribuidor(String id_Distribuidor) {
        this.id_Distribuidor = id_Distribuidor;
    }

    public String getNombre_Distribuidor() {
        return nombre_Distribuidor;
    }

    public void setNombre_Distribuidor(String nombre_Distribuidor) {
        this.nombre_Distribuidor = nombre_Distribuidor;
    }

    public String getPais_Distribuidor() {
        return pais_Distribuidor;
    }

    public void setPais_Distribuidor(String pais_Distribuidor) {
        this.pais_Distribuidor = pais_Distribuidor;
    }

    public String getCiudad_Distribuidor() {
        return ciudad_Distribuidor;
    }

    public void setCiudad_Distribuidor(String ciudad_Distribuidor) {
        this.ciudad_Distribuidor = ciudad_Distribuidor;
    }

    public String getFecha_fundacion_Dis() {
        return fecha_fundacion_Dis;
    }

    public void setFecha_fundacion_Dis(String fecha_fundacion_Dis) {
        this.fecha_fundacion_Dis = fecha_fundacion_Dis;
    }

    public String getSitio_web_Dis() {
        return sitio_web_Dis;
    }

    public void setSitio_web_Dis(String sitio_web_Dis) {
        this.sitio_web_Dis = sitio_web_Dis;
    }

    public String getDescripcion_Dis() {
        return descripcion_Dis;
    }

    public void setDescripcion_Dis(String descripcion_Dis) {
        this.descripcion_Dis = descripcion_Dis;
    }
}