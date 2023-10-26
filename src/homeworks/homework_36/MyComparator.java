package homeworks.homework_36;

import java.util.Comparator;

/**
 * 25.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */

public class MyComparator implements Comparator<Integer> {
    private final boolean reverseOdd;

    public MyComparator(boolean reverseOdd) {
        this.reverseOdd = reverseOdd;
    }

    @Override
    public int compare(Integer int1, Integer int2) {
        int remainder1 = int1 % 2;
        int remainder2 = int2 % 2;

        if (reverseOdd) {
            if (remainder1 == remainder2) {
                if (remainder1 == 0) {
                    return int1.compareTo(int2);
                } else {
                    return int2.compareTo(int1);
                }
            } else {
                return remainder1 - remainder2;
            }
        } else {
            if (remainder1 == remainder2) {
                return int1 - int2;
            } else {
                return remainder1 - remainder2;
            }
        }
    }
}