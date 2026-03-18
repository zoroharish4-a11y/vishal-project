/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tree;

/**
 *
 * @author Akash
 */
class Node{
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
   class binarytree {
       Node root;
       public binarytree(){
           this.root=null;
       }
       public void inOrder(Node node){
           if (node!= null){
               inOrder(node.left);
               System.out.print(node.data+"");
               inOrder(node.right);
           }
           }
           public void preOrder(Node node){
               if (node!=null){
                   System.out.print(node.data+"");
                   preOrder(node.left);
                   preOrder(node.right);
               }
           }
           public void postOrder(Node node){
               if (node!=null){
                   postOrder(node.left);
                   postOrder(node.right);
                   System.out.print(node.data+"");
               }
           }
       }

public class Tree {

    public static void main(String[] args) {
        binarytree tree=new binarytree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
          tree.root.right=new Node(3);
          tree.root.left.left=new Node(4);
          tree.root.left.right=new Node(5);
          System.out.println("inorder traversal:");
          tree.inOrder(tree.root);
          System.out.println("\nPreOrdertraversal:");
          tree.preOrder(tree.root);
          System.out.println("\nPostorder traversal:");
          tree.postOrder(tree.root);
    }
}
