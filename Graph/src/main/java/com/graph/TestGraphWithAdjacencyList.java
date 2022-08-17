package com.graph;

public class TestGraphWithAdjacencyList {
    public static void main(String[] args) {
        GraphWithAdjacencyList graph = new GraphWithAdjacencyList();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge(graph.getVertex("A"), graph.getVertex("C"));
        graph.addEdge(graph.getVertex("B"), graph.getVertex("D"));

        graph.displayVertexList();

        graph.displayAdjacencylist();

    }


}
