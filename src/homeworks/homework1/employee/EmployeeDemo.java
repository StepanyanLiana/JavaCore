package homeworks.homework1.employee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("0 for exit");
            System.out.println("1 add employee");
            System.out.println("2 print all employee");
            System.out.println("3 search employee by employee ID");
            System.out.println("4 search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                   isRun = false;
                   break;
                case "1":
                    System.out.println("please input employee's name");
                    String name = scanner.nextLine();
                    System.out.println("please input employee's surname");
                    String surename = scanner.nextLine();
                    System.out.println("please input employee's ID");
                    String employeeID = scanner.nextLine();
                    System.out.println("please input employee's salary");
                    String salary = scanner.nextLine();
                    System.out.println("please input employee's company");
                    String company = scanner.nextLine();
                    System.out.println("please input employee's position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surename, employeeID, Double.parseDouble(salary), company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee is created");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                    String id = scanner.nextLine();
                    System.out.println(employeeStorage.searchEmployee(id));
                    break;
                case "4":
                    System.out.println("please input keyword");
                    String keyword = scanner.nextLine();
                    System.out.println(employeeStorage.searchEmployee(keyword));
                    break;
                default:
                    System.out.println("Wrong command,please try again.");
            }
        }


    }
}
