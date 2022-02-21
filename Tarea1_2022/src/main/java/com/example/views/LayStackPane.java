package com.example.views;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LayStackPane extends Stage {
    private StackPane sp;
    private Scene escena;
    public LayStackPane(){
        CrearUI();
        this.setTitle("StackPane");
        this.setScene(escena);
        this.show();
    }
    private void CrearUI() {
        sp=new StackPane();
        sp.setPadding(new Insets(15));
        sp.getChildren().addAll(new Rectangle(150, 150, Color.DARKBLUE),new Button("Boton 1"));
        escena=new Scene(sp);
    }
}
