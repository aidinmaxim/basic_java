package lessons.lesson_24;

/**
 * 09.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Passenger extends Person {

    private String busPassType;

    public Passenger(String name, String busPassType) {
        super(name, "Passenger");

        this.busPassType = busPassType;
    }

    public void info() {
        System.out.println("=================================");
        super.info();
        System.out.println("Bus pass type: " + this.busPassType);
        System.out.println("=================================");
    }

    public String getBusPassType() {
        return busPassType;
    }

    public void setBusPassType(String busPassType) {
        this.busPassType = busPassType;
    }


}