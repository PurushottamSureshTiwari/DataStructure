package com.datastructure.circularlinkedlist;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CircularLinkedListTest {

    CircularLinkedList circularLinkedList ;

    @BeforeAll
    public void createInstance(){
         circularLinkedList = new CircularLinkedList();
    }


    @Test
    @Order(1)
    public void testInsertNodeAtBeginning(){
        circularLinkedList.insertNodeAtBeginning(20);
        circularLinkedList.insertNodeAtBeginning(10);
        System.out.println("First :"+circularLinkedList.getLinkedListSize());
        assert(circularLinkedList.getLinkedListSize() == 2);
    }

    @Test
    @Order(2)
    public void testInsertNodeAtEnd(){
        circularLinkedList.insertNodeAtEnd(40);
        circularLinkedList.insertNodeAtEnd(60);
        System.out.println("Second :"+circularLinkedList.getLinkedListSize());
        assert(circularLinkedList.getLinkedListSize() == 4);
    }

    @Test
    @Order(3)
    public void testInsertNodeAtGivenPosition(){
        circularLinkedList.insertNodeAtGivenPosition(30,2);
        circularLinkedList.insertNodeAtGivenPosition(50,5);
        System.out.println("Third :"+circularLinkedList.getLinkedListSize());
        assert(circularLinkedList.getLinkedListSize() == 6);
    }

    @Test
    @Order(4)
    public void testPrintLinkedList(){
        circularLinkedList.printLinkedList();
    }

    @Test
    @Order(5)
    public void testFindNode(){
        assert(circularLinkedList.findNode(3) == 30);
        assert(circularLinkedList.findNode(1) == 10);
        assert(circularLinkedList.findNode(circularLinkedList.getLinkedListSize()) == 60);
    }

    @Test
    @Order(6)
    public void testDeleteNodeAtBeginning(){
        assert(circularLinkedList.deleteNodeAtBeginning().getDataItem() == 10);
        assert(circularLinkedList.findNode(1) == 20);

    }


    @Test
    @Order(7)
    public void testDeleteNodeAtEnd(){
        assert(circularLinkedList.deleteNodeAtEnd().getDataItem() == 60);
        assert(circularLinkedList.findNode(circularLinkedList.getLinkedListSize()) == 50);
    }

    @Test
    @Order(8)
    public void testDeleteNodeAtGivenPosition(){
        assert(circularLinkedList.deleteNodeAtGivenPosition(2).getDataItem() == 40);
        assert(circularLinkedList.getLinkedListSize() == 3);
    }

    @Test
    @Order(9)
    public void testPrintLinkedListAgain(){
        circularLinkedList.printLinkedList();
    }
}
