package homeworks.homework_07;

import java.util.Random;
import java.util.Scanner;

/**
 * 13.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework07 {
    public static void main(String[] args) {
        // Task 0
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1, 2 or 3");

        int number = scanner.nextInt();
        if (number == 1 || number == 2 || number == 3) {
            System.out.println("Entered number is: " + number);
        }
        System.out.println("----------------------------");

        // Task 1
        Random random = new Random();
        int x1 = random.nextInt(100);
        int x2 = random.nextInt(100);
        int x3 = random.nextInt(100);
        int x4 = random.nextInt(100);

        System.out.println("Were generated 4 numbers: " + x1 + ", " + x2 + ", " + x3 + ", " + x4);

        int max = x1;
        if (x2 > max) {
            max = x2;
        }
        if (x3 > max) {
            max = x3;
        }
        if (x4 > max) {
            max = x4;
        }

        System.out.println("Max number is: " + max);

        // Task 2
        System.out.println("Enter a four-digit number: ");
        Scanner scanner2 = new Scanner(System.in);
        String input = scanner2.nextLine();

        if (input.length() != 4) {
            System.out.println("Error: Entered number is not four digit long");
            return;
        }

        int digit1 = input.charAt(0);
        int digit3 = input.charAt(1);
        int digit2 = input.charAt(2);
        int digit4 = input.charAt(3);

        if (digit1 + digit2 == digit3 + digit4) {
            System.out.println("This is a lucky ticket");
        } else {
            System.out.println("This is not a lucky ticket");
        }
    }
}