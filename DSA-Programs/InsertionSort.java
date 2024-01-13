/*
 * This program performs insertion sort on an input array.
 */

import java.util.Arrays;
import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("\nEnter size of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("\nEnter Elements of Array: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        // Sample Input
        // int[] arr = { 5, 4, 3, 2, 1 };
        // int len = arr.length;

        System.out.print("\nOriginal Array: \n");
        printArray(arr);

        int stepCount = 0;
        for (int i = 0; i <= len - 2; i++) {
            // System.out.print("\ni = " + i);
            // System.out.print("\nCurrent Array: \n");
            // printArray(arr);
            for (int j = i + 1; j > 0; j--) {
                stepCount++;
                if (arr[j - 1] > arr[j]) {
                    // System.out.print("\nSwapping " + arr[i] + " and " + arr[j]);
                    arr[j - 1] = arr[j - 1] + arr[j];
                    arr[j] = arr[j - 1] - arr[j];
                    arr[j - 1] = arr[j - 1] - arr[j];
                } else {
                    break;
                }
            }
        }

        System.out.print("\n\nFINAL ARRAY:\n");
        printArray(arr);
        System.out.print("\nLENGTH OF ARRAY: " + len + "\nNO OF STEPS TAKEN: " + stepCount);

        sc.close();
    }

    private static void printArray(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }
}