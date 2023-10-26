package lessons.lesson_36.cars;

import java.util.Comparator;

/**
 * 25.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }
}