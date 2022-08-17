package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GraphWithAdjacencyList {
    private List<Vertex> vertexList;
    private Map<Vertex, List<Vertex>> adjacencyList;

    List<Vertex> tempVertices ;

    public GraphWithAdjacencyList() {
        this.vertexList = new ArrayList<>();
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(String label) {
        Vertex vertex = new Vertex(label);
        vertexList.add(vertex);
    }

    public void addEdge(Vertex from, Vertex to){
        if(adjacencyList.containsKey(from)){
          adjacencyList.get(from).add(to);
        }else{
            tempVertices = new ArrayList<>();
            tempVertices.add(to);
            adjacencyList.put(from,tempVertices);
        }
    }

    public void displayAdjacencylist(){
        for(Map.Entry<Vertex, List<Vertex>> entry : adjacencyList.entrySet()){
            System.out.println("From :"+entry.getKey());
            System.out.println("To :");
            entry.getValue().stream().forEach(System.out::println);
            System.out.println("----------------------------------------------");
        }
    }

    public void displayVertexList(){
        for(Vertex vertex: vertexList){
            System.out.println(vertex.toString());
        }
    }

    public Vertex getVertex(String label){
        for(Vertex vertex : vertexList){
            if(vertex.getLabel().equals(label))return vertex;
        }
        return  null;
    }
}
