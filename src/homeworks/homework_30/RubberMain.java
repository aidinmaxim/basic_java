package homeworks.homework_30;


/**
 * 18.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class RubberMain {
    public static void main(String[] args) {
        RubberArray<String> ra = new RubberArray<>();

        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");

        ra.add("50");
        ra.add("aa");
        ra.add("-10");

        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");
        System.out.println(ra);

        System.out.println("Удаляем по индексу 8: " + ra.removeByIndex(1));
        System.out.println(ra);

        String searchMe = "aa";
        System.out.println("Поиск в массиве по значению: " + ra.indexOf(searchMe));

        RubberArray<Integer> raInt = new RubberArray<>();

        System.out.println("Сейчас в массиве: " + raInt.length() + " элементов");

        raInt.add(123);
        raInt.add(456);
        raInt.add(-44);

        System.out.println("Сейчас в массиве: " + raInt.length() + " элементов");
        System.out.println(raInt);

        System.out.println("Удаляем по индексу 2: " + raInt.removeByIndex(2));
        System.out.println(raInt);

        int searchMeInt = 123;
        System.out.println("Поиск в массиве по значению: " + raInt.indexOf(searchMeInt));
    }
}