package homeworks.homework_13;


import java.util.Arrays;

/**
 * 22.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework_13 {
    public static void main(String[] args) {
        // Task 0
        int[] mainArray = {1, 4, 3, 6, 7, 5};
        System.out.println("There is an array: " + Arrays.toString(mainArray));
        reverseArray(mainArray);
        System.out.println("Reversed: " + Arrays.toString(mainArray));
        reverseArray(mainArray, 2);
        System.out.println("Reversed with offset: " + Arrays.toString(mainArray));
        reverseArray(mainArray, true);
        System.out.println("Reversed with true: " + Arrays.toString(mainArray));

        // Task 1
        System.out.println("2 ^ 16 = " + powerOfTwo(16));

        // Task 2
        System.out.println("Copied array with offset : " + Arrays.toString(mainArray));
        System.out.println("Reversed with new length 3: " + Arrays.toString(copyOfArray(mainArray, 3)));
        System.out.println("Original array: " + Arrays.toString(mainArray));

        // Task 3
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int result = findKthElement(arr1, arr2, k);
        System.out.println(k + "-й элемент: " + result);
    }

    public static void reverseArray(int[] array) {
        int length = array.length;
        int mid = length / 2;

        for (int current = 0; current < mid ; current++) {
            int mirrored = length - current - 1;
            int tmpCurrent = array[current];
            array[current] = array[mirrored];
            array[mirrored] = tmpCurrent;
        }
    }

    public static void reverseArray(int[] array, int offset) {
        int length = array.length;
        int mid = (array.length + offset) / 2;

        for (int current = offset; current < mid ; current++) {
            int mirrored = length - current + offset - 1;
            int tmpCurrent = array[current];
            array[current] = array[mirrored];
            array[mirrored] = tmpCurrent;
        }
    }

    public static void reverseArray(int[] array, boolean needReverse) {
        if (needReverse) reverseArray(array);
    }

    public static int powerOfTwo(int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= 2;
        }

        return result;
    }

    public static int[] copyOfArray(int[] array, int newLength) {
        int[] copy = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, n = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[n++] = arr1[i++];
            } else {
                mergedArray[n++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[n++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[n++] = arr2[j++];
        }

        return mergedArray[k - 1];
    }
}