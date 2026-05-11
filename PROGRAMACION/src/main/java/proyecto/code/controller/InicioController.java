package proyecto.code.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import proyecto.code.exceptions.cargaException;
import proyecto.code.service.InicioService;

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
    private ImageView img_LOL;

    @FXML
    private ImageView img_Elden;

    @FXML
    private ImageView img_GodWar;

    @FXML
    private ImageView img_HK;

    @FXML
    private ImageView img_AL;

    private final InicioService inicioService = new InicioService();

    @FXML
    private void initialize() {
        try {
            inicioService.cargarImagen(logoHeader,"/img/PAGINA_LOGO.jpg");

            inicioService.cargarImagen(image_dibujo,"/img/PAGINA_DIBUJO_1.png");

            inicioService.cargarImagen(logoMain,"/img/PAGINA_LOGO.jpg");

            inicioService.cargarImagen(img_Sekiro,"/img/Sekiro.jpg");

            inicioService.cargarImagen(img_Minecraft,"/img/minecraft.jpg");

            inicioService.cargarImagen(img_LOL,"/img/lol.jpg");

            inicioService.cargarImagen(img_Elden,"/img/Eldenring.jpg");

            inicioService.cargarImagen(img_GodWar,"/img/Godofwar.jpg");

            inicioService.cargarImagen(img_HK,"/img/hollowknight.jpg");

            inicioService.cargarImagen(img_AL,"/img/asphaltlegends.jpg");

        }catch (cargaException e){
            System.out.println("Error general en carga de recursos");
            System.out.println(e.getMessage());
        }
    }


}
