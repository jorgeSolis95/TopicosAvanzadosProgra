package com.example.tarea1_2022;

import com.example.views.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        new Botones();
        new Botones2();
        new FlowspAne();
        new LayGridPane();
        new LayStackPane();
        new Tilepane();
    }

    public static void main(String[] args) {
        launch();
    }
}