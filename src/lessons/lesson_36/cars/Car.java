package lessons.lesson_36.cars;

/**
 * 25.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Car implements Comparable<Car> {
    private String model;
    private int year;



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed;

    public Car(String model, int year, int maxSeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSeed;
    }

    @Override
    public int compareTo(Car car) {

        return this.model.compareTo(car.getModel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}