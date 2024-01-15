
/*
 * There is an array of length n that should have contained numbers from 1 to n , but is missing some numbers. Find those numbers. (Amazon)
 * Algorithm Used: Cyclic Sorting (as base)
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class MissingNumbersInArray {
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
        int[] arr = { 5, 4, 3, 3, 1, 5, 7, 8, 8 };
        int len = arr.length;

        ArrayList<Integer> missingIndices = new ArrayList<>();

        System.out.print("\nOriginal Array: \n");
        printArray(arr);

        int stepCount = 0;

        for (int a = 0; a < len; a++) {
            boolean f = true;
            while (arr[a] != a + 1) {
                stepCount++;
                if (f)
                    f = false;

                int index = arr[a] - 1;
                if (index < len && arr[a] != arr[index]) {
                    int b = arr[a];
                    arr[a] = arr[index];
                    arr[index] = b;
                    int tempIndex = missingIndices.indexOf(arr[index]);
                    if (tempIndex != -1) {
                        System.out.println("removed " + missingIndices.get(tempIndex));
                        missingIndices.remove(tempIndex);
                    }
                } else {
                    missingIndices.add(a + 1);
                    System.out.println(missingIndices);
                    break;
                }
            }
            if (f)
                stepCount++;
        }

        System.out.print("\n Final Array: \n");
        printArray(arr);
        if (missingIndices.size() == 0)
            System.out.print("\nNo Missing Elements.");
        else
            System.out.print("\n Missing Elements: " + missingIndices);
        System.out.print("\n Size of Array: " + len + " \n No of steps taken: " + stepCount);

        sc.close();
    }

    private static void printArray(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }
}
