package lessons.lesson_24;

/**
 * 09.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Passenger passanger = new Passenger("Vasja", "monthly ticket");
        passanger.info();

        BusDriver busDriver = new BusDriver("Kolja", "10.11.2025");
        busDriver.info();
    }
}