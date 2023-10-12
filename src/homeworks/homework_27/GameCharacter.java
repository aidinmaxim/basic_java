package homeworks.homework_27;

/**
 * 12.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public abstract class GameCharacter {
    protected String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public abstract void attack();
}