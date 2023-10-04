package homeworks.homework_20;

/**
 * 03.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("          ", 17, 1);
        employee.info();
        employee.setName(null);
        employee.info();
    }
}