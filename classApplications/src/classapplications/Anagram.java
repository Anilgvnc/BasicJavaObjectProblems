/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classapplications;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author guven
 */
class Anagram {
    
    boolean isAnagram = true;
    
    public void setLetters(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 letters here: ");
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        
    
        int[] array1 = new int[input1.length()];
        int[] array2 = new int[input2.length()];
        
        for (int i = 0; i < input1.length(); i++) {
            array1[i] = input1.charAt(i);
        }
        for (int i = 0; i < input2.length(); i++) {
            array2[i] = input2.charAt(i);
        }
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for (int i = 0; i < input1.length(); i++) {
            isAnagram = array1[i] == array2[i];
        }
        
        
    }
    
    public void isAnagram(){
        if (isAnagram) {
            System.out.println("It's anagram.");
        }
        else{
            System.out.println("It isn't anagram.");
        }
    }
}
