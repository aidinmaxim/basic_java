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
        System.out.println("=================================");
        super.info();
        System.out.println("End of license: " + this.endOfLicense);
        System.out.println("=================================");
    }

    public String getEndOfLicense() {
        return endOfLicense;
    }

    public void setEndOfLicense(String endOfLicense) {
        this.endOfLicense = endOfLicense;
    }
}