/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ctci;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author Max
 * Practice for arrays and strings
 */
public class ArraysAndStrings {
    
    /*Reverses a string*/
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
    
    public static void reverseStringBuilder(String str){
        
        StringBuilder s = new StringBuilder();
        
        for(int i = str.length()-1; i >= 0; i--){
        
            s.append(str.charAt(i));
        }//end for
        
        System.out.println(s);
        
    }//end reverseStringBuilder
    
    /*Determines if a string is composed of only unique characters*/
    public static boolean isUnique(String str){
        
        if(str.length() <= 1)
            return true;
        
        if(str.length() > 256) //only 256 unique ascii chars
            return false;
        
        boolean[] chars = new boolean[256];
        
        for (int i = 0; i< str.length(); i++){
            int val = str.charAt(i);
            
            if (chars[val]){
               System.out.println("The String " + str + " is not unique.");
               System.out.println("The character " +(char)val +" is repeated");
                  
               return false;
            }
            else{
                if(val != 32)//Exclude space
                    chars[val] = true;
            }
        }//end for
        
        System.out.println("The string is unique");
        return true;
        
        
    }//end isUnique
    
    /*Checks if one string is a permutation of another*/
    public static boolean isPermutation(String s1, String s2){
        
        if (s1.length() != s2.length()){
            System.out.println(s2 + " is not a permutation of " + s1);
            return false;
        }
        
        char[] firstString = s1.toCharArray();
        char[] secondString = s2.toCharArray();
        
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        
        if(Arrays.equals(firstString, secondString)){
            System.out.println(s2 + " is a permutation of " + s1);
        }
        
        return true;
        
    }//end isPermutation
    
}//end ArraysAndStrings
