package lessons.lesson_24;

/**
 * 09.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Vasja", "monthly ticket");
        passenger.info();

        BusDriver busDriver = new BusDriver("Kolja", "10.11.2025");
        busDriver.info();
    }
}