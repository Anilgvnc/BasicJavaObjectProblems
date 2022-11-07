
package lesson2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anilgvnc
 */
public class Lesson2 {

    public static void main(String[] args) {
        
        //exp 1 - Random month generator.
        
        System.out.print("Selected month is: ");
        Random r = new Random();
        int month = r.nextInt(11);
        
        switch(month){
            case 0:
                System.out.println("January");
                break;
            case 1:
                System.out.println("February");
                break;
            case 2:
                System.out.println("March");
                break;
            case 3:
                System.out.println("April");
                break;
            case 4:
                System.out.println("May");
                break;
            case 5:
                System.out.println("June");
                break;
            case 6:
                System.out.println("July");
                break;
            case 7:
                System.out.println("August");
                break;
            case 8:
                System.out.println("September");
                break;
            case 9:
                System.out.println("October");
                break;    
            case 10:
                System.out.println("November");
                break;
            case 11:
                System.out.println("December");
                break;    
        
        }
        
        //exp 2 - Rock, paper, scissor game.
        
        System.out.print("scissor(0), rock(1), paper(2): ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        Random rand = new Random();
        int srp = rand.nextInt(2);
        
        
        switch(srp){
            case 0:
                System.out.print("Computer is scissor.");
                break;
            case 1:
                System.out.print("Computer is rock.");
                break;
            case 2:
                System.out.print("Computer is paper.");
                break;
        }
        
        switch(input){
            case 0:
                System.out.print(" You are scissor.");
                break;
            case 1:
                System.out.print(" You are rock.");
                break;
            case 2:
                System.out.print(" You are paper.");
                break;
        }
        
        if (srp == input) {
            System.out.println(" It is draw.");
        }
        
        else if ( srp == 0 && input == 1 || srp == 1 && input == 2 || srp == 2 && input == 0 ) {
            System.out.println(" You won.");
        }
        
        else{
        System.out.println(" You lose.");        
        }
        
        
        //exp 3 - State of selected point with circle.
        
        System.out.print("Enter a point with two coordinates: ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        System.out.print("Point (" + x + ", "  + y  + ") is ");
        
        if (result <= 10) {
            System.out.println("in the  circle.");
        }
        
        else{
            System.out.println("not in the circle.");
        }
        
        
        //exp 4 - Digit guessing
        
        System.out.println("Enter a three-digit number here: ");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        if (in < 100) {
            System.out.println("Youre number not a three-digit number please enter again: ");
            scanner = new Scanner(System.in);
            in = scanner.nextInt();
        }
        
        Random random = new Random();
        int digit = random.nextInt();
        int digit1 = random.nextInt();
        int digit2 = random.nextInt();
        
        int digitIn = in / 100;
        int digitIn1 = (in / 10) - (digitIn * 10);
        int digitIn2 = in - (digitIn * 100) - ( digitIn1 * 10);
        
        if (digitIn == digit && digitIn1 == digit1 && digitIn2 == digit2) {
            System.out.println("You won 10.000$");
        }
        
        else if (digitIn1 == digit && digitIn == digit2 && digitIn2 == digit1 ||
                digitIn1 == digit1 && digitIn == digit && digitIn2 == digit2 ||
                digitIn1 == digit2 && digitIn == digit1 && digitIn2 == digit) {
            System.out.println("You won 3.000$");
        }
        else if (digitIn1 == digit || digitIn == digit2 || digitIn2 == digit1 ||
                digitIn1 == digit1 || digitIn == digit || digitIn2 == digit2 ||
                digitIn1 == digit2 || digitIn == digit1 || digitIn2 == digit) {
            System.out.println("You won 1.000$");
        }
        else{
            System.out.println("You lost!");
        }
    }
    
}
