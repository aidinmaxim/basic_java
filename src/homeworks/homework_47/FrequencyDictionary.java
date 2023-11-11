package homeworks.homework_47;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
        System.out.println();
    }

    private static Map<String, Integer> frequencyDictionary(String textString) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] words = textString.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "").split("\\s+");

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            map.compute(lowercaseWord, (k, v) -> v == null ? 1 : v + 1);
        }

        return map;
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String textString) {
        Map<Character, Integer> map = new TreeMap<>();

        for (char ch : textString.toCharArray()){
            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
        }

        return map;
    }

}