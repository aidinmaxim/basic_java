package homeworks.homework_36.tests;

import homeworks.homework_36.MyComparator;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * 25.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class MyComparatorTest {

    public Integer[] testArray;

    @BeforeEach
    void setUp() {
        testArray = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
    }

    @Test
    public void testComparator() {
        Integer[] expectedArray = {2, 4, 6, 8, 1, 3, 5, 7, 7, 9};
        Arrays.sort(testArray, new MyComparator(false));
        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    public void testComparatorReversOdd() {
        Integer[] expectedArray = {2, 4, 6, 8, 9, 7, 7, 5, 3, 1};
        Arrays.sort(testArray, new MyComparator(true));
        assertArrayEquals(testArray, expectedArray);
    }
}