package homeworks.homework_27;

/**
 * 12.10.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Main {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Warrior1");
        characters[1] = new Mage("Mage1");
        characters[2] = new Archer("Archer1");

        for (GameCharacter character: characters) {
            character.attack();
        }
    }
}