package proyecto.code.model;

public class Diseniador {
    //Atributos
    private String id_Diseniador;
    private String nombre_usuario;
    private String apellido_Diseniador;
    private String fecha_nacimiento;
    private String nacionalidad;

    //Constructor
    public Diseniador(String id_Diseniador, String nombre_usuario, String apellido_Diseniador, String fecha_nacimiento, String nacionalidad) {
        this.id_Diseniador = id_Diseniador;
        this.nombre_usuario = nombre_usuario;
        this.apellido_Diseniador = apellido_Diseniador;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
    }

    //Getters y setters
    public String getId_Diseniador() {
        return id_Diseniador;
    }

    public void setId_Diseniador(String id_Diseniador) {
        this.id_Diseniador = id_Diseniador;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_Diseniador() {
        return apellido_Diseniador;
    }

    public void setApellido_Diseniador(String apellido_Diseniador) {
        this.apellido_Diseniador = apellido_Diseniador;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}