package lessons.lesson_31;

/**
 * 19.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class MyLinkedListApp2 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("2");
        list.add("3");

        System.out.println(list);
        list.addFirst("1");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.lastIndexOf("0"));
        System.out.println("===============");
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
    }
}