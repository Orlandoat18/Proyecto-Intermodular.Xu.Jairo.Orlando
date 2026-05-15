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
import proyecto.code.service.Info_MC_Service;
import proyecto.code.service.Info_Sekiro_Service;

import java.io.IOException;
import java.sql.SQLException;

public class Info_MC_Controller {

    //Header
    @FXML
    private ImageView logoHeader;
    @FXML
    private Button btnInicio;

    //Introduccion
    @FXML
    private Text descripcionMC;

    //Table
    @FXML
    private Label desarrolladorMC;
    @FXML
    private Label distribuidorMC;
    @FXML
    private Label diseniadorMC;
    @FXML
    private Label plataformaMC;
    @FXML
    private Label generoMC;
    @FXML
    private Label modoMC;

    @FXML
    private ImageView mcImage;

    //Personaje
    @FXML
    private ImageView steve_personaje;
    @FXML
    private Text descripcionP1;

    private final Info_MC_Service info_MC_Service = new Info_MC_Service();

    @FXML
    private void initialize() {
        try {
            info_MC_Service.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            info_MC_Service.cargarImagen(mcImage, "/img/minecraft.jpg");

            info_MC_Service.cargarImagen(steve_personaje, "/img/PAGINA_PK.jpg");

            cargarDatos();

        }catch (cargaException e){
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    private void cargarDatos() {

        try {

            Videojuego videojuego = Info_MC_Service.getVideojuego("Minecraft");

            if (videojuego == null) return;

            descripcionMC.setText(videojuego.getDescripcion_Videojuego());

            desarrolladorMC.setText(Info_MC_Service.getDesarrollador(videojuego.getId_Desarrollador()));

            distribuidorMC.setText(Info_MC_Service.getDistribuidores(videojuego.getId_Videojuego()));

            diseniadorMC.setText(Info_MC_Service.getDiseniadores(videojuego.getId_Videojuego()));

            plataformaMC.setText(Info_MC_Service.getPlataformas(videojuego.getId_Videojuego()));

            generoMC.setText(Info_MC_Service.getGeneros(videojuego.getId_Videojuego()));

            modoMC.setText(Info_MC_Service.getModos(videojuego.getId_Videojuego()));

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
