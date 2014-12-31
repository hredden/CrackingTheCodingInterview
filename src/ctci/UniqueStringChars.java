/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ctci;

/**
 *
 * @author Max
 * Determines if a string is composed of unique characters
 */


public class UniqueStringChars {
    
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
    
}//end class
