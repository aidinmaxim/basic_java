package homeworks.homework_36;

import java.util.Arrays;

/**
 * 25.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Task1 {
    public static void main(String[] args) {
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Arrays.sort(integers, new MyComparator(false));
        System.out.println(Arrays.toString(integers));
    }
}