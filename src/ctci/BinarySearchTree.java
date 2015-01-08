/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci;

/**
 *
 * @author Henry
 */
public class BinarySearchTree<E extends Comparable<E>> {
    
    private class Node{
        private E data;
        private Node leftNode;
        private Node rightNode;
        
        public Node (E x){
        
            data = x;
            leftNode = this.rightNode = null;
        
        }//end node constructor
        
    }//end node class
    
    private Node root;
    
    public BinarySearchTree(){ //constructor
        root = null;
    }
    
    public void insert(E x){
        Node p, q;
        Node newNode = new Node(x);
        
        if(root == null){
            root = newNode;
            return;
        }
        
        p = root;
        q = null;
        
        while(p != null){
            
            q = p;
            if(x.compareTo(p.data) < 0)
                p = p.leftNode;
            else
                p = p.rightNode;
            
        }//end while
        
        if(x.compareTo(q.data) < 0)
            q.leftNode = newNode;
        else
            q.rightNode = newNode;
        
    }//end insert
    
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.leftNode);
            System.out.print(root.data + " ");
            inOrder(root.rightNode);
                    
        }
    }
    
    public Node getRoot(){
        return this.root;
    }
    
}//end class
