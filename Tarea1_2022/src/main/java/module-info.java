module com.example.tarea1_2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea1_2022 to javafx.fxml;
    exports com.example.tarea1_2022;
}