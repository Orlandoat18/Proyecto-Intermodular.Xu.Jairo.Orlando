package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import proyecto.code.exceptions.cargaException;
import proyecto.code.service.Info_SekiroService;

import java.io.IOException;

public class Info_SekiroController {

    @FXML
    private ImageView logoHeader;

    @FXML
    private Button btnInicio;

    private final Info_SekiroService info_sekiroService = new Info_SekiroService();

    @FXML
    private void initialize() {
        try {
            info_sekiroService.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

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