package homeworks.homework_06;

import java.util.Scanner;

/**
 * 12.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework06 {
    public static void main(String[] args) {
        // Task 00
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        boolean isDivBy3 = number % 3 == 0;
        System.out.println("Число: " + number + " четное: " + isEven + ", кратно 3: " + isDivBy3 + ", четное и кратное 3: " + (isEven & isDivBy3));

        // Task 01
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println(true | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println(true | true & !(true) ^ (6 == 5));
        System.out.println(true | true & false ^ (6 == 5));
        System.out.println(true | true & false ^ false);
        System.out.println(true | false ^ false);
        System.out.println(true | false);
        System.out.println(true);
    }
}