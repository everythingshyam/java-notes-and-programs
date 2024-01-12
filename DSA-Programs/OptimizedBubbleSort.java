
// This program takes in an array and sorts it using Bubble Sort Algorithm, but optimized
import java.util.Scanner;

class OptimizedBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("\nEnter size of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("\nEnter Elements of Array: ");
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();

        // Sample Input
        // int len = 5;
        // int[] arr = { 1, 3, 2, 4, 5 };

        /*
         * i stores upto what does j have to go, to compare with next elem
         * i starts with 2nd last elem, and goes back upto first element
         * j goes from first to i_pointed element, and does comparison with next element
         * Additionally, there is a counter which stores after inner loop finishes each
         * time,
         * the no of consecutive comparisons which failed from the end of the array
         * That will tell how many elements are already sorted on the right end of the
         * array.
         */

        System.out.print("\nOriginal Array: \n");
        printArray(arr);

        int counter = 0, stepCount = 0;
        for (int i = len - 2; i >= 0;) {
            // System.out.print("\ni = " + i);
            // System.out.print("\nCurrent Array: \n");
            // printArray(arr);
            for (int j = 0; j <= i; j++) {
                stepCount++;
                if (arr[j] > arr[j + 1]) {
                    // System.out.print("\nSwapping " + arr[j] + " and " + arr[j + 1]);
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                    counter = 0;
                } else {
                    counter++;
                }
            }
            i -= counter + 1;
        }

        System.out.print("\n\nFINAL ARRAY:\n");
        printArray(arr);

        System.out.print("\nLENGTH OF ARRAY: " + len + "\nNO OF STEPS TAKEN: " + stepCount);

        sc.close();
    }

    private static void printArray(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + "\t");
        }
    }
}