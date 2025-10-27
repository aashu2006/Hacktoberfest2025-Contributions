/*
 * Program: Prime Number Checker
 * Author: Akshat Patil
 * Date: October 27, 2025
 * Description:
 * This program checks whether a given number is a prime number or not.
 */

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

        scanner.close();
    }
}
