package com.datastructure.singlylinkedlist;

public class Node {
    int dataItem;
    Node pointer;

    public Node(int dataItem) {
        this.dataItem = dataItem;
    }

    public int getDataItem() {
        return dataItem;
    }

    public void setDataItem(int dataItem) {
        this.dataItem = dataItem;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }
}
