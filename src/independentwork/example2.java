package independentwork;

import java.util.ArrayList;
import java.util.Scanner;

public class example2 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> name = new ArrayList<>();

    public static void main(String[] args) {

        name.add("Liana");
        name.add("Mane");
        name.add("Ani");
        name.add("Lilit");
        name.add("Meri");
        searchName();

    }

    public static String searchName() {
        System.out.println("please input name");
        String name1 = scanner.nextLine();
        for (String n : name) {
            if (n.equals(name1)) {
                System.out.println("the name is in the list");
                return name1;
            }
        }
        System.out.println("the name is not in the list");
        return null;
    }
}