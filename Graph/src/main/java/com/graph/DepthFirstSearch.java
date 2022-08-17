package com.graph;


import java.util.Enumeration;
import java.util.Stack;

public class DepthFirstSearch extends GraphWithAdjacencyMatrix{

    private Stack<Vertex> stack;

    public DepthFirstSearch() {
        super();
        this.stack = new Stack<>();

    }

    public void dfs(){
        Vertex vertex = getVertexList()[0];
        vertex.setWasVisited(true);
        stack.push(vertex);
        displayStack();
        while(!stack.isEmpty()){
            int pos = getAdjacent(getVertexIndex(stack.peek()));
            if(pos != -1){
                getVertexList()[pos].setWasVisited(true);
                stack.push(getVertexList()[pos]);
                displayStack();
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
