/*
 * This program performs selection sort on an input array.
 */

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        // System.out.print("\nEnter size of array: ");
        // int len = sc.nextInt();
        // int[] arr = new int[len];
        // System.out.print("\nEnter Elements of Array: ");
        // for (int i = 0; i < len; i++)
        // arr[i] = sc.nextInt();

        // Sample Input
        int[] arr = { 5, 4, 3, 2, 1 };
        int len = arr.length;

        System.out.print("\nOriginal Array: \n");
        printArray(arr);

        int stepCount = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                stepCount++;
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
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