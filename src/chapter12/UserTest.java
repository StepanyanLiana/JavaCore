package chapter12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        User user = new User();
        user.name = "Liana";
        user.surname = "Stepanyan";
        user.language = Language.RU;
        Language[] languages = Language.values();
        System.out.println("please choose from languages");
        for (Language language : languages) {
            System.out.println(language.name());
        }
        String strLanguage = scanner.nextLine();
        try {
            user.language = Language.valueOf(strLanguage);
            System.out.println("for " + user.name + " selected " + user.language);
        }catch (IllegalArgumentException e) {
            System.out.println("language is wrong");
        }
    }
}
