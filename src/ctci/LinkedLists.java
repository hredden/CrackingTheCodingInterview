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
    
    public static <T> void deDupe (LinkedList<T> list){
        
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
    
}
