/*
 * This program will print all armstrong numbers of n digits.
 */

import java.util.Scanner;

class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program will print all armstron numbers of n digits\n Enter the value of n: ");
        int noOfDigits = sc.nextInt();

        printArmstrongs(noOfDigits);

        sc.close();
    }

    // method to print armstrong numbers of digits = noOfDigits
    private static void printArmstrongs(int noOfDigits) {
        if (noOfDigits < 1) {
            System.out.println("No armstrong number exists for " + noOfDigits + " digits");
            return;
        }
        int start = (int) Math.pow(10, noOfDigits - 1);
        int end = (int) Math.pow(10, noOfDigits) - 1;
        System.out.print("\nArmstrong numbers of " + noOfDigits + " digits are: \n");
        while (start <= end) {
            if (start == sumOfDigitCubes(start))
                System.out.print(start + " ");
            start++;
        }
        System.out.println("END_OF_LIST");
    }

    // method to return sum of cubes of the digits of a number
    private static int sumOfDigitCubes(int start) {
        int sum = 0;

        while (start != 0) {
            sum += Math.pow(start % 10, 3);
            start /= 10;
        }

        return sum;
    }
}