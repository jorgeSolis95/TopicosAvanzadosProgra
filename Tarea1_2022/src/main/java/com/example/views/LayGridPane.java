package com.example.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LayGridPane extends Stage {

    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    private GridPane grid;
    private Scene escena;

    public LayGridPane(){
        CrearUI();
        this.setScene(escena);
        this.show();
    }
    private void CrearUI() {
        btn1=new Button("Posicion 0, 0");
        btn2=new Button("Posicion 0, 1");
        btn3=new Button("Posicion 0, 2");
        btn4=new Button("Posicion 1, 0");
        btn5=new Button("Posicion 1, 1");
        btn6=new Button("Posicion 1, 2");
        grid=new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(btn1, 0, 0);
        grid.add(btn2, 0, 1);
        grid.add(btn3, 0, 2);
        grid.add(btn4, 1, 0);
        grid.add(btn5, 1, 1);
        grid.add(btn6, 1, 2);
        escena=new Scene(grid);
    }
}
