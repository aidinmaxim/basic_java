package lessons.lesson_32_Marsel;

/**
 * 20.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Driver {

    private String name;
    private Bus bus;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void goToBus(Bus bus) {
        this.free();
        this.bus = bus;
        bus.setDriver(this);
    }

    private void free() {
        if (bus != null) {
            System.out.println("Driver " + name + " out from Bus " + bus.getNumber());
            this.bus.freeDriver();
        }
        this.bus = null;
    }
}