/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exam;

import java.util.Scanner;

/**
 *
 * @author guven
 */
public class Exam {
    
    public static void passwordIsValid(String password){
        String userPassword = "ata1881";
        boolean letter = true;
        
        if ((password.length() - 1) < 6) {
            System.out.println("A password must have six characters.");
        }
        
        for (int i = 0; i < password.length() - 1; i++) {
            if (Character.isLetter(password.charAt(i))) {
            letter = true;
            continue;
        }
            else{
                letter = false;
                break;
            }
       
        }
        if (letter == false) {
            System.out.println("A password must contain at least one letter.");
        }
        
        if (password != userPassword) {
            System.out.println("Password is invalid.");
        }
        else{
            System.out.println("Password is valid.");
        }
    }

    public static void main(String[] args) {
        
        //Exam application
        int dice = (int) (1 + Math.random() * 12);
        System.out.println("First try: " + dice);
        
        if (dice == 12) {
            System.out.println("The player won 1000$.");
        }
        else if (dice == 11) {
            System.out.println("The player won 500$.");
        }
        else if (dice == 10) {
            System.out.println("The player won 250$.");
        }
        else{
            int dice2;
            dice2 = (int) (1 + Math.random() * 12);
            System.out.println("Second try: " + dice2);
            if (dice2 == 12) {
            System.out.println("The player won 500$.");
            }
            else if (dice2 == 11) {
            System.out.println("The player won 250$.");
            }
            else if (dice2 == 10) {
            System.out.println("The player won 100$.");
            }
            else{
                System.out.println("You lost.");
            }
        
        }
        
    }
}
