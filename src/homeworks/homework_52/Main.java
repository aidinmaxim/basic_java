package homeworks.homework_52;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1
        List<String> strings = List.of("Apple", "Banana", "Avocado", "Orange", "Banana", "Apricot");

        List<String> result = strings.stream()
                .filter(s -> s.startsWith(String.valueOf('A')))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        // Task 2

        List<Person> personList = List.of(
                new Person("Alice", 25, "New York"),
                new Person("Bob", 30, "London"),
                new Person("Charlie", 35, "Paris"),
                new Person("David", 28, "New York"),
                new Person("Eva", 40, "Berlin")
        );

        List<Person> filteredPersons = personList.stream().filter(person -> person.getAge() > 30 && person.getCity().equals("New York"))
                .collect(Collectors.toList());

    }
}

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}