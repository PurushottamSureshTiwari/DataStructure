package com.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    int diameter = 0;
    BinaryTreeNode rootnode;

    public BinaryTreeNode getRootnode() {
        return rootnode;
    }



    public void addNodeToBinaryTree(int data){
          if(rootnode != null){

             insert(rootnode,data);

          }else{
              rootnode = new BinaryTreeNode(data,null, null);
          }
    }

    private void insert(BinaryTreeNode node, int data){
       if(node.data > data){
          if(node.left == null){
              node.left = new BinaryTreeNode(data);
          }else{
              insert(node.left,data);
          }
       }else{
           if(node.right == null){
               node.right = new BinaryTreeNode(data);
           }else{
               insert(node.right,data);
           }
       }
    }

    public void preOrderTraversal(BinaryTreeNode root){

      if(root != null) {
          //System.out.println(root.getData());
          preOrderTraversal(root.left);
          preOrderTraversal(root.right);
      }

    }

    public void inOrderTraversal(BinaryTreeNode root){

       if(root != null) {
           inOrderTraversal(root.left);
          // System.out.println(root.getData());
           inOrderTraversal(root.right);
       }
    }

    public void postOrderTraversal(BinaryTreeNode root){

        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            ///System.out.println(root.getData());
        }
    }


    public void levelOrderTraversal(BinaryTreeNode root){


        if(rootnode == null)return ;

        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode ;

        if(root == null)root = rootnode;

        Queue<BinaryTreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        while(!treeNodes.isEmpty()){
            BinaryTreeNode node = treeNodes.remove();
           // System.out.println(node.getData());
            if(node.left != null)treeNodes.add(node.left);
            if(node.right != null)treeNodes.add(node.right);
        }


    }


    public BinaryTreeNode findNode(int data, BinaryTreeNode root){

        if(root == null)return null;
        if(root.getData() == data) return root;
        if(root.getData() > data)findNode(data, root.left);
        if(root.getData() < data)findNode(data, root.right);
        return root;
    }

    public BinaryTreeNode deleteNode(int data, BinaryTreeNode root){

        if(root != null && root.getData() == data){
            root = null;return root;
        }

        if(root.left != null)deleteNode(data,root.left);
        if(root.right != null)deleteNode(data,root.right);

       return null;
    }

    public int depthOfNode(BinaryTreeNode node){
        return 0;
    }

    public int heightOfNode(BinaryTreeNode node){
        return 0;
    }
    public int treeDepth(BinaryTreeNode node){
        return 0;
    }

    public int treeHeight(){
        int height = 0;

        if(rootnode == null)return 0;

        Queue<BinaryTreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(rootnode);
        while(!treeNodes.isEmpty()){
            BinaryTreeNode node = treeNodes.remove();
           height++;
            if(node.left != null)treeNodes.add(node.left);
            if(node.right != null)treeNodes.add(node.right);
        }

        return height;
    }

    public int diameter(){
        int diameter = 0;
        diameter = longestPath(rootnode);
        return diameter;
    }
    public  int longestPath(BinaryTreeNode root){
        if(root == null) return 0;
        // recursively find the longest path in
        // both left child and right child
        int leftPath = longestPath(root.left);
        System.out.println("leftPath :"+leftPath);
        int rightPath = longestPath(root.right);
        System.out.println("rightPath :"+rightPath);

        // update the diameter if left_path plus right_path is larger
        diameter = Math.max(diameter, leftPath + rightPath);
        System.out.println(diameter);

        // return the longest one between left_path and right_path;
        // remember to add 1 for the path connecting the node and its parent
        return Math.max(leftPath, rightPath) +1;

    }

    public  int maxvalueAtLevel(BinaryTreeNode rootnode){
        int sum = 0; int maxsUM = 0;
        if(rootnode == null) return 0;

        Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();

        binaryTreeNodes.offer(rootnode);

        while(binaryTreeNodes.isEmpty() == false){
            int size = binaryTreeNodes.size();
            for(int  i = 0 ; i < size ; i++){
                BinaryTreeNode n = binaryTreeNodes.poll();
                sum+=n.getData();
                if (n.left != null) binaryTreeNodes.offer(n.left);
                if (n.right != null) binaryTreeNodes.offer(n.right);
            }
            if(sum > maxsUM)maxsUM = sum;

        }

        return  maxsUM;

    }

    public void printAncestor(int data){
      /*  Queue<BinaryTreeNode> binaryTreeNodes = new LinkedList<>();

        binaryTreeNodes.offer(rootnode);

        while(binaryTreeNodes.isEmpty() == false){
            int size = binaryTreeNodes.size();
            for(int  i = 0 ; i < size ; i++){
                BinaryTreeNode n = binaryTreeNodes.poll();
                sum+=n.getData();
                if (n.left != null) binaryTreeNodes.offer(n.left);
                if (n.right != null) binaryTreeNodes.offer(n.right);
            }
            if(sum > maxsUM)maxsUM = sum;

        }*/
    }

}

