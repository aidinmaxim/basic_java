package homeworks.homework_28;

import java.util.Arrays;

/**
 * 14.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.put("word", "слово");
        dictionary.put("Apple", "яблоко");
        dictionary.put("lamp", "лампа");

        System.out.println(dictionary.get("apple"));

        Dictionary.Translator translator = dictionary.new Translator();
        String[] words = {"Hello", "Bye", "apple"};

        String[] translations = translator.translate(words);

        System.out.println(Arrays.toString(translations));
    }
}