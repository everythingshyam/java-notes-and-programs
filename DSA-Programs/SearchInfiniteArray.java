/*
 * This program takes in an array (infinite length) and a target, and prints the index of array 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;

        // USER INPUT
        // ArrayList<Integer> arrList = new ArrayList<Integer>();
        // System.out.print("\nEnter elements of the array(-1 to end): ");
        // temp = 0;
        // do {
        // arrList.add(temp);
        // temp = sc.nextInt();
        // } while (temp != -1);
        // arrList.remove(0);
        // Integer[] arr = arrList.toArray(new Integer[0]);
        // System.out.print("\nEnter the target: ");
        // int target = sc.nextInt();

        // SAMPLE INPUTS HERE
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
        int target = 6;

        int ans = -2;

        int start = 0, end = 0;
        while (end < arr.length) {
            if (target < arr[end]) {
                Integer[] arr2 = Arrays.copyOfRange(arr, start, end + 1);
                ans = binarySearch(arr2, target, start);
                break;
            }
            temp = end - start + 1;
            start = end + 1;
            end += 2 * temp;
        }
        if (ans == -2) {
            if (start > arr.length) {
                ans = -1;
            } else {
                end = arr.length - 1;
                Integer[] arr2 = Arrays.copyOfRange(arr, start, end + 1);
                ans = binarySearch(arr2, target, start);
            }
        }

        if (ans == -1)
            System.out.print("\nThe target isn't present in the array.");
        else
            System.out.print("\nThe target lies at index " + ans);

        sc.close();
    }

    private static int binarySearch(Integer[] arr, int target, int ref) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid + ref;
            } else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return ans;
    }
}
