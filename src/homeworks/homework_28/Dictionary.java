package homeworks.homework_28;

/**
 * 14.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Dictionary {

    private final DictionaryPair[] pairs;
    private int count;

    public Dictionary() {
        this.pairs = new Dictionary.DictionaryPair[10];
        this.count = 0;
    }

    public Dictionary(int dictionarySize) {
        this.pairs = new Dictionary.DictionaryPair[dictionarySize];
        this.count = 0;
    }

    public static class DictionaryPair {
        private final String key;
        private String value;

        public DictionaryPair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public class Translator {
        public String[] translate(String[] words) {
            String[] translations = new String[words.length];
            for (int i = 0; i < words.length; i++) {
                translations[i] = get(words[i]);
            }

            return translations;
        }
    }

    public void put(String key, String value) {
        key = key.toLowerCase();
        value = value.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (pairs[i].key.equals(key)) {
                pairs[i].value = value;

                return;
            }
        }

        if (count < pairs.length) {
            pairs[count] = new DictionaryPair(key, value);
            count++;
        } else {
            System.out.println("Dictionary is full");
        }
    }

    public String get(String keyWord) {
        keyWord = keyWord.toLowerCase();

        for (int i = 0; i < count; i++) {
            if (pairs[i].key.equals(keyWord)) {
                return pairs[i].value;
            }
        }

        return "Unknown word";
    }
}