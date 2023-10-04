package homeworks.homework_20;

/**
 * 03.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        }
    }
}