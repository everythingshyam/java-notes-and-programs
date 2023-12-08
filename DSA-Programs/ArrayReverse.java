/*
 * This program takes in an array of integers and prints the reverse of the array.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Using ArrayList and methods
        int size = 0;

        System.out.print("\nEnter the size of the array: ");
        size = sc.nextInt();

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.print("\nEnter the elements of the array: ");
        while (size-- != 0) {
            numList.add(sc.nextInt());
        }

        System.out.println("\nBefore Reverse: " + numList);
        reverse(numList);
        System.out.println("\nAfter Reverse: " + numList);

        sc.close();
    }

    private static void reverse(ArrayList<Integer> numList) {
        int start = 0, end = numList.size() - 1;
        while (start < end) {
            swap(numList, start, end);
            start++;
            end--;
        }
    }

    private static void swap(ArrayList<Integer> numList, int first, int second) {
        int temp = numList.get(first);
        numList.set(first, numList.get(second));
        numList.set(second, temp);
    }
}
