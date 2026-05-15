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

import proyecto.code.config.DatabaseConfig;
import proyecto.code.exceptions.cargaException;
import proyecto.code.model.Videojuego;
import proyecto.code.service.Info_Sekiro_Service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Info_Sekiro_Controller {

//Header
    @FXML
    private ImageView logoHeader;
    @FXML
    private Button btnInicio;

//Introduccion
    @FXML
    private Text descripcionSekiro;

//Table
    @FXML
    private Label desarrolladorSekiro;
    @FXML
    private Label distribuidorSekiro;
    @FXML
    private Label diseniadorSekiro;
    @FXML
    private Label plataformaSekiro;
    @FXML
    private Label generoSekiro;
    @FXML
    private Label modoSekiro;

    @FXML
    private ImageView sekiroImage;

//Personaje
    @FXML
    private ImageView sekiro_personaje;
    @FXML
    private Text descripcionP1;


    private Info_Sekiro_Service info_Sekiro_Service;

    @FXML
    private void initialize() {
        info_Sekiro_Service = new Info_Sekiro_Service();

        try {
            info_Sekiro_Service.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            info_Sekiro_Service.cargarImagen(sekiroImage, "/img/Sekiro.jpg");

            info_Sekiro_Service.cargarImagen(sekiro_personaje, "/img/sekiro_personaje/Sekiro_personaje.jpg");

            cargarDatos();

        } catch (cargaException e) {
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    private void cargarDatos() {

        try {

            Videojuego sekiro = Info_Sekiro_Service.getVideojuego("Sekiro: Shadows Die Twice");

            if (sekiro == null) return;

            descripcionSekiro.setText(sekiro.getDescripcion_Videojuego());

            desarrolladorSekiro.setText(Info_Sekiro_Service.getDesarrollador(sekiro.getId_Desarrollador()));

            distribuidorSekiro.setText(Info_Sekiro_Service.getDistribuidores(sekiro.getId_Videojuego()));

            diseniadorSekiro.setText(Info_Sekiro_Service.getDiseniadores(sekiro.getId_Videojuego()));

            plataformaSekiro.setText(Info_Sekiro_Service.getPlataformas(sekiro.getId_Videojuego()));

            generoSekiro.setText(Info_Sekiro_Service.getGeneros(sekiro.getId_Videojuego()));

            modoSekiro.setText(Info_Sekiro_Service.getModos(sekiro.getId_Videojuego()));

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