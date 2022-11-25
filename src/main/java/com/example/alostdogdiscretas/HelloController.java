package com.example.alostdogdiscretas;

import com.example.alostdogdiscretas.model.Graph;
import com.example.alostdogdiscretas.model.Vertex;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

import java.util.Random;

public class HelloController {

    public Graph graph;
    @FXML
    private Button buttonEmpezar;
    private ArrayList<String> names;
    private Random rd=new Random();
    @FXML
    private TextField nombre1;

    @FXML
    private TextField nombre2;

    @FXML
    void changeA(ActionEvent event) {
        load();
        System.out.println(graph.getVertexes().get(0).getName());
        graph.addEdge(names.get(0),names.get(1),3);
        graph.addEdge(names.get(0),names.get(2),5);
        graph.addEdge(names.get(1),names.get(2),6);
        graph.addEdge(names.get(1),names.get(13),2);
        graph.addEdge(names.get(2),names.get(3),8);
        graph.addEdge(names.get(2),names.get(5),2);
        graph.addEdge(names.get(3),names.get(6),5);
        graph.addEdge(names.get(3),names.get(9),6);
        graph.addEdge(names.get(3),names.get(11),9);
        graph.addEdge(names.get(4),names.get(13),1);
        graph.addEdge(names.get(4),names.get(14),3);
        graph.addEdge(names.get(5),names.get(10),5);
        graph.addEdge(names.get(5),names.get(26),7);
        graph.addEdge(names.get(6),names.get(7),1);
        graph.addEdge(names.get(7),names.get(26),4);
        graph.addEdge(names.get(8),names.get(9),2);
        graph.addEdge(names.get(8),names.get(25),8);
        graph.addEdge(names.get(10),names.get(11),1);
        graph.addEdge(names.get(11),names.get(12),9);
        graph.addEdge(names.get(12),names.get(19),6);
        graph.addEdge(names.get(13),names.get(15),4);
        graph.addEdge(names.get(14),names.get(22),3);
        graph.addEdge(names.get(15),names.get(16),5);
        graph.addEdge(names.get(16),names.get(19),2);
        graph.addEdge(names.get(16),names.get(17),1);
        graph.addEdge(names.get(17),names.get(18),8);
        graph.addEdge(names.get(17),names.get(29),4);
        graph.addEdge(names.get(19),names.get(20),6);
        graph.addEdge(names.get(19),names.get(23),3);
        graph.addEdge(names.get(21),names.get(28),4);
        graph.addEdge(names.get(21),names.get(44),7);
        graph.addEdge(names.get(22),names.get(23),1);
        graph.addEdge(names.get(23),names.get(24),1);
        graph.addEdge(names.get(24),names.get(32),5);
        graph.addEdge(names.get(26),names.get(44),8);
        graph.addEdge(names.get(27),names.get(32),4);
        graph.addEdge(names.get(27),names.get(36),7);
        graph.addEdge(names.get(27),names.get(33),5);
        graph.addEdge(names.get(28),names.get(35),9);
        graph.addEdge(names.get(30),names.get(34),7);
        graph.addEdge(names.get(30),names.get(41),6);
        graph.addEdge(names.get(31),names.get(36),2);
        graph.addEdge(names.get(31),names.get(38),1);
        graph.addEdge(names.get(34),names.get(41),3);
        graph.addEdge(names.get(35),names.get(41),3);
        graph.addEdge(names.get(35),names.get(42),4);
        graph.addEdge(names.get(36),names.get(42),6);
        graph.addEdge(names.get(39),names.get(37),4);
        graph.addEdge(names.get(39),names.get(46),4);
        graph.addEdge(names.get(40),names.get(42),1);
        graph.addEdge(names.get(40),names.get(43),1);
        graph.addEdge(names.get(40),names.get(47),2);
        graph.addEdge(names.get(41),names.get(48),3);
        graph.addEdge(names.get(45),names.get(46),3);
        graph.addEdge(names.get(45),names.get(47),7);
        graph.addEdge(names.get(45),names.get(49),9);
        graph.addEdge(names.get(48),names.get(49),9);
        graph.addEdge(names.get(48),names.get(50),8);

        graph.dijkstra(nombre1.getText(), names.get(rd.nextInt(names.size()-1)));
        /*graph.BFS(nombre1.getText());
        boolean flag=true;
        for(int i=0;i < 4 && flag;i++){
            for (int j=0;j<graph.getVertices().size();j++){

                if(graph.getVertices().get(j).getColor()!=3){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Conexo");
        }else{
            System.out.println("No conexo");
        }*/
    }
    public void load(){
        graph=new Graph();
        names=new ArrayList<>();
        names.add(graph.newVertex("Simon"));
        names.add(graph.newVertex("Falcao"));
        names.add(graph.newVertex("Cristiano"));
        names.add(graph.newVertex("Messi"));
        names.add(graph.newVertex("James"));
        names.add(graph.newVertex("Neymar"));
        names.add(graph.newVertex("Vinicious"));
        names.add(graph.newVertex("Luiz Diaz"));
        names.add(graph.newVertex("Yerry"));
        names.add(graph.newVertex("David"));
        names.add(graph.newVertex("Sara"));
        names.add(graph.newVertex("Juan Jose"));
        names.add(graph.newVertex("Juan Jose"));
        names.add(graph.newVertex("Yustes"));
        names.add(graph.newVertex("Juan Diego"));
        names.add(graph.newVertex("Luisa"));
        names.add(graph.newVertex("Ibai"));
        names.add(graph.newVertex("Westcol"));
        names.add(graph.newVertex("Titi"));
        names.add(graph.newVertex("Jeisson"));
        names.add(graph.newVertex("Cristian"));
        names.add(graph.newVertex("Marlon"));
        names.add(graph.newVertex("Juan Esteban"));
        names.add(graph.newVertex("Juan Manuel"));
        names.add(graph.newVertex("Sebastian"));
        names.add(graph.newVertex("Jose Manuel"));
        names.add(graph.newVertex("Daniela"));
        names.add(graph.newVertex("Valeria"));
        names.add(graph.newVertex("Valentina"));
        names.add(graph.newVertex("Luna"));
        names.add(graph.newVertex("Isabella"));
        names.add(graph.newVertex("Mariana"));
        names.add(graph.newVertex("Sofia"));
        names.add(graph.newVertex("Mario"));
        names.add(graph.newVertex("Luigi"));
        names.add(graph.newVertex("Sonic"));
        names.add(graph.newVertex("Carmona"));
        names.add(graph.newVertex("Nate"));
        names.add(graph.newVertex("Lee"));
        names.add(graph.newVertex("Yeury"));
        names.add(graph.newVertex("Kratos"));
        names.add(graph.newVertex("Atreus"));
        names.add(graph.newVertex("Odin"));
        names.add(graph.newVertex("Thor"));
        names.add(graph.newVertex("German"));
        names.add(graph.newVertex("Judy"));
        names.add(graph.newVertex("Amilbia"));
        names.add(graph.newVertex("Eduardo"));
        names.add(graph.newVertex("Ana"));
        names.add(graph.newVertex("Luisa Felipe"));
        names.add(graph.newVertex("Pablo"));
    }

}
