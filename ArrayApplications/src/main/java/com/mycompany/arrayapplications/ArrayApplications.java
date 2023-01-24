/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayapplications;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author guven
 */
public class ArrayApplications {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Reverse an array
        int firstInput[]  = new int [6]; 
        System.out.println("Enter six numbers: ");
        for (int i = 0; i < 6; i++) {
            int input = scan.nextInt();
            firstInput[i] = input;
        }
        System.out.println("Reversed numbers: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(firstInput[i]);
        }
        
        //Print distinct numbers
        int distinctNum[] = new int [10];
        
        for (int j = 0; j < 10; j++) {
            int sInput = scan.nextInt();
            sInput = distinctNum[j];
        }
        
        Arrays.sort(distinctNum);
        
        for (int k = 0; k < 10; k++) {
            System.out.println("Sorted arrays: " + distinctNum[k]);
        }
        
        //Statistics: compute deviation
        double thirdInput[] = new double[10];
        double tInput;
        System.out.print("Enter 10 numbers here: ");
        for (int l = 0; l < 10; l++) {
            tInput = scan.nextDouble();
            tInput = thirdInput[l];
        }
        
        System.out.println("The mean is: " + mean(thirdInput));
        System.out.println("The standart deviation is: " + deviation(thirdInput));
    }
    
    public static double mean(double[] x){
        x = new double[10]; 
        double sum = 0;
        double n = 10;
        for (int i = 0; i < 10; i++) {
            sum += x[i];
        }
        return sum / n;
    }
    
    public static double deviation(double[] x){
        x = new double[10];
        double devSum = 0;
        int n = 10;
        for (int i = 0; i < 10; i++) {
            devSum += Math.pow((x[i] - mean(x)), 2);
        }
        double formula = devSum / (n - 1);
        double result = Math.sqrt(formula);
        return result;
    }
}
