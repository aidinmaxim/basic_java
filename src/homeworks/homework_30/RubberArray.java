package homeworks.homework_30;

/**
 * 17.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
import java.util.Arrays;
import java.util.Random;

public class RubberArray<T> {
    T[] array;
    int cursor;
    Random random = new Random();

    public RubberArray() {
        array =(T[]) new Object[10];
    }

    public RubberArray(int sizeDefault) {
        array = (T[]) new Object[sizeDefault];
    }

    void add(T value) {
        if (cursor > array.length * 0.9) {
            expandArray();
        }
        array[cursor++] = value;
    }


    void add(T... values) {
        for (T value : values) {
            add(value);
        }
    }

    void expandArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(array[i]).append((i < cursor - 1) ? ", " : "]");
        }
        return result.toString();
    }

    int length() {
        return cursor;
    }

    int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    int lastIndexOf(T value) {

        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    boolean remove(T value) {
        int index = indexOf(value);
        removeByIndex(index);
        return index >= 0;
    }

    T[] toArray() {
        T[] result = (T[]) new Object[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    void trim() {
        System.out.println("Текущий array1: " + Arrays.toString(array));
        array = toArray();
        System.out.println("Текущий array2: " + Arrays.toString(array));
    }

    T removeByIndex(int index) {
        if (index < 0 || index > cursor - 1) throw new RuntimeException();
        T value = array[index];

        T[] result = (T[]) new Object[array.length - 1];

        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = array[i];
            } else { // i >= index
                result[i] = array[i + 1];
            }
        }

        cursor--;
        array = result;

        return value;
    }
}