package classwork;

import classwork.generic.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Liana", "Stepanyan", 28));
        studentList.add(new Student("Mane", "Vardanyan", 20));
        studentList.add(new Student("Lilit", "Stepanyan", 18));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return Integer.compare(student.getAge(), t1.getAge());
            }
        });
        System.out.println(studentList);
    }
}
