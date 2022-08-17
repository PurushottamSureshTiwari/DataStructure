package com.datastructure.doublylinkedlist;

public class DoublyLinkedList {
    
    Node head,tail;
    Node pointerPointer;
    Node previousPointer;
    int length;

    public DoublyLinkedList() {
        this.head = null;
        this.previousPointer=null;
        this.pointerPointer=null;
        this.length = 0;
    }

    public void insertNodeAtBeginning(int data) {
        Node node = new Node(data,null,null);
        if (head == null && pointerPointer==null && previousPointer==null) {
            head = node;
            tail = node;
            node.pointerPointer=null;
            node.previousPointer=null;

        }else{
            node.previousPointer=null;
            node.pointerPointer=head;
            tail = head;
            head = node;
        }
    }

    public void insertNodeAtEnd(int data) {
        if (head == null) {
            insertNodeAtBeginning(data);
        } else {
            Node tempPointer = head;
            while (tempPointer.pointerPointer != null) {
                tempPointer = tempPointer.pointerPointer;
            }
            Node node = new Node(data,null,null);
            node.pointerPointer = null;
            node.previousPointer = tempPointer;
            tail=node;
            tempPointer.pointerPointer = node;
        }
    }

    public void insertNodeAtGivenPosition(int data, int position) {
        int length = 0;
        Node tempPointer = head;
        Node endPointer = null;
        if(position == 0){
            insertNodeAtBeginning(data);
        }else{
            while (tempPointer.pointerPointer!= null && length < position) {
                endPointer = tempPointer;
                tempPointer = tempPointer.pointerPointer;
                length++;
            }
            Node node = new Node(data,null,null);
            node.pointerPointer = tempPointer;
            node.previousPointer=endPointer;
            endPointer.pointerPointer = node;
            tempPointer.previousPointer=node;
        }
    }

    public void printLinkedList() {
        Node tempPointer = head;
        while (tempPointer != null) {
            System.out.println(tempPointer.dataItem);
            tempPointer = tempPointer.pointerPointer;
        }
    }

    public void printLinkedListInReverseOrder() {
        Node tempPointer = tail;
        while (tempPointer != null) {
            System.out.println(tempPointer.dataItem);
            tempPointer = tempPointer.previousPointer;
        }
    }

    public int findNode(int position) {
        Node tempPointer = head;
        int length = 0;
        while (tempPointer.pointerPointer != null && length != position) {
            tempPointer = tempPointer.pointerPointer;
            length++;
        }
        return tempPointer.dataItem;
    }

    public int getLinkedListSize(){
        int length = 0;
        Node start = head;
        while(start != null){
            start = start.pointerPointer;
            length++;
        }
        return  length;
    }

    public Node deleteNodeAtBeginning() {
        Node node = head;
        head = head.pointerPointer;
        head.previousPointer=null;
        return node;
    }

    public Node deleteNodeAtEnd() {
        Node startPointer = head.pointerPointer;
        Node endPointer = head;
        while (startPointer.pointerPointer != null) {
            startPointer = startPointer.pointerPointer;
            endPointer = endPointer.pointerPointer;
        }
        endPointer.pointerPointer = null;
        tail=endPointer;
        return startPointer;
    }

    public Node deleteNodeAtGivenPosition(int position) {
        int length = 0;
        Node startPointer = head.pointerPointer;
        Node endPointer = head;
        while (endPointer.pointerPointer != null && length< (position -1)) {
            startPointer = startPointer.pointerPointer;
            endPointer = endPointer.pointerPointer;
            length++;
        }
        Node temp = startPointer.pointerPointer;
        endPointer.pointerPointer  =  startPointer.pointerPointer;
        temp.previousPointer=startPointer.previousPointer;
        return startPointer;
    }
}
