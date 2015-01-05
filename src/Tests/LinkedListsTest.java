/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;
import ctci.*;
import java.util.*;

/**
 *
 * @author Max
 */
public class LinkedListsTest {
    
    public static void testDedupe(){
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
    }//end testDedupe
    
    public static void testNthToLast(int numItems, int n){
        /*Test nth to last*/
        //create test linked list
        LinkedList<String> list = new LinkedList<>();
        
        for(int i = numItems; i >= 0; i--){
            if (i ==0)
                list.add("Last");
            else if (i == numItems)
                list.add("First");
            else
                list.add(i + " to last");
        }
        
        for (String data : list)
            System.out.println(data + " ");
        
        LinkedLists.nthToLast(list, n);
    }//end testNthToLast
    
}
