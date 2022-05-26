package com.datastructure.circularlinkedlist;

public class Node {
    int dataItem;
    Node pointer;


    public Node(int dataItem) {
        this.dataItem = dataItem;
    }

    public Node(int dataItem, Node pointer) {
        this.dataItem = dataItem;
        this.pointer = pointer;
    }

    public int getDataItem() {
        return dataItem;
    }

    public void setDataItem(int dataItem) {
        this.dataItem = dataItem;
    }
}
