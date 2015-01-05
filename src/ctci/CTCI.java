/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ctci;
import java.util.*;

/**
 *
 * @author Max
 * Used for testing practice questions
 */
public class CTCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*test unique chars in string*/
        //ArraysAndStrings.isUnique("A Dogg went");
        
        /*Test reverse string*/
        //ArraysAndStrings.reverseString("Not a palindrome");
        
        /*Test permutations*/
        //ArraysAndStrings.isPermutation("Permutation", "noitatumre");
        
        /*Test deDupe*/
        //create linked list with dupes
        LinkedList<String> list = new LinkedList<String>();
        
        for(int i = 0; i < 10; i++)
            list.add("Number " + i);
        for(int j = 0; j < 5; j++)
            list.add("Number " + j);
        
        //print test list
        for (String num : list)
            System.out.print(num + " ");
        
        //Call deDupe and reprint list
        LinkedLists.deDupe(list);
        System.out.println("List after removing dupes: " + '\n');
        for (String num : list)
            System.out.print(num + " ");
        
        
        
    }
    
}
