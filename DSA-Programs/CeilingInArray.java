/*
 * This program takes in an array and a target, and sorts the array and returns ceiling of the target in the array (smallest number greater than or equal to the target)
 */

import java.util.Scanner;

public class CeilingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // USER INPUT
        // System.out.print("\nEnter the no of elements in the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.print("\nNow enter the " + size + " elements: ");
        // for (int a = 0; a < size; a++)
        // arr[a] = sc.nextInt();
        // System.out.print("\nEnter the target: ");
        // int target = sc.nextInt();

        // SAMPLE INPUTS
        // higher target present
        int[] arr = { 12, 23, 24, 28, 32 };
        int target = 25;

        // same target present
        // int[] arr = { 12, 23, 24, 25 };
        // int target = 25;

        // all elements smaller than target
        // int[] arr = { 12, 23, 24, 25 };
        // int target = 25;

        printCeiling(arr, target);

        sc.close();
    }

    private static void printCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            System.out.println("No element larger than target is present.");
            return;
        }

        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                break;
            if (arr[mid] > target)
                end = mid;
            else
                start = mid + 1;
        }
        mid = start + (end - start) / 2;
        System.out.print("\nThe ceiling of " + target + " is: " + arr[mid]);
    }
}
