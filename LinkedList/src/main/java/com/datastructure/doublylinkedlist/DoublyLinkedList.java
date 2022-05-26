package com.datastructure.doublylinkedlist;

public class DoublyLinkedList {
    
    Node head,tail;
    Node nextPointer;
    Node previousPointer;
    int length;

    public DoublyLinkedList() {
        this.head = null;
        this.previousPointer=null;
        this.nextPointer=null;
        this.length = 0;
    }

    public void insertNodeAtBeginning(int data) {
        Node node = new Node(data,null,null);
        if (head == null && nextPointer==null && previousPointer==null) {
            head = node;
            tail = node;
            node.nextPointer=null;
            node.previousPointer=null;

        }else{
            node.previousPointer=null;
            node.nextPointer=head;
            tail = head;
            head = node;
        }
    }

    public void insertNodeAtEnd(int data) {
        if (head == null) {
            insertNodeAtBeginning(data);
        } else {
            Node tempPointer = head;
            while (tempPointer.nextPointer != null) {
                tempPointer = tempPointer.nextPointer;
            }
            Node node = new Node(data,null,null);
            node.nextPointer = null;
            node.previousPointer = tempPointer;
            tail=node;
            tempPointer.nextPointer = node;
        }
    }

    public void insertNodeAtGivenPosition(int data, int position) {
        int length = 0;
        Node tempPointer = head;
        Node endPointer = null;
        if(position == 0){
            insertNodeAtBeginning(data);
        }else{
            while (tempPointer.nextPointer!= null && length < position) {
                endPointer = tempPointer;
                tempPointer = tempPointer.nextPointer;
                length++;
            }
            Node node = new Node(data,null,null);
            node.nextPointer = tempPointer;
            node.previousPointer=endPointer;
            endPointer.nextPointer = node;
            tempPointer.previousPointer=node;
        }
    }

    public void printLinkedList() {
        Node tempPointer = head;
        while (tempPointer != null) {
            System.out.println(tempPointer.dataItem);
            tempPointer = tempPointer.nextPointer;
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
        while (tempPointer.nextPointer != null && length != position) {
            tempPointer = tempPointer.nextPointer;
            length++;
        }
        return tempPointer.dataItem;
    }

    public int getLinkedListSize(){
        int length = 0;
        Node start = head;
        while(start != null){
            start = start.nextPointer;
            length++;
        }
        return  length;
    }

    public Node deleteNodeAtBeginning() {
        Node node = head;
        head = head.nextPointer;
        head.previousPointer=null;
        return node;
    }

    public Node deleteNodeAtEnd() {
        Node startPointer = head.nextPointer;
        Node endPointer = head;
        while (startPointer.nextPointer != null) {
            startPointer = startPointer.nextPointer;
            endPointer = endPointer.nextPointer;
        }
        endPointer.nextPointer = null;
        tail=endPointer;
        return startPointer;
    }

    public Node deleteNodeAtGivenPosition(int position) {
        int length = 0;
        Node startPointer = head.nextPointer;
        Node endPointer = head;
        while (endPointer.nextPointer != null && length< (position -1)) {
            startPointer = startPointer.nextPointer;
            endPointer = endPointer.nextPointer;
            length++;
        }
        Node temp = startPointer.nextPointer;
        endPointer.nextPointer  =  startPointer.nextPointer;
        temp.previousPointer=startPointer.previousPointer;
        return startPointer;
    }
}
