package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import proyecto.code.exceptions.cargaException;
import proyecto.code.model.Videojuego;
import proyecto.code.service.Info_AL_Service;
import proyecto.code.service.Info_Godwar_Service;

import java.io.IOException;
import java.sql.SQLException;

public class Info_AL_Controller {

    //Header
    @FXML
    private ImageView logoHeader;
    @FXML
    private Button btnInicio;

    //Introduccion
    @FXML
    private Text descripcionAL;

    //Table
    @FXML
    private Label desarrolladorAL;
    @FXML
    private Label distribuidorAL;
    @FXML
    private Label diseniadorAL;
    @FXML
    private Label plataformaAL;
    @FXML
    private Label generoAL;
    @FXML
    private Label modoAL;

    @FXML
    private ImageView alImage;

    //Personaje
    @FXML
    private ImageView driver_personaje;
    @FXML
    private Text descripcionP1;

    private final Info_AL_Service info_AL_Service  = new Info_AL_Service();

    @FXML
    private void initialize() {
        try {
            info_AL_Service.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            info_AL_Service.cargarImagen(alImage, "/img/asphaltlegends.jpg");

            info_AL_Service.cargarImagen(driver_personaje, "/img/personaje/PAGINA_PD.jpg");

            cargarDatos();

        }catch (cargaException e){
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    private void cargarDatos() {

        try {

            Videojuego videojuego = Info_AL_Service.getVideojuego("Minecraft");

            if (videojuego == null) return;

            descripcionAL.setText(videojuego.getDescripcion_Videojuego());

            desarrolladorAL.setText(Info_AL_Service.getDesarrollador(videojuego.getId_Desarrollador()));

            distribuidorAL.setText(Info_AL_Service.getDistribuidores(videojuego.getId_Videojuego()));

            diseniadorAL.setText(Info_AL_Service.getDiseniadores(videojuego.getId_Videojuego()));

            plataformaAL.setText(Info_AL_Service.getPlataformas(videojuego.getId_Videojuego()));

            generoAL.setText(Info_AL_Service.getGeneros(videojuego.getId_Videojuego()));

            modoAL.setText(Info_AL_Service.getModos(videojuego.getId_Videojuego()));

            descripcionP1.setText("Personaje principal del videojuego Sekiro.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void irInicio(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/views/inicio.fxml"));

            Stage stage = (Stage) btnInicio.getScene().getWindow();
            stage.setScene(new Scene(root));

            stage.setWidth(1050);
            stage.setHeight(700);
            stage.centerOnScreen();
            stage.show();

        }catch (IOException e){
            System.out.println("Error al entrar a inicio");
            e.printStackTrace();
        }
    }
}
