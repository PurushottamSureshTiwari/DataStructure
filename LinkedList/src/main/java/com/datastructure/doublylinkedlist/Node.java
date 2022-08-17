package com.datastructure.doublylinkedlist;

public class Node {
    int dataItem;
    Node pointerPointer;
    Node previousPointer;

    public Node(int dataItem) {
        this.dataItem = dataItem;
    }

    public Node(int dataItem, Node pointerPointer, Node previousPointer) {
        this.dataItem = dataItem;
        this.pointerPointer = pointerPointer;
        this.previousPointer = previousPointer;
    }

    public int getDataItem() {
        return dataItem;
    }

    public void setDataItem(int dataItem) {
        this.dataItem = dataItem;
    }
}
