/*
 * This program takes in a 2D Array Sorted properly (row-wise) and a target element and searches it in the array.
 */

import java.util.Scanner;

class Array2DSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        int target = 23;

        int rs = 0, re = arr.length - 1, cs = 0, ce = arr[0].length - 1;

        if (target < arr[rs][cs] || target > arr[re][ce]) {
            System.out.println("Element not found in the array.");
            System.exit(0);
        }
        while (rs < re) {
            int rm = rs + (re - rs) / 2;
            if (arr[rm][ce] == target) {
                System.out.println("Element found at index " + rm + "," + ce);
                System.exit(0);
            } else if (arr[rm][ce] < target) {
                rs = rm + 1;
            } else {
                re = rm - 1;
            }
        }
        while (cs <= ce) {
            int cm = cs + (ce - cs) / 2;
            if (arr[re][cm] == target) {
                System.out.println("Element found at index " + re + "," + cm);
                System.exit(0);
            } else if (arr[re][cm] < target) {
                cs = cm + 1;
            } else {
                ce = cm - 1;
            }
        }

        System.out.println("Element not found in the array.");

        sc.close();
    }
}