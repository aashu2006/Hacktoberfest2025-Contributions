/*
 * Program: Sum of Digits Calculator
 * Author: Akshat Patil
 * Date: October 27, 2025
 * Description:
 * This program calculates the sum of all digits in a given number.
 * Example: 1234 → 1 + 2 + 3 + 4 = 10
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int original = number;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of digits of " + original + " is: " + sum);
        scanner.close();
    }
}
