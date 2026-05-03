package proyecto.code.service;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import proyecto.code.exceptions.initializeException;

import java.net.URL;

public class EntradaService {
    public void cargarVideo(MediaView mediaView, String ruta) throws initializeException{

        URL recurso = getClass().getResource(ruta);

        if (recurso == null) {
            throw new initializeException("No se encontró el video: " + ruta);
        }

        Media media = new Media(recurso.toExternalForm());
        MediaPlayer player = new MediaPlayer(media);

        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.setMute(true);
        player.play();

        mediaView.setMediaPlayer(player);
    }

    public void cargarImagen(ImageView imageView, String ruta) throws initializeException{

        URL recurso = getClass().getResource(ruta);

        if (recurso == null) {
            throw new initializeException("No se encontró la imagen: " + ruta);
        }

        Image img = new Image(recurso.toExternalForm());
        imageView.setImage(img);
    }
}
