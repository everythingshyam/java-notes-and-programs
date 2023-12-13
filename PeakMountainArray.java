/*
 * This program takes in an array(sorted in ascending with unique elements only) and a target, and prints the first and last position of the target in the array.
 */

import java.util.Scanner;

public class PeakMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // USER INPUT
        // System.out.print("\nEnter the no of elements in the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.print("\nNow enter the " + size + " elements: ");
        // for (int a = 0; a < size; a++)
        // arr[a] = sc.nextInt();

        // SAMPLE INPUTS
        // middle as peak
        // int[] arr = { 1, 2, 3, 2, 1 };

        // first as peak
        // int[] arr = { 9, 7, 5, 3, 2 };

        // last as peak
        // int[] arr = { 1, 2, 3, 4, 5 };

        // only one element
        // int[] arr = { 1 };

        // two elements
        int[] arr = { 1, 2 };

        int ans = findPeakIndex(arr);

        if (ans == -1)
            System.out.print("\nThere is no peak in the array.");
        else
            System.out.print("\nThe peak lies at index " + ans + ".");

        sc.close();
    }

    private static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 1)
            return 0;
        if (arr[0] > arr[1])
            return 0;
        if (arr[end] > arr[end - 1])
            return end;

        start = 1;
        end = arr.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return mid;
            else if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
