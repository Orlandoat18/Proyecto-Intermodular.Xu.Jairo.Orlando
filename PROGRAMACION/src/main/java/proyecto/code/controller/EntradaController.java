package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import proyecto.code.exceptions.cargaException;
import proyecto.code.service.EntradaService;

import java.io.IOException;

public class EntradaController {

    @FXML
    private MediaView videoFondo;

    @FXML
    private ImageView logoCentral;

    @FXML
    private Button btnEntrar;

    private final EntradaService entradaService = new EntradaService();

    @FXML
    public void initialize(){
        try {
            // Video
            entradaService.cargarVideo(videoFondo, "/img/estrellas.mp4");

            // Imagenes
            entradaService.cargarImagen(logoCentral, "/img/PAGINA_LOGO.jpg");

        } catch (cargaException e) {
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void irInicio(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/views/inicio.fxml"));

            Stage stage = (Stage) btnEntrar.getScene().getWindow();
            stage.setScene(new Scene(root));

            stage.setWidth(1000);
            stage.setHeight(700);
            stage.centerOnScreen();
            stage.show();

        }catch (IOException e){
            System.out.println("Error al entrar a inicio");
            e.printStackTrace();
        }
    }
}
