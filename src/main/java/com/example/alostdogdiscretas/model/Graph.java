package com.example.alostdogdiscretas.model;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Graph {

    private Map<String, Vertex> vertices = new HashMap<String, Vertex>();
    public PriorityQueue<Vertex> pq = new PriorityQueue<Vertex>(200, new Vertex());


    public void addVertex(String source, String dest, int weight) {
        Vertex v = getVertex(source);
        Vertex w = getVertex(dest);
        v.getAdjacentD().add(new Edge(w, weight));
        w.getAdjacentD().add(new Edge(v, weight));
    }

    private Vertex getVertex(String name) {
        Vertex v =  vertices.get(name);
        if (v == null) {
            v = new Vertex(name);
            vertices.put(name, v);
        }
        return v;
    }

    public void dijkstra(String init, String ciudadO) {
        Vertex current;
        Vertex start = vertices.get(init);
        start.setDistance(0);
        pq.add(start);
        int handled = 0;
        while (handled < vertices.size()) {
            current = pq.poll();
            int vertWeight = current.getDistance();
            if (!current.isKnown()) {
                handled++;
                current.setKnown(true);
                compAdjEdges(current, vertWeight);
                if (current.getName().equals(ciudadO)) {
                    System.out.println("Personas a las cuales preguntar: ");
                    printPath(current);
                    System.out.println();
                    System.out.println("Horas "+current.getDistance());
                }
            }
        }
    }
    public void compAdjEdges(Vertex s, int w) {
        Vertex source = s;
        int vertWeight = w;
        int tempDist;
        int origDist;
        for (Edge e : source.getAdjacentD()) {
            Edge curEdge = e;
            Vertex curVer = e.getDestination();
            origDist = curVer.getDistance();
            if (!curVer.isKnown()) {
                tempDist = curEdge.getWeight();
                tempDist = tempDist + vertWeight;
                if (tempDist < origDist) {
                    curVer.setDistance(tempDist);
                    curVer.setPrevious(source);
                    pq.add(curVer);
                }
            }
        }
    }
    public void printPath(Vertex c) {
        Vertex current = c;
        if (current.getPrevious() != null) {
            printPath(current.getPrevious());
            System.out.print(" --> ");
            System.out.print(current.getName());
        }
        if (current.getPrevious() == null) {
            System.out.print(current.getName());
        }
    }
}
