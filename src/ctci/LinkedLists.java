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
 */
public class LinkedLists {
    
    public static void deDupe (LinkedList<?> list){
        
        ListIterator i = list.listIterator();
        Hashtable table = new Hashtable();
        
        while(i.hasNext()){
            if(table.containsKey(i.next())){
                i.remove();
            }
            else{
                i.previous();
                table.put(i.next(), true);
            }

        }//end while       
    }//end deDupe
    
    public static void nthToLast (LinkedList<?> list, int n){
        
        ListIterator p1 = list.listIterator();
        ListIterator p2 = list.listIterator();
        
        //Move p2 n elements into list
        for(int i = 0; i < n; i++){
            if(p2 == null){
                System.out.println("This element doesn't exist");
                return;
            }
            p2.next();
        }
        
        //Move both pointers till p2 hits end of list
        while(p2.hasNext()){
            p1.next();
            p2.next();
        }
        
        //Print p1 which is nth to last element
        p1.previous();
        System.out.println(p1.next());
            
        
    }//end 
    
}
