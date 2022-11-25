package com.example.alostdogdiscretas.model;

import java.util.*;


public class Graph {

    public PriorityQueue<Vertex> pq ;
    private ArrayList<Vertex> vertexes;
    public Graph(){
        pq=new PriorityQueue<>(200,new Vertex());
        vertexes=new ArrayList<>();
    }
    public String newVertex(String name){
        vertexes.add(new Vertex(name));
        return name;
    }
    public void addEdge(String source, String dest, int weight) {
        Vertex a=search(source);
        Vertex b=search(dest);

        a.getAdjacentD().add(new Edge(b,weight));
        b.getAdjacentD().add(new Edge(a,weight));

    }
    public Vertex search(String goal){
        for (Vertex v: vertexes){
            if(v.getName().equals(goal)){
                return v;
            }
        }
        return null;
    }
    public void BFS(String name){

        Vertex vertex=search(name);
        if(vertex!=null){
            for(Vertex u: vertexes){
                if(u!=vertex){
                    u.setColor(2);
                    int a=0;
                    int b=((Integer)a).MAX_VALUE;
                    u.setDistance(b);
                    u.setPrevious(null);
                }
            }
            vertex.setColor(1);
            vertex.setDistance(0);
            vertex.setPrevious(null);
            Queue<Vertex> queue=new LinkedList<>();
            //cola usa una linked list
            queue.add(vertex);
            Vertex u;
            while(!queue.isEmpty()){
                u=queue.poll();
                ArrayList<Vertex> temp=new ArrayList<>();
                for(Edge a:u.getAdjacentD()){
                    temp.add(a.getDestination());
                }
                for(Vertex v:temp){
                    if(v.getColor()==2){
                        v.setColor(1);
                        v.setDistance(u.getDistance()+1);
                        v.setPrevious(u);
                        queue.add(v);
                    }
                }
                u.setColor(3);

            }
        }

    }

    public void dijkstra(String init, String finish) {
        Vertex start = search(init);
        start.setDistance(0);
        pq.add(start);
        int handled = 0;
        while (handled < vertexes.size() ){
            Vertex current = pq.poll();
               int vertWeight = current.getDistance();
                if (!current.isKnown()) {
                    handled++;
                    current.setKnown(true);
                    compAdjEdges(current, vertWeight);
                    if (current.getName().equals(finish)) {
                        System.out.println("Personas a las cuales preguntar: ");
                        printPath(current);
                        System.out.println();
                        System.out.println("Horas "+current.getDistance());
                        return;
                    }
                }
            }
    }
    public void compAdjEdges(Vertex s, int w) {
        Vertex source = s;
        int vertWeight = w;
        for (Edge e : source.getAdjacentD()) {
            Edge curEdge = e;
            Vertex curVer = e.getDestination();
            int origDist = curVer.getDistance();
            if (!curVer.isKnown()) {
               int tempDist = curEdge.getDistance();
                   tempDist += vertWeight;
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

    public ArrayList<Vertex> getVertexes() {
        return vertexes;
    }
}
