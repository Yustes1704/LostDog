package com.example.alostdogdiscretas.model;

public class Edge {
    private Vertex destination;
    private int weight;
    public Edge(){
        destination = null;
        weight = Integer.MAX_VALUE;
    }
    public Edge(Vertex d,int w){
        destination = d;
        weight = w;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
