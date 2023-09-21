package homeworks.homework_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 21.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework_12 {
    public static void main(String[] args) {
        // Task 0
        Random random = new Random();
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        int countEven = 0;
        int sumEven = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEven++;
                sumEven += number;
            }
        }

        System.out.println("count of even number: " + countEven);
        System.out.println("sum of even numbers: " + sumEven);

        // Task 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double initialAmount = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        double monthlyInterestRate = 0.07;

        for (int i = 0; i < months; i++) {
            initialAmount += initialAmount * monthlyInterestRate;
        }

        System.out.printf("Final deposit amount after %d months: %.2f", months, initialAmount);

        // Task 2
        int[] fiftyNumbers = new int[50];

        for (int i = 0; i < fiftyNumbers.length; i++) {
            fiftyNumbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Initial array: " + Arrays.toString(fiftyNumbers));

        int countPrimeNumbers = 0;

        System.out.print("Prime numbers in array: ");
        for (int number : fiftyNumbers) {
            if (number <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                countPrimeNumbers++;
            }
        }
        System.out.println("\nCount of prime numbers: " + countPrimeNumbers);

        // Task 3
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
