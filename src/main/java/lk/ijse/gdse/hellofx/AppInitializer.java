package lk.ijse.gdse.hellofx;

/**
 * --------------------------------------------
 * Author: R.I.B. Shamodha Sahan Rathnamalala
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.live
 * --------------------------------------------
 * Created: 9/27/2024 12:52 PM
 * Project: hellofx
 * --------------------------------------------
 **/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader
                .load(getClass().getResource("/view/HelloFx.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
//        stage.getIcons().add("path to image")
        stage.setTitle("Sample Application");
        stage.show();
    }
}
