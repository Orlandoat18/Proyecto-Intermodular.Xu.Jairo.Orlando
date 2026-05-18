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
import proyecto.code.service.Info_HK_Service;
import proyecto.code.service.Info_MC_Service;
import proyecto.code.service.Info_Sekiro_Service;

import java.io.IOException;
import java.sql.SQLException;

public class Info_HK_Controller {
    //Header
    @FXML
    private ImageView logoHeader;
    @FXML
    private Button btnInicio;

    //Introduccion
    @FXML
    private Text descripcionHK;

    //Table
    @FXML
    private Label desarrolladorHK;
    @FXML
    private Label distribuidorHK;
    @FXML
    private Label diseniadorHK;
    @FXML
    private Label plataformaHK;
    @FXML
    private Label generoHK;
    @FXML
    private Label modoHK;

    @FXML
    private ImageView hkImage;

    //Personaje
    @FXML
    private ImageView knight_personaje;
    @FXML
    private Text descripcionP1;

    private final Info_HK_Service info_HK_Service = new Info_HK_Service();

    @FXML
    private void initialize() {
        try {
            info_HK_Service.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            info_HK_Service.cargarImagen(hkImage, "/img/hollowknight.jpg");

            info_HK_Service.cargarImagen(knight_personaje, "/img/personaje/caballero.jpg");

            cargarDatos();
        }catch (cargaException e){
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    private void cargarDatos() {

        try {

            Videojuego videojuego = Info_HK_Service.getVideojuego("Hollow Knight");

            if (videojuego == null) return;

            descripcionHK.setText(videojuego.getDescripcion_Videojuego());

            desarrolladorHK.setText(Info_HK_Service.getDesarrollador(videojuego.getId_Desarrollador()));

            distribuidorHK.setText(Info_HK_Service.getDistribuidores(videojuego.getId_Videojuego()));

            diseniadorHK.setText(Info_HK_Service.getDiseniadores(videojuego.getId_Videojuego()));

            plataformaHK.setText(Info_HK_Service.getPlataformas(videojuego.getId_Videojuego()));

            generoHK.setText(Info_HK_Service.getGeneros(videojuego.getId_Videojuego()));

            modoHK.setText(Info_HK_Service.getModos(videojuego.getId_Videojuego()));

            descripcionP1.setText(Info_Sekiro_Service.getDescripcion_Personaje("Hollow Knight"));

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
