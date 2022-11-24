package com.example.alostdogdiscretas;

import com.example.alostdogdiscretas.model.Graph;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    public Graph graph=new Graph();
    @FXML
    private Button buttonEmpezar;

    @FXML
    private TextField nombre1;

    @FXML
    private TextField nombre2;

    @FXML
    void changeA(ActionEvent event) {
        graph.addVertex("Simon","Claudia",3);
        graph.addVertex("Claudia","German",5);
        graph.addVertex("Juan Jose","Sara",6);
        graph.addVertex("Sara","German",2);
        graph.addVertex("German","Lili",8);
        graph.addVertex("Lili","Juan Jose",2);

        graph.dijkstra(nombre1.getText(), nombre2.getText());

    }

}
