package lessons.lesson_32_Marsel;

/**
 * 20.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Bus {
    private Driver driver;

    private final Passenger[] passengers;
    private String number;
    private int count;
    private boolean isGo;

    public Bus(String number) {
        this.number = number;
        this.passengers = new Passenger[5];
    }

    public void setDriver(Driver driver) {
        if (driver == null) {
            System.err.println("Driver can't be null");
        } else if (this.driver == driver){
            System.err.println("The driver already in the bus " + this.number);
        } else if (this.driver != null) {
            System.err.println("The bus already has a driver");
        } else {
            System.out.println("Driver " + driver.getName() + " in the bus " + this.number);
            this.driver = driver;
        }
    }

    public void freeDriver() {
        System.out.println("Driver " + driver.getName() + " out from the bus " + this.number);
        this.driver = null;
    }

    public void addPassenger(Passenger passenger) {
        if (count < passengers.length) {
            passengers[count] = passenger;
            count++;
        } else {
            System.out.println("Bus is full");
        }
    }

    public String getNumber() {
        return number;
    }

    public void go() {
        if (driver != null) {
            this.isGo = true;
            System.out.println("Bus " + number + " ride by " + driver.getName());
            System.out.println("Passengers in the bus: ");
            for (int i = 0; i < count; i++) {
                System.out.println(passengers[i].getName());
            }
        } else {
            System.out.println("Bus without driver");
        }
    }

    public void stop() {
        System.out.println("Bus was stopped");
        this.isGo = false;
    }
}