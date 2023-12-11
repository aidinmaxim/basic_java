package lessons.lesson_52.interfaces;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.zip.CheckedInputStream;

public class Main_52 {
    public static void main(String[] args) {
        // Function<T, R>

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(function.apply("Hello!"));

        Function<String,Integer> function1 = string -> string.length();
        System.out.println(function.apply("Hello!"));

        Function<String, Integer> function2 = String::length;
        System.out.println(function.apply("Hello!"));

        String text = "Java is Powerfull";

        Function<String, Integer> myFunction = Main_52::countSpaces;
        myFunction.apply(text);

        Function<String, Integer> countUpperCase = Main_52::countUpperCase;
        countUpperCase.apply(text);

        Function<String, String> function3 = String::toLowerCase;
        function3.apply(text);



        // Councumer<T>

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(Arrays.toString(string.toCharArray()));
            }
        };

        consumer.accept(text);



    } // main

    private static Integer countUpperCase(String string) {
        Integer count = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count;
    }

    public static Integer countSpaces(String string) {
        Integer count = 0;
        for (char ch : string.toCharArray()) {
            if (ch == ' ') count++;
        }
        return count;
    }

}
