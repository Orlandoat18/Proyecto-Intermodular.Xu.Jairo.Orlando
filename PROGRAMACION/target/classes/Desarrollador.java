package clases;

public class Desarrollador {
    //Atributos
    private String Id_Desarrollador;
    private String Nombre_Desarrollador;
    private String Pais_Desarrollador;
    private String Ciudad_Desarrollador;
    private String Fecha_fundacion_Des;
    private String Sitio_web_Des;
    private String Descripcion_Des;

    //Constructor
    

    //Métodos
    



    //ToString
    @Override
    public String toString() {
        return "Desarrollador{" +
                "Id_Desarrollador='" + Id_Desarrollador + '\'' +
                ", Nombre_Desarrollador='" + Nombre_Desarrollador + '\'' +
                ", Pais_Desarrollador='" + Pais_Desarrollador + '\'' +
                ", Ciudad_Desarrollador='" + Ciudad_Desarrollador + '\'' +
                ", Fecha_fundacion_Des='" + Fecha_fundacion_Des + '\'' +
                ", Sitio_web_Des='" + Sitio_web_Des + '\'' +
                ", Descripcion_Des='" + Descripcion_Des + '\'' +
                '}';
    }
}