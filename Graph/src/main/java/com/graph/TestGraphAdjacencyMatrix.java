package com.graph;

public class TestGraphAdjacencyMatrix {
    public static void main(String[] args) {
        GraphWithAdjacencyMatrix graphWithAdjacencyMatrix = new GraphWithAdjacencyMatrix();
        graphWithAdjacencyMatrix.addVertex("A");
        graphWithAdjacencyMatrix.addVertex("B");
        graphWithAdjacencyMatrix.addVertex("C");
        graphWithAdjacencyMatrix.addVertex("D");

        graphWithAdjacencyMatrix.addEdge(graphWithAdjacencyMatrix.getVertexList()[0],graphWithAdjacencyMatrix.getVertexList()[1]);
        graphWithAdjacencyMatrix.addEdge(graphWithAdjacencyMatrix.getVertexList()[2],graphWithAdjacencyMatrix.getVertexList()[3]);

        graphWithAdjacencyMatrix.displayVertex(0);
        graphWithAdjacencyMatrix.displayVertex(2);

        graphWithAdjacencyMatrix.displayVertexList();

        graphWithAdjacencyMatrix.displayMatrix();
    }
}
