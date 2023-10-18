package lessons.lesson_30;

/**
 * 17.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class DounbleGenerics <T, E>{
    private T name;
    private E value;
    private E[] arrays;

    public DounbleGenerics(T name, E value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DounbleGenerics{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
//        DounbleGenerics<String, Integer> testG
    }
}