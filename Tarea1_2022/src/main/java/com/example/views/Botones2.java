package com.example.views;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Botones2 extends Stage {
    private BorderPane raiz;
    private Scene scene;
    public Botones2(){
        CrearUI();
        this.setTitle("Botones en 4 direcciones");
        this.setScene(scene);
        this.show();
    }
    private void CrearUI() {
        raiz = new BorderPane();
        raiz.setTop(new Button("TOP"));
        raiz.setBottom(new Button("BOTTOM"));
        raiz.setLeft(new Button("LEFT"));
        raiz.setRight(new Button("RIGHT"));
        raiz.setCenter(new Button("CENTER"));

        scene = new Scene(raiz);
    }
}
