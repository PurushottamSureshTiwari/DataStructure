package com.datastructure.singlylinkedlist;

public class SinglyLinkedList {
    Node head;
    int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void insertNodeAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.pointer = null;
        } else {
            node.pointer = head;
            head = node;
        }
        length++;
    }

    public void insertNodeAtEnd(int data) {
        if (head == null) {
            insertNodeAtBeginning(data);
        } else {
            Node tempPointer = head;
            while (tempPointer.pointer != null) {
                tempPointer = tempPointer.pointer;
            }
            Node node = new Node(data);
            tempPointer.pointer = node;
            node.pointer = null;

        }
        length++;
    }

    public void insertNodeAtGivenPosition(int data, int position) {
        int length = 0;
        Node tempPointer = head;
        Node endPointer = null;
        if(position == 0){
            insertNodeAtBeginning(data);
        }else{
            while (tempPointer.pointer != null && length < position) {
                endPointer = tempPointer;
                tempPointer = tempPointer.pointer;
                length++;
            }
            Node node = new Node(data);
            endPointer.pointer = node;
            node.pointer = tempPointer;
        }
    }

    public void printLinkedList() {
        Node tempPointer = head;
        while (tempPointer != null) {
            System.out.println(tempPointer.dataItem);
            tempPointer = tempPointer.pointer;
        }
    }

    public int findNode(int position) {
        Node tempPointer = head;
        int length = 0;
        while (tempPointer.pointer != null && length != position) {
            tempPointer = tempPointer.pointer;
            length++;
        }
        return tempPointer.dataItem;
    }

    public int getLinkedListSize(){
        int length = 0;
        Node start = head;
        while(start != null){
            start = start.pointer;
            length++;
        }
        return  length;
    }

    public Node deleteNodeAtBeginning() {
        Node node = head;
        head = head.pointer;
        return node;
    }

    public Node deleteNodeAtEnd() {
        Node startPointer = head.pointer;
        Node endPointer = head;
        while (startPointer.pointer != null) {
            startPointer = startPointer.pointer;
            endPointer = endPointer.pointer;
        }
        endPointer.pointer = null;
        return startPointer;
    }

    public Node deleteNodeAtGivenPosition(int position) {
        int length = 0;
        Node startPointer = head.pointer;
        Node endPointer = head;
        while (endPointer.pointer != null && length< (position -1)) {
            startPointer = startPointer.pointer;
            endPointer = endPointer.pointer;
            length++;
        }
        endPointer.pointer  =  startPointer.pointer;
        return startPointer;
    }
}

