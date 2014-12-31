/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ctci;

/**
 *
 * @author Max
 * Reverses a string
 */
import java.util.*;
public class ReverseString {
    
    public static void reverseString(String str){
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }//end reverseString
    
}
