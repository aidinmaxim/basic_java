package homeworks.homework_27;

/**
 * 12.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Archer extends GameCharacter{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " стреляет из лука.");
    }
}