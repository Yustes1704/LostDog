package com.example.alostdogdiscretas.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;


public class Vertex implements Comparator<Vertex> {

    private String name;
    private LinkedList<Edge> adjacentD;

    private int distance;

    private Vertex previous;
    private boolean known;
    private int defaultDis = Integer.MAX_VALUE;
    private int color;
    public Vertex() {
        name = null;
        distance = defaultDis;
        previous = null;
        known = false;
    }

    public Vertex(String source) {
        name = source;
        adjacentD = new LinkedList<>();
        previous = null;
        distance=defaultDis;
        known = false;
    }


    public int getDistance() {
        return distance;
    }

    public void setDistance(int w) {
        distance = w;
    }

    public int compare(Vertex v1, Vertex v2) {
        int w1 = v1.getDistance();
        int w2 = v2.getDistance();
        if (w1 > w2) {
            return 1;
        } else if (w1 < w2) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Edge> getAdjacentD() {
        return adjacentD;
    }

    public void setAdjacentD(LinkedList<Edge> adjacentD) {
        this.adjacentD = adjacentD;
    }

    public Vertex getPrevious() {
        return previous;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }

    public boolean isKnown() {
        return known;
    }

    public void setKnown(boolean known) {
        this.known = known;
    }

    public int getDefaultDis() {
        return defaultDis;
    }

    public void setDefaultDis(int defaultDis) {
        this.defaultDis = defaultDis;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
