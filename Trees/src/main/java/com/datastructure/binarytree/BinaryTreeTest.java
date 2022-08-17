package com.datastructure.binarytree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNodeToBinaryTree(1);
        binaryTree.addNodeToBinaryTree(2);
        binaryTree.addNodeToBinaryTree(3);
        binaryTree.addNodeToBinaryTree(4);
        binaryTree.addNodeToBinaryTree(5);
        binaryTree.addNodeToBinaryTree(6);
        binaryTree.addNodeToBinaryTree(7);



       /* System.out.println("PreOrder Traversal");
        binaryTree.preOrderTraversal(binaryTree.getRootnode());
        System.out.println("InOrder  Traversal");
        binaryTree.inOrderTraversal(binaryTree.getRootnode());
        System.out.println("PostOrder  Traversal");
        binaryTree.postOrderTraversal(binaryTree.getRootnode());
        System.out.println("Level  Traversal");
        binaryTree.levelOrderTraversal(binaryTree.getRootnode());

        System.out.println("dataItemue :"+binaryTree.findNode(8, binaryTree.getRootnode()));

        binaryTree.deleteNode(8, binaryTree.getRootnode());
        binaryTree.preOrderTraversal(binaryTree.getRootnode());

        System.out.println("Height :"+binaryTree.treeHeight());*/
        //System.out.println(binaryTree.diameter());
        System.out.println(binaryTree.maxvalueAtLevel(binaryTree.getRootnode()));


    }
}
