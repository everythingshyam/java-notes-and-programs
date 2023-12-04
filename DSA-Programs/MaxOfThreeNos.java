import java.util.Scanner;

public class MaxOfThreeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        // 1. USING TERNARY OPERATOR

        // first, we get max of a and b, then we compare it with c
        // if first is greater, we return greater of a and b, else c
        // int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        // 2. USING MATH.MAX() METHOD
        int max = Math.max(a, Math.max(b, c));

        System.out.println("Maximum of " + a + ", " + b + " and " + c + " is " + max);
        sc.close();
    }
}
