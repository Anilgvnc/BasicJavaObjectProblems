
package lesson3;

import java.util.Scanner;

/**
 *
 * @author Anilgvnc
 */
public class Lesson3 {

    public static void main(String[] args) {
        
        //Exp 1
        System.out.println("****************Exp 1****************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it palindrome? \n" + "Enter a word here: " );
        String word = scanner.nextLine();
        
        boolean palindrome = false;
        
        int low = 0;
        int high = word.length() -1 ;
        
        while(low < high){
                if (word.charAt(low) == word.charAt(high)) {
                    palindrome = true;
                }
                else{
                    palindrome = false;
                    break;
                }
                low++;
                high--;
            }
        
            if (palindrome == true) {
                    System.out.println(word + " is palindrome.");    
                }
                else{
                    System.out.println(word + " is't palindrome.");
                }
        
        //Exp 2
        System.out.println("\n****************Exp 2****************");
        
        int i = 0; 
        int positive = 0;
        int negative = 0;
        double total = 0;
        
        System.out.print("Enter an integer, the inputs ends if it is 0: ");
        
        
        while(true){
            int num = scanner.nextInt();
            
            if (num != 0) {
                if (num >= 0) { 
                    positive++;
                }
                if (num < 0) {
                    negative++;
                }
                
                total += num;
             
            }
            else{
            break;
            }
            i++;
        }
        
        double average = total / i;
        
        System.out.println("The number of positives is: " + positive);
        System.out.println("The number of negatives is: " + negative);
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);
        
        
        //Exp 3
        System.out.println("\n****************Exp 3****************");
       
        double dividers = 0;
        double number = 1;
        
         while (number <= 10000){
            for (int j = 1; j < number; j++) {
                if (number % j == 0) {
                    dividers += j;
                }
            }
            
            if (dividers == number) {
                 System.out.println(number + " is perfect number.");
                }
            
            number++;
            dividers = 0;
        }
        
        //Exp 4
        System.out.println("\n****************Exp 4****************");
        
        Scanner s = new Scanner(System.in);
        double sum = 0;
        double x2 = 0;
        double n = 0;
        
        System.out.println("Enter ten numbers: ");
        
        while(n < 10){
            double nums = s.nextDouble();
            sum += nums;
            x2 += Math.pow(nums, 2);
            n++;
        }
                
        double sumSquare = (double) Math.pow(sum, 2);
        double mean = sum / n;
        
        double formula = ((x2 - (sumSquare / n)) / (n - 1) );
        
        double deviation = (double) Math.sqrt(formula);
                
        System.out.println("The mean is: " + mean);
        System.out.println("The standart deviation is: " + deviation);
        
    }
    
}
