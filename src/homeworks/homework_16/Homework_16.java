package homeworks.homework_16;

import java.util.Arrays;

/**
 * 26.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */


/**
 * Task 0
 * Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
 * toUpperCase() использовать низзя.
 *
 * Task 1
 * Написать метод swap, принимающий на вход массив целых чисел, и два индекса. Метод должен поменять местами значения, хранящихся в этих индексах
 * {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
 * Если индексы за пределами массива?
 * Перегрузка метода для работы с массивами строк.
 *
 * Task 2
 * Написать метод, принимающий строку и один или два индекса (перегрузка). Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно) Если индекс 1 - начиная с индекса и до конца строки.
 * Функционал повторяет метод String.substring(), так что этот метод использовать не нужно. Оригинальный метод ломает программу, если введены не корректные индексы. Наш метод аварийно завершать программу не должен.
 *
 * Task 3
 * Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
 *
 * Task 4
 * Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки, переведенных в верхний регистр. Распечатать полученный результат в методе main
 *
 * "Hello" -> "EL"
 * "He" -> "E"
 * "H" -> ???
 * Task 5
 *
 * Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход массив и определяет сумму его элементов.
 */
public class Homework_16 {
    public static void main(String[] args) {
        // Task 0
        String string = "hello, world!";
        String result = toUpperCase(string);
        System.out.println("Original: " + string);
        System.out.println("Converted: " + result);

        // Task 1
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};
        swap(intArray, 1, 5);
        System.out.println(Arrays.toString(intArray));

        String[] stringArray = {"apple", "banana", "cherry", "date"};
        swap(stringArray, 0, 3);
        System.out.println(Arrays.toString(stringArray));

        // Task 2
        String str = "0123456789";

        System.out.println(substring(str, 2, 5));

        System.out.println(substring(str, 4));

        // Task 3
        String[] testStrings = {"String", null, "hello", "Java", "JavaScript"};
        String[] nullString = null;
        String findMe = "hello";

        System.out.println(searchStringInArray(nullString, findMe));
        System.out.println(searchStringInArray(testStrings, findMe));

        // Task 4
        System.out.println(getTwoSymbolsString(str));
        System.out.println(getTwoSymbolsString("Hello"));


    }

    public static String getTwoSymbolsString(String str) {
        String result = "";

        if (str.length() > 1) {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.charAt(2);
        }

        return result.toUpperCase();
    }

    public static int searchStringInArray(String[] strings, String findMe) {
        if (strings == null || findMe == null) return -1;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i].equals(findMe)) return i;
        }

        return -1;
    }

    public static String substring(String string, int idx1) {
        return substring(string, idx1, string.length());
    }

    public static String substring(String string, int idx1, int idx2) {
        String result = "";

        if (string == null || idx1 < 0 || idx1 > string.length() || idx2 < 0 || idx2 > string.length()) {
            return result;
        }

        // Option1
        if (idx1 > idx2) return result;
        char[] chars = new char[idx2 - idx1];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(i + idx1);
        }


        //Option2
        for (int i = idx1; i < idx2; i++) {
            result += String.valueOf(string.charAt(i));
        }

        return result;

//        return String.valueOf(chars);
    }

    public static void swap(String[] arr, int index1, int index2) {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            String temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("One or both indexes are behind the array object.");
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else {
            System.out.println("One or both indexes are behind the array object.");
        }
    }

    public static String toUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                chars[i] = (char) (c - ('a' - 'A'));
            }
        }
        return new String(chars);
    }
}