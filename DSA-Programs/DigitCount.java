/*
 * This program take in an integer and a digit, and displays the no of times that digit has appeared in that number.
 */

import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number_");
        int n = sc.nextInt();
        System.out.print("\nEnter digit to count_");
        int d = sc.nextInt();

        // 1. Using Divide by 10 Approach
        int count = 0;
        while (n != 0) {
            if (n % 10 == d)
                count++;
            n /= 10;
        }

        System.out.println("\nThe count of " + d + " is " + count);

        sc.close();
    }
}