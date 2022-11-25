package com.example.alostdogdiscretas.model;

public class Edge {
    private Vertex destination;
    private int distance;
    public Edge(){
        destination = null;
        distance = 1;
    }
    public Edge(Vertex d,int w){
        destination = d;
        distance = w;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
