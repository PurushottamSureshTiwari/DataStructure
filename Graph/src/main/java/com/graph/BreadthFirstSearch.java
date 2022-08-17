package com.graph;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends GraphWithAdjacencyMatrix{

    private Queue<Vertex> vertexQueue;

    public BreadthFirstSearch() {
        this.vertexQueue = new LinkedList<>();
    }

    public void bfs(){
        int v1;
        Vertex vertex = getVertexList()[0];
        vertex.setWasVisited(true);
        vertexQueue.add(vertex);
        displayStack();
        while(!vertexQueue.isEmpty()){
            Vertex vertex1 = vertexQueue.remove();
            while((v1 = getAdjacent(getVertexIndex(vertex1))) != -1){
                getVertex(v1).setWasVisited(true);
                vertexQueue.add(getVertex(v1));
                displayStack();
            }
        }
    }

    public int getAdjacent(int pos){

        for(int j  = 0 ; j< getAdjacencyMatrix()[pos].length;j++){
            if(getAdjacencyMatrix()[pos][j] == 1 && !getVertexList()[j].isWasVisited()){
                return j ;
            }
        }
        return  -1;
    }


    public void displayStack(){
       vertexQueue.stream().forEach(System.out::println);
    }
}

