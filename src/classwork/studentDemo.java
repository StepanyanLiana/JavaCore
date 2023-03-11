package classwork;

import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input student's Name");
        String name = scanner.nextLine();
        System.out.println("Please input student's phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's course name");
        String courseName = scanner.nextLine();
        //Student student = new Student(name, phoneNumber, courseName);
        System.out.println("Student registered!");
    }
}
