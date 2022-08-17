package com.datastructure.linkedlist;


import com.datastructure.singlylinkedlist.Node;
import com.datastructure.singlylinkedlist.SinglyLinkedList;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SinglyLinkedListTest {
     SinglyLinkedList singlyLinkedList;


     @BeforeAll
     public void createInstance(){
         singlyLinkedList = new SinglyLinkedList();
     }


    @Test
    @Order(1)
    public void testInsertNodeAtBeginning(){
       singlyLinkedList.insertNodeAtBeginning(20);
       singlyLinkedList.insertNodeAtBeginning(10);
       System.out.println("First :"+singlyLinkedList.getLinkedListSize());
       assert(singlyLinkedList.getLinkedListSize() == 2);
    }

    @Test
    @Order(2)
    public void testInsertNodeAtEnd(){
         singlyLinkedList.insertNodeAtEnd(40);
         singlyLinkedList.insertNodeAtEnd(60);
        System.out.println("Second :"+singlyLinkedList.getLinkedListSize());
        assert(singlyLinkedList.getLinkedListSize() == 4);
    }

    @Test
    @Order(3)
    public void testInsertNodeAtGivenPosition(){
         singlyLinkedList.insertNodeAtGivenPosition(30,2);
        singlyLinkedList.insertNodeAtGivenPosition(50,5);
        System.out.println("Third :"+singlyLinkedList.getLinkedListSize());
        assert(singlyLinkedList.getLinkedListSize() == 6);
    }

    @Test
    @Order(4)
    public void testPrintLinkedList(){
         singlyLinkedList.printLinkedList();
    }

    @Test
    @Order(5)
    public void testFindNode(){
        assert(singlyLinkedList.findNode(3) == 40);
        assert(singlyLinkedList.findNode(0) == 10);
        assert(singlyLinkedList.findNode(singlyLinkedList.getLinkedListSize() -1) == 60);
    }

    @Test
    @Order(6)
    public void testDeleteNodeAtBeginning(){
         assert(singlyLinkedList.deleteNodeAtBeginning().getDataItem() == 10);
         assert(singlyLinkedList.findNode(0) == 20);

     }


    @Test
    @Order(7)
    public void testDeleteNodeAtEnd(){
         assert(singlyLinkedList.deleteNodeAtEnd().getDataItem() == 60);
        assert(singlyLinkedList.findNode(singlyLinkedList.getLinkedListSize() -1) == 50);
    }

    @Test
    @Order(8)
    public void testDeleteNodeAtGivenPosition(){
         assert(singlyLinkedList.deleteNodeAtGivenPosition(2).getDataItem() == 40);
        assert(singlyLinkedList.getLinkedListSize() == 3);
    }

    @Test
    @Order(9)
    public void testPrintLinkedListAgain(){
        singlyLinkedList.printLinkedList();
    }

    @Test
    @Order(10)
    public void testnknode(){

         singlyLinkedList.printLinkedList();
    }
}

