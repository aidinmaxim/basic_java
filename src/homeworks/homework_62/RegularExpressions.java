package homeworks.homework_62;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        String birthdayDateString = "Моя дата рождения 2.6.1990";

        Pattern pattern = Pattern.compile("[0-6]");
        Matcher matcher = pattern.matcher(birthdayDateString);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("---------------------------------------");

        String emailsString = "myemail@example.co!m another&email@example.com";
        Pattern pattern1 = Pattern.compile("[@&!]");
        Matcher matcher1 = pattern1.matcher(emailsString);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        System.out.println("---------------------------------------");

        String sentence = "London is the capital of Great Britain.";
        Pattern pattern2 = Pattern.compile("[A-Z]");
        Matcher matcher2 = pattern2.matcher(sentence);

        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        System.out.println("---------------------------------------");

        String sentenceWithB = "Bears, Bees, and Bunnies are beautiful.";
        Pattern pattern3 = Pattern.compile("[bB]");
        Matcher matcher3 = pattern3.matcher(sentenceWithB);

        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
    }
}
