package homeworks.homework_13;


import java.util.Arrays;

/**
 * 22.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework_13_second {
    public static void main(String[] args) {
        // Task 0
        int[] mainArray = {1, 4, 3, 6, 7, 5};
        System.out.println("There is an array: " + Arrays.toString(mainArray));
        printReversedArray(mainArray);
        printReversedArray(mainArray, 2);

        printReversedArray(mainArray, true);

        // Task 1
        powerOfTwo(16);

        // Task 2
        copyOfArray(mainArray, 3);

        // Task 3
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        findKthElement(arr1, arr2, k);
    }

    public static void printReversedArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ((i != 0) ? ", " : ""));
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printReversedArray(int[] array, int offset) {
        System.out.print("[");
        for (int j = 0; j <= offset - 1; j++) {
            System.out.print(array[j] + ((j != array.length) ? ", " : ""));
        }
        for (int i = array.length - 1; i > offset - 1; i--) {
            System.out.print(array[i] + ((i != offset) ? ", " : ""));
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printReversedArray(int[] array, boolean needReverse) {
        if (needReverse) {
            printReversedArray(array);
        } else {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void powerOfTwo(int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= 2;
        }

        System.out.println("2 ^ 16 = " + result);
    }

    public static void copyOfArray(int[] array, int newLength) {
        int[] copy = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (array.length > i) {
                copy[i] = array[i];
            } else {
                copy[i] = 0;
            }
        }

        System.out.println("Reversed with new length 3: " + Arrays.toString(copy));
    }

    public static void findKthElement(int[] arr1, int[] arr2, int k) {
        int i = 0, j = 0, result = 0, count = 0; boolean found = false;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result = arr1[i++];
            } else {
                result = arr2[j++];
            }
            if (count++ == k - 1) {
                found = true;
                break;
            }
        }

        while (i < arr1.length && !found) {
            result = arr1[i++];
            if (count++ == k - 1) {
                found = true;
                break;
            }
        }

        while (j < arr2.length && !found) {
            result = arr2[j++];
            if (count++ == k - 1) {
                break;
            }
        }

        System.out.println(k + "-й элемент: " + result);
    }
}