package lessons.lesson_16;

/**
 * 28.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class MainDog {
    public static void main(String[] args) {

        Dog dog = new Dog("Bim", 5);
        System.out.println(dog.whoAmI());

        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();

        System.out.println(dog.whoAmI());
    }
}