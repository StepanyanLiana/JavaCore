package classwork;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    String surname;
    int age;
    String phoneNumber;
    String email;
    String courseName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(phoneNumber, student.phoneNumber) && Objects.equals(email, student.email) && Objects.equals(courseName, student.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, phoneNumber, email, courseName);
    }

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        if (age == student.age) {
            return 0;
        }
        if (age > student.age) {
            return 1;
        }
            return -1;
        }
    }

