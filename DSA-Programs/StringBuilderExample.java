/*
 * This program demonstrates the use of StringBuilder class in Java.
 */

import java.util.Scanner;

class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print(
                "\nKeep entering strings to append them to the master string. Enter '/q' to stop, '/r' to reset the string;\n");

        StringBuilder sb = new StringBuilder();
        String input = "/r";

        while (!input.equals("/q")) {
            if (input.equals("/r")) {
                sb = new StringBuilder();
                System.out.print("\n#String reset.");
            } else {
                sb.append(input);
                sb.append(" ");
                System.out.print("\n#New String:\n" + sb);
            }
            System.out.print("\n\n# ");
            input = sc.nextLine();
        }
        System.out.print("\n\n#Program Ended.");
        sc.close();
    }
}