package proyecto.code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArcadepediaMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/entrada.fxml"));
        Parent root = loader.load();

        stage.setScene(new Scene(root));

        stage.setTitle("Arcadepedia");
        stage.sizeToScene();

        stage.setResizable(false);
        stage.centerOnScreen();


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
