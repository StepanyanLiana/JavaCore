package homeworks.collectionExample;

import java.util.*;

public class CollectionExample2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("please input 5 name");
        String names = scanner.nextLine();
        String[] nameStr = names.split(",");
        Set<String> allNames = new HashSet<>();
        allNames.addAll(List.of(nameStr));
        for (String s : allNames) {
            System.out.println(s);
        }

        System.out.println("please input 10 name");
        String sortName = scanner.nextLine();
        String[] split = sortName.split(",");
        Set<String> name = new TreeSet<>();
        name.add(sortName);
        //name.addAll(Collections.singleton(sortName));
        for (String s : name) {
            System.out.println(s);
        }


    }
}
