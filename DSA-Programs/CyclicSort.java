
/* This program performs a cyclic sort on an array consisting 1 to n */
import java.util.Arrays;
import java.util.Scanner;

class CyclicSort {
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
        int[] arr = { 5, 4, 3, 2, 1 };
        int len = arr.length;

        System.out.print("\nOriginal Array: \n");
        printArray(arr);

        int stepCount = 0;

        for (int a = 0; a < len - 1; a++) {
            boolean f = true;
            while (arr[a] != a + 1) {
                stepCount++;
                int index = arr[a] - 1;
                int b = arr[a];
                arr[a] = arr[index];
                arr[index] = b;
                if (f)
                    f = false;
            }
            if (f)
                stepCount++;
        }

        System.out.print("\n Final Array: \n");
        printArray(arr);
        System.out.print("\n Size of Array: " + len + " \n No of steps taken: " + stepCount);

        sc.close();
    }

    private static void printArray(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }
}
