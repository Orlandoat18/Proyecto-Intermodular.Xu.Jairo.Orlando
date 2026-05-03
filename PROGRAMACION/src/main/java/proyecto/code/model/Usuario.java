package proyecto.code.model;

import java.util.Date;

public class Usuario {
    //Atributos
    private String id_Usuario;
    private String nombre_usuario;
    private String email;
    private String contrasenia;
    private Date fecha_registro;

    //Constructor
    public Usuario(String id_Usuario, String nombre_usuario, String email, String contrasenia, Date fecha_registro) {
        this.id_Usuario = id_Usuario;
        this.nombre_usuario = nombre_usuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.fecha_registro = fecha_registro;
    }

    //Getters y setters
    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}