/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import ctci.*;
/**
 *
 * @author Henry
 */
public class BinarySearchTreeTest {
    
    public static void test(){
        
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(25);
        bst.insert(16);
        bst.insert(32);
        bst.insert(12);
        bst.insert(43);
        bst.insert(1);
        bst.insert(27);
        
        bst.inOrder(bst.getRoot());
    }//end test
    
}
