/*
 * This program takes in a 2D Array Sorted by Row and by Column and a target element and searches it in the array.
 */

import java.util.Scanner;

class Array2DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                { 10, 20, 30, 40, 50 },
                { 11, 21, 31, 41, 51 },
                { 12, 22, 32, 42, 52 },
                { 13, 23, 33, 43, 53 },
                { 14, 24, 34, 44, 54 },
                { 15, 25, 35, 45, 55 }
        };
        int target = 9;

        boolean isFound = false;
        int rs = 0, re = arr.length - 1, cs = 0, ce = arr[0].length - 1;
        while (rs < re && cs < ce) {
            int rm = rs + (re - rs) / 2, cm = cs + (ce - cs) / 2;
            if (target == arr[rm][cm]) {
                System.out.println("Element Found at (" + rm + "," + cm + ").");
                isFound = true;
                break;
            } else if (target < arr[rm][cm]) {
                re = rm - 1;
                ce = cm - 1;
            } else {
                rs = rm + 1;
                cs = cm + 1;
            }
        }
        if (!isFound) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}