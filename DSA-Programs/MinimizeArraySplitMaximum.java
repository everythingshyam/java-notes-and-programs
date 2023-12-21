/*
 * This program takes in an array and an integer m. It returns the minumum out of all the maximum sums possible of splits of an array, if the array is split into m contigous pieces.
 * For example if array is [1,2,3,4,5] and m is 2
 * Then, the best split will be [1,2,3] and [4,5], giving a max sum of 9
 * Note: Assuming array length is minimum 1 and value of m is valid (not greater than length of array)
 */

import java.util.Scanner;

public class MinimizeArraySplitMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // USER INPUT
        // System.out.print("\nEnter the no of elements in the array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.print("\nNow enter the " + size + " elements: ");
        // for (int a = 0; a < size; a++)
        // arr[a] = sc.nextInt();
        // System.out.print("\nEnter the no of splits you want: ");
        // int m = sc.nextInt();

        // SAMPLE INPUT 1
        int[] arr = { 7, 2, 5, 10, 8 };
        int m = 2;
        // Expected Output: 18

        // METHOD 1: Use Binary Search between min and maximum sum possible, and check
        // if that sum is possible and splits the array in m pieces...
        int start = findMax(arr); // when m = length of array
        int end = arraySum(arr); // when m = 1
        int maxSum = Integer.MIN_VALUE; // to store max sum in each iteration
        int ans = 0; // to store updated ans each time a possible answer is found

        while (start < end) {
            maxSum = Integer.MIN_VALUE;
            int mid = start + (end - start) / 2;
            int sum = 0;
            int count = 1;
            // for max sum equal to or less than mid, find possible no of seperations
            for (int a = 0; a < arr.length; a++) {
                if (sum + arr[a] < mid) {
                    sum += arr[a];
                } else {
                    if (sum > maxSum)
                        maxSum = sum;
                    sum = arr[a];
                    count++;
                }
            }
            if (sum > maxSum)
                maxSum = sum;
            // and checking if the no of partitions done is same as desired
            if (count == m) {
                ans = maxSum;
                end = mid - 1; // even if a valid sum is found, we've to still check if any lower sum is
                               // possible...
            } else if (count > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("The minimum sum possible for " + m + " splits is " + ans);
        sc.close();
    }

    private static int arraySum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            max = (a > max) ? a : max;
        }
        return max;
    }
}
