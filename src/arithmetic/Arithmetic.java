/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * @author sivagamasrinivasan
 */
public class Arithmetic 
{
    public static void main(String[] args) 
    {
        // Create ArithmeticBase instance
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        // Get input for two numbers
        System.out.println("Enter first number:");
        double x = in.nextDouble();

        System.out.println("Enter second number:");
        double y = in.nextDouble();

        // Perform operations and print results
        System.out.println("Results of all operations:");

        double additionResult = r.calculate(x, y, Operation.PLUS);
        System.out.println("PLUS: " + additionResult);

        double subtractionResult = r.calculate(x, y, Operation.MINUS);
        System.out.println("MINUS: " + subtractionResult);

        double multiplicationResult = r.calculate(x, y, Operation.TIMES);
        System.out.println("TIMES: " + multiplicationResult);

        try {
            double divisionResult = r.calculate(x, y, Operation.DIVIDE);
            System.out.println("DIVIDE: " + divisionResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


