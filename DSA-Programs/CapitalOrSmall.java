/*
 * This program takes in a character and prints if it is a small letter, capital letter, or not alphabet.
 */

import java.util.Scanner;

public class CapitalOrSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputCharacter = sc.next().trim().charAt(0);

        // 1. USING NUMERIC VALUES OF CHARACTERS
        // if (inputCharacter >= 65 && inputCharacter <= 90) {
        // System.out.println(inputCharacter + " is a capital letter.");
        // } else if (inputCharacter >= 97 && inputCharacter <= 122) {
        // System.out.println(inputCharacter + " is a small letter.");
        // } else {
        // System.out.println(inputCharacter + "is not an alphabet.");
        // }

        // 2. USING CHARACTER VALUES ITSELF
        if (inputCharacter >= 'A' && inputCharacter <= 'Z') {
            System.out.println(inputCharacter + " is a capital letter.");
        } else if (inputCharacter >= 'a' && inputCharacter <= 'z') {
            System.out.println(inputCharacter + " is a small letter.");
        } else {
            System.out.println(inputCharacter + "is not an alphabet.");
        }
        sc.close();
    }
}
