package homeworks.homework_15;

import java.util.Arrays;

/**
 * 25.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */

/**
 * Task 0
 *
 * Написать метод принимающий целое число и проверяющий является ли число простым. Если является, метод должен вернуть true, не является - false
 *
 * Task 1
 *
 * Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве. Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
 *
 * Task 3
 *
 * Написать метод, принимающий на вход массив строк. Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 *
 * Task 4 опционально
 *
 * Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
 *
 * вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
public class Homework_15 {
    public static void main(String[] args) {
        // Taks 0
        int n = 3;
        System.out.println("Число " + n + (isPrime(n) ? " простое" : " простым не является"));

        // Task 1
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int primeCount = countPrimes(array);
        System.out.printf("Количество простых чисел в массиве: %d\n", primeCount);

        // Task 2
        String[] strArray = {"How", "to", "check", "the", "balance", "of", "Telecom", "account"};
        String[] shortestAndLongestStrings = findShortestAndLongestStrings(strArray);

        System.out.printf("Самая короткая строка: %s\n", shortestAndLongestStrings[0]);
        System.out.printf("Самая длинная строка: %s\n", shortestAndLongestStrings[1]);

        // Task 3
        int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] result = filterPrimeNumbers(inputArray);

        System.out.printf("Простые числа из массива: %s\n", Arrays.toString(result));
    }

    public static int[] filterPrimeNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                count++;
            }
        }

        int[] primeNumbers = new int[count];
        int index = 0;

        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers[index] = number;
                index++;
            }
        }

        return primeNumbers;
    }

    public static String[] findShortestAndLongestStrings(String[] strings) {
        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            } else if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }

    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}