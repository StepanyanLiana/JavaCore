package classwork;

import classwork.generic.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("88manelian@gmail.com", new Student("Liana", "Stepanyan", 28));
        Map<String, Student> studentMap1 = new LinkedHashMap<>();

    }
}
