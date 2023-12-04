/*
 * This program takes the no of terms(Natural no) and prints those many terms of Fibonacci Series
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0, second = 1, current, n;
        System.out.println("Enter no of terms to print (Fibonacci Series)_");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println();
            System.out.print(first);
            if (n > 1) {
                System.out.print("\t" + second);
                n -= 2;
                while (n-- != 0) {
                    current = first + second;
                    System.out.print("\t" + current);
                    first = second;
                    second = current;
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }

}
