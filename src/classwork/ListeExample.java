package classwork;

import java.util.ArrayList;

public class ListeExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("liana");
        names.add("ani");
        names.add("Mane");
        for (String name : names) {
            System.out.println(name);
        }
        boolean empty = names.isEmpty();
        System.out.println(empty);
        int ani = names.lastIndexOf("ani");
        System.out.println(ani);
    }
}
