package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaView;
import proyecto.code.exceptions.entradaException;
import proyecto.code.service.EntradaService;

public class EntradaController {

    @FXML
    private MediaView videoFondo;

    @FXML
    private ImageView logoCentral;

    private final EntradaService entradaService = new EntradaService();

    @FXML
    public void initialize() throws entradaException {
        try {
            // Video
            entradaService.cargarVideo(videoFondo, "/img/estrellas.mp4");

            // Imagenes
            entradaService.cargarImagen(logoCentral, "/img/PAGINA_LOGO.jpg");

        } catch (entradaException e) {
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }
}
