/*
 * This program takes in a sorted rotated array (non-descending order) and finds the no of rotations it has gone through.
 */

import java.util.Scanner;

public class CountArrayRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SAMPLE INPUT 1
        int[] arr = { 6, 7, 8, 2, 4, 5 };
        // SAMPLE INPUT 2
        // int[] arr = { 8, 8, 9, 1, 2, 3, 8, 8 };

        // USER INPUT
        // System.out.print("\nEnter the no of elements in the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.print("\nNow enter the " + size + " elements: ");
        // for (int a = 0; a < size; a++)
        // arr[a] = sc.nextInt();
        // System.out.print("\nEnter the target: ");
        // int target = sc.nextInt();

        // METHOD 1: Find pivot based on start, mid, end elements comparison
        // COMPLEXITY: log n, 1
        int start = 0, end = arr.length - 1, mid;
        int noOfRotations = 0;
        boolean isFound = false;
        while (start <= end) {
            // To handle duplicate values
            // this if to check if it is the last repeating element
            if (arr[start] == arr[end] && start != end) {
                if (arr[start] > arr[start + 1]) {
                    noOfRotations = start + 1;
                    isFound = true;
                    break;
                }
                start++;
                end--;
                continue;
            }

            mid = start + (end - start) / 2;
            // if start elem is larger than mid elem, pivot is somewhere before mid(may be
            // start itself)
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            }
            // if mid elem is larger than end elem, pivot is somewhere after mid(may be mid
            // itself)
            else if (arr[mid] > arr[end]) {
                start = mid;
                end--;
            } else {
                noOfRotations = end + 1;
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            noOfRotations = start + 1;
        }
        System.out.println("The array is rotated " + noOfRotations + " times.");
        sc.close();
    }
}
