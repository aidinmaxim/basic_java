package lessons.lesson_28;

/**
 * 13.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Table {

    public class Printer {

        private final String prefix;

        public Printer(String prefix) {
            this.prefix = prefix;
        }

        public void print() {
            for (int i = 0; i < count; i++) {
                Table.Pair current = pairs[i];
                System.out.println(prefix + " " + current);
            }
        }
    }

    private static class Pair {

        private final String key;

        private int value;

        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "-" + value;
        }
    }

    private final Pair[] pairs;

    private int count;

    public Table() {
        this.pairs = new Pair[10];
        this.count = 0;
    }

    public void put(String key, int value) {
        for (int i = 0; i < count; i++) {
            Pair current = pairs[i];

            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
        }

        Pair newPair = new Pair(key, value);

        pairs[count] = newPair;
        count++;
    }

    public int get(String key) {
        for (int i = 0; i < count; i++) {
            Pair current = pairs[i];

            if (current.key.equals(key)) {
                return current.value;
            }
        }

        return 0;
    }

    public Pair[] getPairs() {
        return pairs;
    }

    public int getCount() {
        return count;
    }
}