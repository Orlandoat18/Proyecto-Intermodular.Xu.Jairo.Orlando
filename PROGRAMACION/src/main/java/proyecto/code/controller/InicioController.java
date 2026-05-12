package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import proyecto.code.exceptions.cargaException;
import proyecto.code.service.InicioService;

import java.io.IOException;

public class InicioController {
    @FXML
    private ImageView logoHeader;

    @FXML
    private ImageView image_dibujo;

    @FXML
    private ImageView logoMain;

    @FXML
    private ImageView img_Sekiro;

    @FXML
    private ImageView img_Minecraft;

    @FXML
    private ImageView img_GodWar;

    @FXML
    private ImageView img_HK;

    @FXML
    private ImageView img_AL;

    @FXML
    private VBox tarjeta_Sekiro;

    private final InicioService inicioService = new InicioService();

    @FXML
    private void initialize() {
        try {
            inicioService.cargarImagen(logoHeader, "/img/PAGINA_LOGO.jpg");

            inicioService.cargarImagen(image_dibujo, "/img/PAGINA_DIBUJO_1.png");

            inicioService.cargarImagen(logoMain, "/img/PAGINA_LOGO.jpg");

            inicioService.cargarImagen(img_Sekiro, "/img/Sekiro.jpg");

            inicioService.cargarImagen(img_Minecraft, "/img/minecraft.jpg");

            inicioService.cargarImagen(img_GodWar, "/img/Godofwar.jpg");

            inicioService.cargarImagen(img_HK, "/img/hollowknight.jpg");

            inicioService.cargarImagen(img_AL, "/img/asphaltlegends.jpg");

        } catch (cargaException e) {
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void irInfo_Sekiro() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/views/info_Sekiro.fxml"));

            Stage stage = (Stage) tarjeta_Sekiro.getScene().getWindow();
            stage.setScene(new Scene(root));

            stage.setWidth(1000);
            stage.setHeight(700);
            stage.centerOnScreen();
            stage.show();

        } catch (IOException e) {
            System.out.println("Error al entrar a infomacion de Sekiro");
            e.printStackTrace();
        }
    }

}
