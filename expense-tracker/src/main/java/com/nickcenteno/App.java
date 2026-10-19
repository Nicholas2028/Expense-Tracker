package com.nickcenteno;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        calcSavings(35000);
    }

    public static void calcSavings(int salary) {
        double savingsPercent = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired % for savings: ");

        String input = scanner.nextLine();

        try {
            // Try to convert the string to an int
            savingsPercent = Integer.parseInt(input);
            savingsPercent = savingsPercent * 0.01;
            System.out.print(salary - salary * savingsPercent);
        } catch (NumberFormatException e) {
                // If it throws an exception, show an error and loop again
                System.out.println("Invalid input! " + input + " is not a number. Try again.");
        }
        scanner.close();
    }
}   

