package com.datastructure.circularlinkedlist;

public class CircularLinkedList {

    Node head;
   
    int data;

    public CircularLinkedList() {
        this.head = null;
        this.data = 0;
    }

    public void insertNodeAtBeginning(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.pointer = head;
        } else {
            node.pointer = head;
            head.pointer = node;
            head = node;
        }
    }

    public void insertNodeAtEnd(int data) {
        if (head == null) {
            insertNodeAtBeginning(data);
        } else {
            Node tempPointer = head;
            while (tempPointer.pointer != head) {
                tempPointer = tempPointer.pointer;
            }
            Node node = new Node(data);
            tempPointer.pointer = node;
            node.pointer = head;

        }
    }

    public void insertNodeAtGivenPosition(int data, int position) {
        int length = 0;
        Node tempPointer = head;
        Node endPointer = null;
        if(position == 0){
            insertNodeAtBeginning(data);
        }else{
            while (tempPointer.pointer != head && length < position) {
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
        while (tempPointer.pointer != head) {
            System.out.println(tempPointer.dataItem);
            tempPointer = tempPointer.pointer;
        }
        System.out.println(tempPointer.dataItem);
    }

    public int findNode(int position) {
        Node tempPointer = head;
        int length = 1;
        while (tempPointer.pointer != head && length != position) {
            tempPointer = tempPointer.pointer;
            length++;
        }
        return tempPointer.dataItem;
    }

    public int getLinkedListSize(){
        int length = 1;
        Node start = head;
        while(start.pointer != head){
            start = start.pointer;
            length++;
        }
        return  length;
    }

    public Node deleteNodeAtBeginning() {
        Node node = head;
        Node start = head;
        while(node.pointer != head){
            node = node.pointer;
        }
        head = head.pointer;
        node.pointer = head;
        return start;
    }

    public Node deleteNodeAtEnd() {
        Node startPointer = head.pointer;
        Node endPointer = head;
        while (startPointer.pointer != head) {
            startPointer = startPointer.pointer;
            endPointer = endPointer.pointer;
        }
        endPointer.pointer = startPointer.pointer;
        return startPointer;
    }

    public Node deleteNodeAtGivenPosition(int position) {
        int length = 1;
        Node startPointer = head.pointer;
        Node endPointer = head;
        while (endPointer.pointer != null && length < position) {
            startPointer = startPointer.pointer;
            endPointer = endPointer.pointer;
            length++;
        }
        endPointer.pointer  =  startPointer.pointer;
        return startPointer;
    }
}
