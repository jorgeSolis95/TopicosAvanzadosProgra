package com.example.views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Tilepane extends Stage {
    private TilePane tile;
    private Scene escena;
    public Tilepane(){
        CrearUI();
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        tile = new TilePane();//Por defecto la posicion horizontal
        tile.setPrefColumns(6);//Declaramos 6 columnas
        tile.setPrefRows(4);//Y 4 filas
        for(int i = 0; i < 20; i++) {
            tile.getChildren().add(new Button("Boton "+ i));
        }
        escena=new Scene(tile);
    }
}
