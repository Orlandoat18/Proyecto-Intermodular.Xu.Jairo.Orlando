package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import proyecto.code.exceptions.cargaException;
import proyecto.code.service.Info_Sekiro_Service;

import java.io.IOException;

public class Info_Sekiro_Controller {

    @FXML
    private ImageView logoHeader;

    @FXML
    private Button btnInicio;

    @FXML
    private ImageView sekiroImage;
    
    @FXML
    private ImageView sekiro_personaje;
    
    @FXML
    private ImageView isshin_personaje;
    
    @FXML
    private ImageView genichiro_personaje;

    private final Info_Sekiro_Service info_Sekiro_Service = new Info_Sekiro_Service();

    @FXML
    private void initialize() {
        try {
            info_Sekiro_Service.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            info_Sekiro_Service.cargarImagen(sekiroImage, "/img/Sekiro.jpg");
            
            info_Sekiro_Service.cargarImagen(sekiro_personaje,"/img/sekiro_personaje/Sekiro_personaje.jpg");
            
            info_Sekiro_Service.cargarImagen(isshin_personaje,"/img/sekiro_personaje/Isshin_Personaje.jpg");
            
            info_Sekiro_Service.cargarImagen(genichiro_personaje,"/img/sekiro_personaje/Genichiro_Personaje.jpg");

        }catch (cargaException e){
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
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