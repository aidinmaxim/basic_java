package lessons.lesson_32_Marsel;

/**
 * 20.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("22A");
        Bus bus2 = new Bus("1");
        Driver driver = new Driver("Max");

        driver.goToBus(bus);
        driver.goToBus(bus2);

        Passenger p1 = new Passenger("Aysel");
        Passenger p2 = new Passenger("Mikhailo");
        Passenger p3 = new Passenger("Maxim");
        Passenger p4 = new Passenger("Mihail");

        bus.addPassenger(p1);
        bus.addPassenger(p2);
        bus.addPassenger(p3);
        bus.addPassenger(p4);
    }
}