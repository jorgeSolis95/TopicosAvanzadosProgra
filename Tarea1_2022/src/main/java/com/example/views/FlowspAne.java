package com.example.views;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowspAne extends Stage {

    private FlowPane flow;
    private Button btn1,btn2,btn3;
    private Scene escena;

    public FlowspAne(){
        CrearUI();
        this.setTitle("PruebaFlow");
        this.setScene(escena);
        this.show();
    }
    private void CrearUI() {
        btn1=new Button("Boton1");
        btn2=new Button("Boton2");
        btn3=new Button("Boton3");
        flow=new FlowPane(Orientation.VERTICAL);
        flow.setVgap(10);
        flow.getChildren().addAll(btn1,btn2,btn3);
        escena=new Scene(flow);
    }
}
