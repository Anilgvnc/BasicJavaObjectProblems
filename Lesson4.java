package lesson4;

import java.util.Scanner;

/**
 *
 * @author Anilgvnc
 */

public class Lesson4 {
    
    public static int countLetters(String s){
        
        int numberOfLetters = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))  ) {   
                numberOfLetters++;
            }
        }
        return numberOfLetters;
    }
    
    public static int reverse(int number){
        
        int firstDigit = number / 100;
        int secondDigit = (number / 10) - (firstDigit * 10);
        int thirdDigit = number - ((firstDigit * 100) + (secondDigit * 10));
        
        int reversedNumber = ((thirdDigit * 100) + (secondDigit * 10) + (firstDigit) );
        
        return reversedNumber;
        
    }
    
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
    
    public static double m(int i){
        
        double numerator;
        double denominator;
        double divide;
        double sum = 0;
        
        for (int j = 1; j <= i; j++) {
            numerator = Math.pow(-1, j + 1);
            denominator = (2 * j) - 1 ;
            divide = numerator / denominator;
            sum += divide;
        }
        
        double result = 4 * (sum);
        
        return result;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //exp 1
        System.out.print("Enter a letter here: ");
        String letter = scanner.nextLine();
        System.out.println(countLetters(letter));
        
        int count = 0;
        
        // exp 2
        while(true){
            
            System.out.println("Enter 3 digit number here: ");
            int num = scanner.nextInt();
        
            if (num > 999 || num < 100 ) {
                System.out.print("Your number isn't 3 digit. ");
                count++;
            }
            else{
                if (isPalindrome(num) == true) {
                    System.out.println("It is palindrome");
                }
                else{
                    System.out.println("It isn't palindrome");
                }
                break;
            }
        }
        
        //exp 3
        System.out.println("Enter turn number here: ");
        int turn = scanner.nextInt();
        System.out.println("Result is: " + m(turn));
        
        
    }
    
}
