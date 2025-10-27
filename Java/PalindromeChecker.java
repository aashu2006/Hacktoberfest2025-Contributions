/*
 * Program: Palindrome Checker
 * Author: Akshat Patil
 * Date: October 27, 2025
 * Description:
 * This program checks whether a given string is a palindrome.
 * A palindrome reads the same backward as forward.
 */

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        if (cleanInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
