package homeworks.homework_27;

/**
 * 12.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Mage extends GameCharacter{
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " кастует магичесское заклинание.");
    }
}