package com.graph;

import java.util.Enumeration;
import java.util.Stack;

public class MinimumSpanningTree extends GraphWithAdjacencyMatrix{

    private Stack<Vertex> stack;

    public MinimumSpanningTree() {
        super();
        this.stack = new Stack<>();
    }

    public void mst(){
        Vertex vertex = getVertexList()[0];
        vertex.setWasVisited(true);
        stack.push(vertex);
        displayStack();
        while(!stack.isEmpty()){
            Vertex currentVertex = stack.peek();
            int pos = getAdjacent(getVertexIndex(currentVertex));
            if(pos != -1){
                Vertex adjacentVertex = getVertexList()[pos];
                adjacentVertex.setWasVisited(true);
                stack.push(adjacentVertex);
                System.out.print(vertex.getLabel()+adjacentVertex.getLabel());
                System.out.println();
            }else{
                stack.pop();
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
        Enumeration enu = stack.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
