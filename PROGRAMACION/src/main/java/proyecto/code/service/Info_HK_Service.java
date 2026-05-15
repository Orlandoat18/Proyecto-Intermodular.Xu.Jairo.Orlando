package proyecto.code.service;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import proyecto.code.config.DatabaseConfig;
import proyecto.code.dao.impl.VideojuegoDAOImpl;
import proyecto.code.exceptions.cargaException;
import proyecto.code.model.Videojuego;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;

public class Info_HK_Service {
    private static final VideojuegoDAOImpl dao = new VideojuegoDAOImpl();

    public void cargarImagen(ImageView imageView, String ruta) throws cargaException {

        URL recurso = getClass().getResource(ruta);

        if (recurso == null) {
            throw new cargaException("No se encontró la imagen: " + ruta);
        }

        Image img = new Image(recurso.toExternalForm());
        imageView.setImage(img);
    }

    public static Videojuego getVideojuego(String titulo) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.obtenerVideojuegoPorTitulo(connection,titulo);
    }

    public static String getDesarrollador(int idDesarrollador) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.getDesarrollador(connection,idDesarrollador);
    }

    public static String getDistribuidores(int idVideojuego) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.getDistribuidor(connection,idVideojuego);
    }

    public static String getDiseniadores(int idVideojuego) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.getDiseniador(connection,idVideojuego);
    }

    public static String getPlataformas(int idVideojuego) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.getPlataforma(connection,idVideojuego);
    }

    public static String getGeneros(int idVideojuego) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.getGenero(connection,idVideojuego);
    }

    public static String getModos(int idVideojuego) throws SQLException {
        Connection connection = DatabaseConfig.getConnection();

        return dao.getModo(connection,idVideojuego);
    }
}
