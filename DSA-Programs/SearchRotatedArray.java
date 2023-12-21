/*
 * This program takes in a sorted rotated array (non-descending order) and finds the target in the array.
 */

import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Arrays;

public class SearchRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SAMPLE INPUT
        int[] arr = { 9, 2, 9 };
        int target = 9;

        // USER INPUT
        // System.out.print("\nEnter the no of elements in the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.print("\nNow enter the " + size + " elements: ");
        // for (int a = 0; a < size; a++)
        // arr[a] = sc.nextInt();
        // System.out.print("\nEnter the target: ");
        // int target = sc.nextInt();

        // METHOD 1: Based on pivot condition, update the search range
        // COMPLEXITY: log n, 1
        // Slightly Complex to read
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            // To handle duplicate values
            if (arr[start] == arr[end] && start != end) {
                if (arr[start] == target) {
                    System.out.print("\nThe target ( " + arr[start] + " ) is at index " + start);
                    break;
                }
                start++;
                end--;
                continue;
            }

            mid = start + (end - start) / 2;
            // if target is found at mid
            if (arr[mid] == target) {
                System.out.print("\nThe target ( " + arr[mid] + " ) is at index " + mid);
                break;
            }
            // if start elem is larger than mid elem, pivot is somewhere before mid(may be
            // start itself)
            // then, if target is larger than start or smaller than mid, it'll be on left
            // side. Else, on right side
            if (arr[start] > arr[mid]) {
                if (target >= arr[start] || target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // if mid elem is larger than end elem, pivot is somewhere after mid(may be mid
            // itself)
            // then, if target is larger than mid or smaller than end, it'll be on right
            // side. Else, on left side
            else if (arr[mid] > arr[end]) {
                if (target > arr[mid] || target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            // Else, it's a simple sorted array (not rotated array)
            // Then we can check for simple binary search conditions
            else {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        // METHOD 2: Find Pivot then, depending on the range the target is in, apply
        // COMPLEXITY: log n(log n + log n), 1
        // Simpler to read, slight overhead
        // binary search in first subarray or the second one
        // ...

        sc.close();
    }
}
