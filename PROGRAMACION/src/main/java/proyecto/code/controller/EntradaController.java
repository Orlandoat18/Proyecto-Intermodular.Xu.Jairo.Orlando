package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import proyecto.code.exceptions.initializeException;
import proyecto.code.service.EntradaService;

public class EntradaController {

    @FXML
    private MediaView videoFondo;

    @FXML
    private ImageView logoSuperior;

    @FXML
    private ImageView logoCentral;

    private final EntradaService entradaService = new EntradaService();

    @FXML
    public void initialize() throws initializeException{
        try {
            // 🎥 Video
            entradaService.cargarVideo(videoFondo, "/img/estrellas.mp4");

            // 🖼️ Imágenes
            entradaService.cargarImagen(logoSuperior, "/img/PAGINA_LOGO.jpg");
            entradaService.cargarImagen(logoCentral, "/img/PAGINA_LOGO.jpg");

        } catch (Exception e) {
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }
}
