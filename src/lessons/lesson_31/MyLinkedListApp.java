package lessons.lesson_31;

/**
 * 18.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class MyLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList<String> strings = new MyLinkedList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.addAll("Abc", "hello");
        strings.add("Abc");

        System.out.println(strings);
        System.out.println(strings.indexOf("4"));
        System.out.println(strings.indexOf("ASDFD"));
        System.out.println("++++++++ Index of +++++++++");
        System.out.println(strings.indexOf("Abc"));
        System.out.println(strings.lastIndexOf("Abc"));


    }
}