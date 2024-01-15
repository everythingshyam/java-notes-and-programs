
/* There is an array consisting of nos from 1 to n, except that one no is missing from the series. We have to find that no.*/
import java.util.Arrays;
import java.util.Scanner;

class MissingNumberInArray {
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
        int[] arr = { 5, 4, 3, 2, 1, 7, 8, 6, 9 };
        int len = arr.length;

        System.out.print("\nOriginal Array: \n");
        printArray(arr);

        int stepCount = 0;
        int ans = 0;

        for (int a = 0; a < len - 1; a++) {
            boolean f = true;
            while (arr[a] != a + 1) {
                stepCount++;
                if (f)
                    f = false;

                int index = arr[a] - 1;
                if (index < len) {
                    int b = arr[a];
                    arr[a] = arr[index];
                    arr[index] = b;
                } else {
                    ans = a + 1;
                    break;
                }
            }
            if (f)
                stepCount++;
        }

        System.out.print("\n Final Array: \n");
        printArray(arr);
        System.out.print("\nMissing Element: " + ((ans == 0) ? "NA" : ans));
        System.out.print("\n Size of Array: " + len + " \n No of steps taken: " + stepCount);

        sc.close();
    }

    private static void printArray(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }
}
