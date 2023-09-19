package homeworks.homework_08;

import java.util.Random;
import java.util.Scanner;

/**
 * 14.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework08 {
    public static void main(String[] args) {
        // Task 0
        Scanner scanner = new Scanner(System.in);
        String answer;

        System.out.println("Enter 1, 2 or 3");

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                answer = "1";
                break;
            case 2:
                answer = "2";
                break;
            case 3:
                answer = "3";
                break;
            default:
                answer = "unknown";
        }

        System.out.println("Entered number is: " + answer);

        // Task 1

        int day = 0;
        String dayOfWeek;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter number of the day: ");
        day = scanner1.nextInt();

        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
            case 7:
                dayOfWeek = "Holiday";
                break;
            default:
                dayOfWeek = "Invalid day";
        }

        System.out.println("Entered number of the day means: " + dayOfWeek);

        // Task 2
        Random random = new Random();
        int mark = random.nextInt(12) + 1;
        System.out.println("Оценка: " + mark);
        int tvTime = 45;

        switch (mark) {
            case 12:
            case 11:
            case 10:
                System.out.println("Молодец!");
                tvTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Хорошо!");
                tvTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Старайся лучше!");
                tvTime += 15;
                break;
            case 3:
                System.out.println("Плохо!");
                tvTime -= 30;
                break;
            default:
                System.out.println("Очень плохо! Сегодня остаешься без телевизора!");
                tvTime = 0;
        }
        if (tvTime > 60) {
            tvTime = 60;
        }

        System.out.println("Оставшееся на сегодня время для просмотра ТВ: " + tvTime + " минут.");
    }
}