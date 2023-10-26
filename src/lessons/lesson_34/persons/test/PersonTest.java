//package lessons.lesson_34.persons.test;
//
//import lesson_34.persons.Person;
//import org.junit.jupiter.api.*;
//
///**
// * 24.10.2023
// * LessonsAndHomeworks35E
// *
// * @author Maksym Aidin
// */
//public class PersonTest {
//
//    Person person;
//    String startEmail = "john@test.com";
//    String startPassword = "qwert1Q!";
//
//    @BeforeEach
//    void setUp() {
//        person = new Person(startEmail, startPassword);
//    }
//
//    @Test
//    void testSetValidEmail() {
//        String validEmail = "valid@test.de";
//        person.setEmail(validEmail);
//        Assertions.assertEquals(validEmail, person.getEmail());
//    }
//
//    @Test
//    void testInvalidEmail() {
//        String incorrectEmail = "invalid.test.de";
//        person.setEmail(incorrectEmail);
//        Assertions.assertEquals(startEmail, person.getEmail());
//    }
//
//    @Test
//    void testInvalidEmailTwoAtSet() {
//        String incorrectEmail = "invalid@test@de";
//        person.setEmail(incorrectEmail);
//        Assertions.assertEquals(startEmail, person.getEmail());
//    }
//}