package lessons.lesson_30.methods;

/**
 * 17.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class PrinterApp {
    public static void main(String[] args) {
        String[] strings = new String[]{"test", "hello", "printer", "journal"};
        Integer[] integers = new Integer[]{1, 6, 3, -10, 0, 1};

        Printer printer = new Printer();
        printer.printArray(strings);
        System.out.println("================");
        printer.printArray(integers);

        System.out.println(printer.minValue(integers));
        System.out.println(printer.minValue(strings));
        System.out.println("================");

        System.out.println(printer.sumArray(integers));

        Printer<String> strPrinter = new Printer<>();
        strPrinter.print("100");
    }
}