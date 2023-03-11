package classwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();
        nameSet.add("LIANA");
        nameSet.add("ANI");
        nameSet.add("MANE");
        nameSet.add("NELLI");
        for (String s : nameSet) {
            System.out.println(s);
        }
        System.out.println(
        );
        Set<String> name = new TreeSet<>();
        name.add("Liana");
        name.add("Ani");
        name.add("Mane");
        name.add("Anna");
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println();
        Set<String> names = new LinkedHashSet<>();
        names.add("Liana");
        names.add("Ani");
        names.add("Mane");
        names.add("Anna");
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println();
        Set<Student> student = new TreeSet<>();
        student.add(new Student("Liana", "Stepanyan", 28));
        student.add(new Student("Mane", "Vardanyan", 8));
        student.add(new Student("Anna", "Stepanyan", 20));
        for (Student student1 : student) {
            System.out.println(student1);
        }
    }
}

