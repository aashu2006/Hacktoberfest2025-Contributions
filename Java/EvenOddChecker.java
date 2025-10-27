/*
 * Program: Even or Odd Checker
 * Author: Akshat Patil
 * Date: October 27, 2025
 * Description:
 * This program takes an integer input from the user
 * and checks whether it is even or odd using the modulus operator.
 */

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        scanner.close();
    }
}
