package lessons.lesson_24;

/**
 * 09.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Person {
    private String name;
    private String role;

    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Role: " + this.role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}