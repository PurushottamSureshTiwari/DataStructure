package com.datastructure.linkedlist;

import com.datastructure.singlylinkedlist.Node;
import com.datastructure.singlylinkedlist.SinglyLinkedList;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestLinkedList {
    SinglyLinkedList singlyLinkedList;
    SinglyLinkedList singlyLinkedList1;
    SinglyLinkedList singlyLinkedList2;
    @BeforeAll
    public void createInstance(){
         singlyLinkedList = new SinglyLinkedList();
         singlyLinkedList1 = new SinglyLinkedList();
         singlyLinkedList2 = new SinglyLinkedList();
    }


    @Test
    @Order(1)
    public void testnknode(){

       // 87 78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89
        singlyLinkedList.insertNodeAtBeginning(1);
        singlyLinkedList.insertNodeAtEnd(7);
        singlyLinkedList.insertNodeAtEnd(9);
        singlyLinkedList.insertNodeAtEnd(3);
        singlyLinkedList.insertNodeAtEnd(5);
        singlyLinkedList.nknode(3);
        singlyLinkedList.setHead(null);

    }

    @Test
    @Order(2)
    public void testReorder(){

        // 87 78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89
        singlyLinkedList.insertNodeAtBeginning(1);
        singlyLinkedList.insertNodeAtEnd(2);
        singlyLinkedList.insertNodeAtEnd(3);
        singlyLinkedList.insertNodeAtEnd(4);
        singlyLinkedList.insertNodeAtEnd(5);
        singlyLinkedList.insertNodeAtEnd(6);
        singlyLinkedList.insertNodeAtEnd(7);
        singlyLinkedList.insertNodeAtEnd(8);
        singlyLinkedList.insertNodeAtEnd(9);
        singlyLinkedList.insertNodeAtEnd(10);
        singlyLinkedList.insertNodeAtEnd(11);
        singlyLinkedList.reorderList(null);
        singlyLinkedList.setHead(null);
       // singlyLinkedList.printLinkedList();
    }

    @Test
    @Order(3)
    public void testSort(){

        // 87 78 16 94 36 87 93 50 22 63 28 91 60 64 27 41 27 73 37 12 69 68 30 83 31 63 24 68 36 30 3 23 59 70 68 94 57 12 43 30 74 22 20 85 38 99 25 16 71 14 27 92 81 57 74 63 71 97 82 6 26 85 28 37 6 47 30 14 58 25 96 83 46 15 68 35 65 44 51 88 9 77 79 89
        singlyLinkedList.insertNodeAtBeginning(1);
        singlyLinkedList.insertNodeAtEnd(4);
        singlyLinkedList.insertNodeAtEnd(3);
        singlyLinkedList.insertNodeAtEnd(2);
        singlyLinkedList.insertNodeAtEnd(5);
        singlyLinkedList.insertNodeAtEnd(2);

        singlyLinkedList.sortList();
        singlyLinkedList.printLinkedList();
        singlyLinkedList.setHead(null);
    }

    @Test
    @Order(4)
    public void testParition(){


        singlyLinkedList.insertNodeAtBeginning(1);
        singlyLinkedList.insertNodeAtEnd(2);
        singlyLinkedList.insertNodeAtEnd(3);
        /*singlyLinkedList.insertNodeAtEnd(2);
        singlyLinkedList.insertNodeAtEnd(5);
        singlyLinkedList.insertNodeAtEnd(2);*/

        singlyLinkedList.partition(null, 4);
        singlyLinkedList.printLinkedList();
        singlyLinkedList.setHead(null);
    }

    @Test
    @Order(5)
    public void testdeleteDuplicatesUnsorted(){
        singlyLinkedList.insertNodeAtBeginning(1);
        singlyLinkedList.insertNodeAtEnd(2);
        singlyLinkedList.insertNodeAtEnd(3);
        singlyLinkedList.insertNodeAtEnd(2);
        //singlyLinkedList.insertNodeAtEnd(5);
        //singlyLinkedList.insertNodeAtEnd(2);

        singlyLinkedList.deleteDuplicatesUnsorted();
        singlyLinkedList.printLinkedList();
        singlyLinkedList.setHead(null);
    }

    @Test
    @Order(5)
    public void testmerge(){
        singlyLinkedList.insertNodeAtBeginning(1);
        singlyLinkedList.insertNodeAtEnd(4);
        singlyLinkedList.insertNodeAtEnd(5);

        singlyLinkedList1.insertNodeAtBeginning(1);
        singlyLinkedList1.insertNodeAtEnd(3);
        singlyLinkedList1.insertNodeAtEnd(4);

        singlyLinkedList2.insertNodeAtBeginning(2);
        singlyLinkedList2.insertNodeAtEnd(6);
        Node[] lists = new Node[3];
        lists[0] = singlyLinkedList.getHead();
        lists[1] = singlyLinkedList1.getHead();
        lists[2] = singlyLinkedList2.getHead();

        Node node = singlyLinkedList.merge(lists);
        System.out.println(node);
    }

}
