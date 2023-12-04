
/*
 * This program takes an integer input an prints reverse of that number.
 */

import java.util.Scanner;

class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number_");
        int n = sc.nextInt();
        int ans = 0;

        // 1. Using Modulo operator
        boolean isNegative = (n < 0);
        if (isNegative)
            n *= -1;

        while (n != 0) {
            ans *= 10;
            ans += (n % 10);
            n /= 10;
        }

        if (isNegative)
            ans *= -1;

        System.out.println("The reverse is " + ans);
        sc.close();
    }
}