package com.example.views;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Botones extends Stage {

    private VBox vBox;
    private Button btn1,btn2,btn3;
    private Scene escena;

    public Botones(){
        CrearUI();
        this.setTitle("Botones en VBox");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        btn1=new Button("Boton1");
        btn2=new Button("Boton2");
        btn3=new Button("Boton3");
        vBox=new VBox(15);
        vBox.setPadding(new Insets(15));
        vBox.getChildren().addAll(btn1,btn2,btn3);
        escena=new Scene(vBox);
    }
}
