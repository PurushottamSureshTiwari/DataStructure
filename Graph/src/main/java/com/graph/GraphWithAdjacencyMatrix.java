package com.graph;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraphWithAdjacencyMatrix {
    private final int MAX_VERTICES = 20;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int noOfCurrentVertices;

    public GraphWithAdjacencyMatrix() {
        vertexList = new Vertex[MAX_VERTICES];
        adjacencyMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        noOfCurrentVertices = 0;

        for(int i = 0 ; i < adjacencyMatrix.length;i++){
            for(int j = 0 ; j< adjacencyMatrix[i].length ; j++){
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(String label){
        Vertex vertex = new Vertex(label);
        vertexList[noOfCurrentVertices++] = vertex;
    }

    public void addEdge(Vertex start, Vertex end){
        int x = -1, y = -1;
        if(vertexList.length != 0){

            for(int  i = 0 ;i< (vertexList.length-1);i++){
                if(vertexList[i].getLabel().equals(start.getLabel())){
                    x = i;
                }
                if(vertexList[i].getLabel().equals(end.getLabel())){
                    y = i;
                }
                if(x != -1 && y != -1)break;
            }
        }
        adjacencyMatrix[x][y] = 1;
        adjacencyMatrix[y][x] = 1;

    }

    public int getVertexIndex(Vertex vertex){
        int index = -1;
        for(int i = 0 ; i< getVertexList().length-1 ;i++ ){
            if(vertex.getLabel().equalsIgnoreCase(getVertexList()[i].getLabel())){
                index = i;break;
            }
        }
        return index;
    }

    public Vertex getVertex(int pos){
       return getVertexList()[pos];

    }

    public void displayVertex(int pos){
        if(pos > vertexList.length)return;
        Vertex vertex = vertexList[pos];
        System.out.println("Vertex :"+vertex.toString());
    }

    public void displayVertexList(){
        for(Vertex vertex : vertexList){
            if(vertex != null)System.out.println(vertex.toString());
        }
    }

    public void displayMatrix(){
        for(int i = 0 ; i < adjacencyMatrix.length;i++){
            for(int j = 0 ; j< adjacencyMatrix[i].length ; j++){
                System.out.print(adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
