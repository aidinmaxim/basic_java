package lessons.lesson_31;

/**
 * 19.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public interface MyList<T> {
    void add(T value);

    void addAll(T... values);

    int size();

    int indexOf(T value);

    int lastIndexOf(T value);

    boolean contains(T value);

    T[] toArray();

    boolean remove(T value);

    T remove(int index);

    // Отвечает на вопрос является ли коллекция пустой
    boolean isEmpty();

    T get(int index);


}