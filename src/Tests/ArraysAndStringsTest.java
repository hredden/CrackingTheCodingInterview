/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;
import ctci.*;

/**
 *
 * @author Max
 */
public class ArraysAndStringsTest {
    
    public static void testIsUnique(String testString){
    
        ArraysAndStrings.isUnique(testString);
    
    }//end testIsUnique
    
    public static void testReverseString(String testString){
        /*Test reverse string*/
        ArraysAndStrings.reverseString(testString);
    }
    
    public static void testPermutations(String testString1, String testString2){
         /*Test permutations*/
        ArraysAndStrings.isPermutation(testString1, testString2);
    }
    
    
}
