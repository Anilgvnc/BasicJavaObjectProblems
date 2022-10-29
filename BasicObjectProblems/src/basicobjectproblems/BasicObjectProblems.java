
package basicobjectproblems;

import java.util.Scanner;

/**
 *
 * @author guven
 */
public class BasicObjectProblems {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Example 1
        
        System.out.println("Enter first integer here: ");
        int num1 = input.nextInt();
        System.out.println("Enter second integer here: ");
        int num2 = input.nextInt();
        System.out.println("First input: " + num1 + " Second input: " + num2);
        
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("First input: " + num1 + " Second input: " + num2);
       
        
        //Example 2 - Lineer Equ.
        
        System.out.println("Enter a, b, c, d here:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println("Enter x, y here: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double e = a * x + b * y;
        double f = c * x + d * y;
        System.out.println("e: " + e + " f: " + f);
    }
    
}
