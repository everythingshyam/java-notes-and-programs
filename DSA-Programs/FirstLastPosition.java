/*
 * This program takes in an array and a target, and prints the first and last position of the target in the array.
 */

import java.util.Scanner;

public class FirstLastPosition {
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
        // only one instance of target
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int target = 2;

        // multiple instances of target
        int[] arr = { 1, 2, 2, 2, 3, 4, 4, 5 };
        int target = 2;

        // target not present
        // int[] arr = { 1, 3, 4, 5 };
        // int target = 2;

        int[] ans = { -1, -1 };

        ans[0] = findIndexOf(arr, target, true);
        if (ans[0] != -1)
            ans[1] = findIndexOf(arr, target, false);

        if (arr[0] == -1 && arr[1] == -1)
            System.out.print("\nThe target isn't present in the array.");
        else
            System.out.print("\nThe target lies from index " + ans[0] + " to " + ans[1] + " ("
                    + (ans[1] - ans[0] + 1)
                    + " instances)");

        sc.close();
    }

    private static int findIndexOf(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans;
        if (findFirst)
            ans = end + 1;
        else
            ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (findFirst) {
                    if (mid < ans)
                        ans = mid;
                    end = mid - 1;
                } else {
                    if (mid > ans)
                        ans = mid;
                    start = mid + 1;
                }
            } else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        if (ans == arr.length)
            ans = -1;

        return ans;
    }
}
