package homeworks.collectionExample;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> name = new ArrayList<>();
    public static void main(String[] args) {

        name.add("Liana");
        name.add("Mane");
        name.add("Ani");
        name.add("Lilit");
        name.add("Meri");
        searchName();
        deleteName();
        inputName();

        }

    private static void inputName() {
        System.out.println("please input name");
        String na = scanner.nextLine();
        System.out.println("please input index");
        int index = Integer.parseInt(scanner.nextLine());
        name.set(index, na);
        for (String s : name) {
            System.out.println(s);
        }
    }

    private static void deleteName() {
        System.out.println("please input name");
        String deleteName = scanner.nextLine();
            name.removeIf(s -> s.equals(deleteName));
        for (String s : name) {
            System.out.println(s);
        }
    }

    private static String searchName() {
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
