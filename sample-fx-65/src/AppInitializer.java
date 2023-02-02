/*
    @author DanujaV
    @created 1/30/23 - 4:20 PM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("login_form.fxml");
        Parent root = FXMLLoader.load(resource);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Form");
        primaryStage.centerOnScreen();

        primaryStage.show();

        URL resource1 = getClass().getResource("DashBord.fxml");
        Parent root1 = FXMLLoader.load(resource1);

        Scene scene1 = new Scene(root1);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Login Form");
        primaryStage.centerOnScreen();

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
