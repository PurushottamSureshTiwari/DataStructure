package com.datastructure.doublylinkedlist;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DoublyLinkedList {
    DoublyLinkedList doublyLinkedList;


    @BeforeAll
    public void createInstance(){
        doublyLinkedList = new DoublyLinkedList();
    }


    @Test
    @Order(1)
    public void testInsertNodeAtBeginning(){        
        doublyLinkedList.insertNodeAtBeginning(20);
        doublyLinkedList.insertNodeAtBeginning(10);
        System.out.println("First :"+doublyLinkedList.getLinkedListSize());
        assert(doublyLinkedList.getLinkedListSize() == 2);
    }

    @Test
    @Order(2)
    public void testInsertNodeAtEnd(){
        doublyLinkedList.insertNodeAtEnd(40);
        doublyLinkedList.insertNodeAtEnd(60);
        System.out.println("Second :"+doublyLinkedList.getLinkedListSize());
        assert(doublyLinkedList.getLinkedListSize() == 4);
    }

    private int getLinkedListSize() {
    }

    private void insertNodeAtEnd(int i) {
    }

    @Test
    @Order(3)
    public void testInsertNodeAtGivenPosition(){
        doublyLinkedList.insertNodeAtGivenPosition(30,2);
        doublyLinkedList.insertNodeAtGivenPosition(50,5);
        System.out.println("Third :"+doublyLinkedList.getLinkedListSize());
        assert(doublyLinkedList.getLinkedListSize() == 6);
    }

    private void insertNodeAtGivenPosition(int i, int i1) {
    }

    @Test
    @Order(4)
    public void testPrintLinkedList(){
        doublyLinkedList.printLinkedList();
    }

    private void printLinkedList() {
    }

    @Test
    @Order(5)
    public void testFindNode(){
        assert(doublyLinkedList.findNode(3) == 40);
        assert(doublyLinkedList.findNode(0) == 10);
        assert(doublyLinkedList.findNode(doublyLinkedList.getLinkedListSize() -1) == 60);
    }

    private int findNode(int i) {
    }

    @Test
    @Order(6)
    public void testDeleteNodeAtBeginning(){
        assert(doublyLinkedList.deleteNodeAtBeginning().getDataItem() == 10);
        assert(doublyLinkedList.findNode(0) == 20);

    }

    private Node deleteNodeAtBeginning() {
    }


    @Test
    @Order(7)
    public void testDeleteNodeAtEnd(){
        assert(doublyLinkedList.deleteNodeAtEnd().getDataItem() == 60);
        assert(doublyLinkedList.findNode(doublyLinkedList.getLinkedListSize() -1) == 50);
    }

    private Node deleteNodeAtEnd() {
    }

    @Test
    @Order(8)
    public void testDeleteNodeAtGivenPosition(){
        assert(doublyLinkedList.deleteNodeAtGivenPosition(2).getDataItem() == 40);
        assert(doublyLinkedList.getLinkedListSize() == 3);
    }

    private Node deleteNodeAtGivenPosition(int i) {
    }

    @Test
    @Order(9)
    public void testPrintLinkedListAgain(){
        doublyLinkedList.printLinkedList();
    }
}
