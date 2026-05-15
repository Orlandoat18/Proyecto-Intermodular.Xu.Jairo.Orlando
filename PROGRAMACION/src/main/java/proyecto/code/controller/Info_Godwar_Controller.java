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
import proyecto.code.service.Info_Godwar_Service;
import proyecto.code.service.Info_HK_Service;

import java.io.IOException;
import java.sql.SQLException;

public class Info_Godwar_Controller {

    //Header
    @FXML
    private ImageView logoHeader;
    @FXML
    private Button btnInicio;

    //Introduccion
    @FXML
    private Text descripcionGW;

    //Table
    @FXML
    private Label desarrolladorGW;
    @FXML
    private Label distribuidorGW;
    @FXML
    private Label diseniadorGW;
    @FXML
    private Label plataformaGW;
    @FXML
    private Label generoGW;
    @FXML
    private Label modoGW;

    @FXML
    private ImageView gwImage;

    //Personaje
    @FXML
    private ImageView kratos_personaje;
    @FXML
    private Text descripcionP1;
    
    private final Info_Godwar_Service info_Godwar_Service = new Info_Godwar_Service();

    @FXML
    private void initialize() {
        try {
            info_Godwar_Service.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            info_Godwar_Service.cargarImagen(gwImage, "/img/Godofwar.jpg");

            info_Godwar_Service.cargarImagen(kratos_personaje, "/img/personaje/Krato.jpg");

            cargarDatos();

        }catch (cargaException e){
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    private void cargarDatos() {

        try {

            Videojuego videojuego = Info_Godwar_Service.getVideojuego("God of War");

            if (videojuego == null) return;

            descripcionGW.setText(videojuego.getDescripcion_Videojuego());

            desarrolladorGW.setText(Info_Godwar_Service.getDesarrollador(videojuego.getId_Desarrollador()));

            distribuidorGW.setText(Info_Godwar_Service.getDistribuidores(videojuego.getId_Videojuego()));

            diseniadorGW.setText(Info_Godwar_Service.getDiseniadores(videojuego.getId_Videojuego()));

            plataformaGW.setText(Info_Godwar_Service.getPlataformas(videojuego.getId_Videojuego()));

            generoGW.setText(Info_Godwar_Service.getGeneros(videojuego.getId_Videojuego()));

            modoGW.setText(Info_Godwar_Service.getModos(videojuego.getId_Videojuego()));

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
