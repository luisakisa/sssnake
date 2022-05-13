package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = FXMLLoader.load(getClass().getResource("./view/Main.fxml"));
        stage.setTitle("SpaceInvaders");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}