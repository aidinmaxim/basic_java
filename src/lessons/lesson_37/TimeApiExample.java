package lessons.lesson_37;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 26.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class TimeApiExample {

    public static void main(String[] args) {
        String dateForParse1 = "15-12-2022 20-46";
        String dateForParse2 = "13-01-2023 00-47";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parsedDateTime1 = LocalDateTime.parse(dateForParse1, formatter);
        LocalDateTime parsedDateTime2 = LocalDateTime.parse(dateForParse2, formatter);
        System.out.println(parsedDateTime1.getMonth());

        System.out.println(parsedDateTime1.until(parsedDateTime2, ChronoUnit.DAYS));
        System.out.println(parsedDateTime1.minus(10, ChronoUnit.DAYS));

        System.out.println(parsedDateTime1);

        System.out.println(parsedDateTime1.equals(parsedDateTime2));
    }


}