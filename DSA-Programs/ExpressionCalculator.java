/*
 * [WORKING ON IT]
 * This program takes in a mathematical expression, and prints the evaluated result or "Invalid expression" error.
 */

import java.util.Scanner;

class ExpressionCalculator {
    private static double evaluate(String expression) {
        double result = 0;
        // TODO
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter an expression:");
        String expression = sc.nextLine();
        System.out.print("\nResult: " + evaluate(expression));
        sc.close();
    }
}