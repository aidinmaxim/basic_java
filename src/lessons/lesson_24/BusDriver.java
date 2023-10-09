package lessons.lesson_24;

/**
 * 09.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class BusDriver extends Person {
    private String endOfLicense;

    public BusDriver(String name, String endOfLicense) {
        super(name, "Bus driver");
        this.endOfLicense = endOfLicense;
    }

    public void info() {
        super.info();
        System.out.println("End of license: " + this.endOfLicense);
    }

    public String getEndOfLicense() {
        return endOfLicense;
    }

    public void setEndOfLicense(String endOfLicense) {
        this.endOfLicense = endOfLicense;
    }
}