package homeworks.homework_11;

import java.util.Arrays;
import java.util.Random;

/**
 * 19.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework_11 {
    public static void main(String[] args) {
        //    Task 0
        int[] array = new int[6];
        Random random = new Random();
        int i = 0;
        int rangeMin = -100;
        int rangeMax = 100;
        while (array.length > i) {
            int randomNumber = random.nextInt(rangeMax - rangeMin + 1) + rangeMin;
            array[i] = randomNumber;
            i++;
        }
        System.out.println(Arrays.toString(array));;


        int min = array[0];
        int max = array[0];
        int posMin = 0;
        int posMax = 0;
        int sum = 0;
        i = 0;
        while (array.length > i) {
            if (array[i] < min) {
                min = array[i];
                posMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                posMax = i;
            }
            sum += array[i];

            i++;
        }
        System.out.printf("Max element: %d, min element: %d, average: %d%n", max, min, sum / array.length);

        // Task 1
        array[posMin] = max;
        array[posMax] = min;
        System.out.println(Arrays.toString(array));

        // Task 2
        int maxLength = 0;
        int longestIndex = 0;
        int e = 0;
        String[] arrayStr = { "One", "Two", "Twenty" };
        while (e < arrayStr.length) {
            String currentString = arrayStr[e];
            int currentLength = currentString.length();

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestIndex = e;
            }

            e++;
        }

        String longestString = arrayStr[longestIndex];
        int j = 0;

        while (j < longestString.length()) {
            char currentChar = longestString.charAt(j);
            System.out.println(currentChar);
            j++;
        }
    }
}