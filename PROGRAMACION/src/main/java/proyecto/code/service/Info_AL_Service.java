package proyecto.code.service;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import proyecto.code.exceptions.cargaException;

import java.net.URL;

public class Info_AL_Service {

    public void cargarImagen(ImageView imageView, String ruta) throws cargaException {

        URL recurso = getClass().getResource(ruta);

        if (recurso == null) {
            throw new cargaException("No se encontró la imagen: " + ruta);
        }

        Image img = new Image(recurso.toExternalForm());
        imageView.setImage(img);
    }
}
