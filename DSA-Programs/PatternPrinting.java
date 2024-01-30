
/*
 * This program prints a pattern of numbers, given the number of rows and the type of pattern user wants.
 */
import java.util.Scanner;

public class PatternPrinting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (true) {
            System.out.println("Enter the type of pattern you want to print: ");
            System.out.println("1. Filled Square");
            System.out.println("2. Hollow Square");
            System.out.println("3. Filled Triangle");
            System.out.println("4. Hollow Triangle");
            System.out.println("5. Filled Diamond");
            System.out.println("6. Hollow Diamond");
            System.out.println("7. Ben 10 Logo");
            System.out.println("8. Perimeter Box");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice <= 0 || choice > 8)
                break;
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            printPattern(choice, n);
        }
        sc.close();
    }

    private static void printPattern(int choice, int n) {
        System.out.println("Printing pattern of type " + choice + " with " + n + " rows.");
        switch (choice) {
            case 1:
                // printFilledSquare
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                // printHollowSquare
                for (int i = 1; i <= n; i++) {
                    if (i == 1 || i == n) {
                        for (int j = 1; j <= n; j++)
                            System.out.print("* ");
                    } else {
                        System.out.print("* ");
                        for (int j = 2; j < n; j++)
                            System.out.print("  ");
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                // printFilledTriangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= (n - i); j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;
            case 4:
                // printHollowTriangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= (n - i); j++)
                        System.out.print(" ");
                    if (i == 1 || i == n)
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                    else
                        for (int j = 1; j <= i; j++)
                            if (j == 1 || j == i)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                    System.out.println();
                }
                break;
            case 5:
                // printFilledDiamond
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= (n - i); j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= (n - i); j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;
            case 6:
                // printHollowDiamond
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= (n - i); j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++)
                        if (j == 1 || j == i)
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                    System.out.println();
                }
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= (n - i); j++)
                        System.out.print(" ");
                    if (i == 1 || i == n)
                        for (int j = 1; j <= i; j++)
                            System.out.print("* ");
                    else
                        for (int j = 1; j <= i; j++)
                            if (j == 1 || j == i)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                    System.out.println();
                }
                break;
            case 7:
                // printBen10Logo
                int m = (n + 1) / 2;
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (j <= i || j >= (n - i + 1))
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                    }
                    System.out.println();
                }
                for (int i = m - 1; i >= 1; i--) {
                    for (int j = 1; j <= n; j++) {
                        if (j <= i || j >= (n - i + 1))
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                    }
                    System.out.println();
                }
                break;
            case 8:
                // Perimeter Box
                int k = 2 * n - 1;
                for (int i = 1; i <= k; i++) {
                    for (int j = 1; j <= k; j++) {
                        System.out.print((Math.max(Math.abs(n - i), Math.abs(n - j)) + 1) + " ");
                    }
                    System.out.println();
                }
        }
    }
}