module com.example.alostdogdiscretas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alostdogdiscretas to javafx.fxml;
    exports com.example.alostdogdiscretas;
}