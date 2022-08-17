package com.graph;

public class TestDFS {
    public static void main(String[] args) {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.addVertex("A");
        depthFirstSearch.addVertex("B");
        depthFirstSearch.addVertex("C");
        depthFirstSearch.addVertex("D");

        depthFirstSearch.addVertex("E");
        depthFirstSearch.addVertex("F");
        depthFirstSearch.addVertex("G");

        depthFirstSearch.addVertex("H");
        depthFirstSearch.addVertex("I");

        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[0],depthFirstSearch.getVertexList()[1]);
        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[1],depthFirstSearch.getVertexList()[2]);
        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[2],depthFirstSearch.getVertexList()[3]);

        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[0],depthFirstSearch.getVertexList()[4]);
        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[4],depthFirstSearch.getVertexList()[5]);
        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[5],depthFirstSearch.getVertexList()[6]);

        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[0],depthFirstSearch.getVertexList()[7]);
        depthFirstSearch.addEdge(depthFirstSearch.getVertexList()[7],depthFirstSearch.getVertexList()[8]);


        depthFirstSearch.dfs();
    }
}
