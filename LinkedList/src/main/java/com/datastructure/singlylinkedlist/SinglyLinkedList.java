package com.datastructure.singlylinkedlist;

import java.util.Hashtable;

public class SinglyLinkedList {
    Node head;
    int length;

    public SinglyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
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
        System.out.println("---------------------------------");
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
        while (endPointer.pointer != null && length < (position - 1)) {
            startPointer = startPointer.pointer;
            endPointer = endPointer.pointer;
            length++;
        }
        endPointer.pointer = startPointer.pointer;
        return startPointer;
    }

    public int nknode(int k) {
        if (k <= 0 || head == null)
            return 0;

        int len = getLinkedListSize();

        Node fractionalNode = null;

        // Traverse the given list
        int i = 0;
        for (Node temp = head; temp != null;
             temp = temp.pointer) {

            // For every k nodes, we move
            // fractionalNode one step ahead.
            if (i % k == 0) {

                // First time we see a multiple of k
                if (fractionalNode == null)
                    fractionalNode = head;
                else
                    fractionalNode = fractionalNode.pointer;
            }
            i++;
        }
        return fractionalNode != null ? fractionalNode.dataItem : 0;

    }

    public void reorderList(Node start) {

        if (head == null) return;
        Hashtable<Integer, Integer> table = new Hashtable<>();

        if (start == null) start = head;

        int length = 1;
        Node end = start, previous = null;
        while (end.pointer != null) {
            previous = end;
            end = end.pointer;
            length++;
        }

        if (length <= 2) return;
        Node temp = start.pointer;
        start.pointer = end;
        end.pointer = temp;
        previous.pointer = null;
        start = start.pointer.pointer;
        length = length - 2;
        if (start.pointer != null && length > 2) {
            reorderList(start);
        } else {
            return;
        }

    }

    public void sortList() {
        if (head == null) return;

        Node current = head, index = current.pointer;

        while (current != null) {
            index = current.pointer;
            while (index != null) {
                if (current.dataItem > index.dataItem) {
                    int temp = current.getDataItem();
                    current.dataItem = index.dataItem;
                    index.dataItem = temp;
                }
                index = index.pointer;
            }
            printLinkedList();
            current = current.pointer;

        }
    }

    public Node partition(Node start, int x) {
        if (head == null) return null;

        if (start == null) start = head;

        Node lastSmallest = null, temp = null, previousNode = null;
        while (start != null) {
            if (start.dataItem < x) {
                if (start == head) {
                    lastSmallest = start;
                } else {
                    if (lastSmallest == null) {
                        Node current = head;
                        previousNode.pointer = start.pointer;
                        start.pointer = current;
                        head = start;

                        lastSmallest = start;

                    } else {

                        if (lastSmallest.pointer != start) {
                            Node current = start;
                            temp = lastSmallest.pointer;
                            lastSmallest.pointer = start;
                            previousNode.pointer = start.pointer;
                            start.pointer = temp;
                            lastSmallest = start;
                        }
                    }
                }

            }
            previousNode = start;
            start = start.pointer;
        }
        return head;
    }

    public Node deleteDuplicatesUnsorted() {

        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;

        /* Pick elements one by one */
        while (ptr1 != null && ptr1.pointer != null) {
            ptr2 = ptr1;

            /* Compare the picked element with rest
                of the elements */
            while (ptr2.pointer != null) {

                /* If duplicate then delete it */
                if (ptr1.dataItem == ptr2.pointer.dataItem) {

                    /* sequence of steps is important here
                     */
                    ptr2.pointer = ptr2.pointer.pointer;
                    System.gc();
                }
                else /* This is tricky */ {
                    ptr2 = ptr2.pointer;
                }
            }
            ptr1 = ptr1.pointer;
        }
  return head;
    }

    public static Node merge(Node[] lists) {
        Node result = null;
        for(int i = 1 ; i < lists.length ; i++){
            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
            if(result == null){

                result = merge(lists[i-1],lists[i],singlyLinkedList);
            }else{
                result =  merge(result,lists[i],singlyLinkedList);
            }
        }
        return result;
    }

    public static Node merge(Node head1, Node head2,  SinglyLinkedList singlyLinkedList){

        while(head1 != null && head2 != null){
            if(head1.dataItem == head2.dataItem){
                if(singlyLinkedList.getHead() == null){
                    singlyLinkedList.insertNodeAtBeginning(head1.dataItem);
                    singlyLinkedList.insertNodeAtEnd(head2.dataItem);

                }else{
                    singlyLinkedList.insertNodeAtEnd(head1.dataItem);
                    singlyLinkedList.insertNodeAtEnd(head2.dataItem);
                }
                head2 = head2.pointer;
                head1 = head1.pointer;

            }
            else if(head1.dataItem > head2.dataItem){
                if(singlyLinkedList.getHead() == null){
                    singlyLinkedList.insertNodeAtBeginning(head2.dataItem);

                }else{

                    singlyLinkedList.insertNodeAtEnd(head2.dataItem);
                }
                head2 = head2.pointer;
            }else{
                if(singlyLinkedList.getHead() == null){
                    singlyLinkedList.insertNodeAtBeginning(head1.dataItem);


                }else{
                    singlyLinkedList.insertNodeAtEnd(head1.dataItem);

                }
                head1 = head1.pointer;
            }
        }

        while(head1 != null){
            singlyLinkedList.insertNodeAtEnd(head1.dataItem);
            head1 = head1.pointer;
        }
        while(head2 != null){
            singlyLinkedList.insertNodeAtEnd(head2.dataItem);
            head2 = head2.pointer;
        }
        return singlyLinkedList.getHead();
    }
}

