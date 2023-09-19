package homeworks.homework_05;

/**
 * 11.09.2023
 * basic_programming
 *
 * @author Maksym Aidin
 */
public class Homework05 {
    public static void main(String[] args) {
//        Task 01
        String name = "Maksym";
        int nameLength = name.length();
        System.out.println("In the word '" + name + "' are " + nameLength + " characters.");

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(nameLength - 1);

        System.out.println("In your name '" + name + "' the first character is '" + firstChar + "' " + " and the last character is '" + lastChar + "'");
        System.out.println("The first character int code is " + (int) firstChar + ", the last is " + (int) lastChar);

//        Taks 02.01
        String s0 = "Java";
        String s1 = "is";
        String s2 = "a";
        String s3 = "powerful";
        String s4 = "language";

//        String concatString = s0 + " " + s1 + " " + s2 + " " + s3 + " " + s4;
        String concatString = String.join(" ", s0, s1, s2, s3, s4);
        System.out.println("'" + concatString + "' - this string contains " + concatString.length() + " characters.");

//        Taks 02.02
        concatString = concatString.replace("powerful", "super");
        String searchSubstring = "age";
        System.out.println("'" + concatString + "' - this string" + (concatString.contains(searchSubstring) ? " " : " not ") + "contains substring '" + searchSubstring + "'.");

//        Task 03
        String[] strings = {"string", "code", "Practice"};

        for (String str : strings) {
            int length = str.length();
            int middle1 = length / 2 - 1;
            int middle2 = length / 2 + 1;

            System.out.println(str.substring(middle1, middle2));
        }
    }
}