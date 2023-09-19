package homeworks.homework_10;

import java.util.Scanner;

/**
 * 19.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework_10 {
    public static void main(String[] args) {

        //    Task 0 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
        int i = 1;
        while (i <= 10) {
            System.out.println("Taks" + i);
            i++;
        }

        //    Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
        i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);

        //    Task 2 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
        int n = 0;
        i = 1;
        while (i < 100 && n < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                n++;
            }
            i++;
        }

        //    Task 3 Программа просит пользователя слово "hello" Если пользователь вводит правильное слово - программа
        //    распечатывает на экран благодарность и завершает работу Если вводится не верное слово - программа просит
        //    ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
        //*опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
        // По окончанию - вывести число попыток на экран
        Scanner scanner = new Scanner(System.in);
        String word;
        int count = 0;
        do {
            System.out.println("Write please 'hello' word: ");
            word = scanner.nextLine();
            count++;
        } while (!word.equals("hello"));

        System.out.println("Thank you! You did it! Count of reties: " + count);

        //    Task 4 Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of digits of you number is: " + sum);
    }
}