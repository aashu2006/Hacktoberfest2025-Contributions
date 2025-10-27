/*
 * Program: Armstrong Number Checker
 * Author: Akshat Patil
 * Date: October 27, 2025
 * Description:
 * This program checks whether a given number is an Armstrong number.
 * An Armstrong number is one whose sum of the cubes of its digits equals the number itself.
 * Example: 153 = 1³ + 5³ + 3³
 */

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, 3);
            number /= 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");

        scanner.close();
    }
}
