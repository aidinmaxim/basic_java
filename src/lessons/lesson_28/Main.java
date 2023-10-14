package lessons.lesson_28;

/**
 * 13.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.put("A", 10);
        table1.put("B", 20);
        table1.put("C", 30);

        Table table2 = new Table();
        table2.put("X", 100);
        table2.put("Y", 200);
        table2.put("Z", 400);

        Table.Printer printer1 = table1.new Printer("Hi");
        Table.Printer printer2 = table2.new Printer("BYE");

        printer1.print();
        printer2.print();
    }
}