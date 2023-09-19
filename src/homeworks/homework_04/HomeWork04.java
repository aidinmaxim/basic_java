package homeworks.homework_04;

import java.util.Scanner;

/**
 * 08.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your firstname: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter your lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter your city: ");
        String city = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        String output = "My name is " + firstname + " " + lastname + ", I'm " + age + " years old, I live in " + city + ", my height - " + height;
        System.out.println(output);

    }
}