package com.datastructure.doublylinkedlist;

public class Node {
    int dataItem;
    Node nextPointer;
    Node previousPointer;

    public Node(int dataItem) {
        this.dataItem = dataItem;
    }

    public Node(int dataItem, Node nextPointer, Node previousPointer) {
        this.dataItem = dataItem;
        this.nextPointer = nextPointer;
        this.previousPointer = previousPointer;
    }

    public int getDataItem() {
        return dataItem;
    }

    public void setDataItem(int dataItem) {
        this.dataItem = dataItem;
    }
}
