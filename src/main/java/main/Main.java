package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new FXMLLoader(Main.class.getResource("/Main.fxml")).load();
        stage.setTitle("SpaceInvaders");
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}