package homeworks.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        //Employee employee = new Employee(""Liana", "Stepanyan", "a001", 500000, "company1", "meneger");
        //employeeStorage(add);
        //employeeStorage.add(new Employee("Liana", "Stepanyan", "a001", 500000, "company1", "meneger"));
       // employeeStorage.add(new Employee("Ani", "Adyan", "a00002", 400000, "company2", "jr meneger"));
        //employeeStorage.add(new Employee("Lia", "Lalayan", "a001", 100000, "company3", "meneger"));

        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {

                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeById();
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyname = scanner.nextLine();
                    employeeStorage.searchEmployee(companyname);
                    break;
                case "5":
                    getEmployeeBySalary();
                    break;
                case "6":
                    changePositionByEmployeeId();
                    break;
                case "7":
                  employeeStorage.prinByStatus(true);
                    break;
                case "8":
                   inactiveEmployee();

                    break;
                case "9":
                    activateEployee();
                    break;
                case "10":

                    break;
                case "11":
                    break;
                default:
                    System.out.println("Wrong command,please try again.");
            }
        }
    }

    private static void activateEployee() {
        employeeStorage.prinByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchByName(employeeId);
        if(employee == null || !employee.isActive()) {
            System.out.println("wrong employee ID, please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void inactiveEmployee() {
        System.out.println("please choose employee id");
        employeeStorage.prinByStatus(true);
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.searchByName(employeeId);
        if(employee == null || !employee.isActive()) {
            System.out.println("wrong employee ID, please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }

    }


    private static void printCommands() {
        System.out.println("please input 0 for exit");
        System.out.println("please input 1 for add employee");
        System.out.println("please input 2 for print employees");
        System.out.println("please input 3 for search employee by ID");
        System.out.println("please input 4 for search employee by company name");
        System.out.println("please input 5 for search employee by salary range");
        System.out.println("please input 6 for change position");
        System.out.println("please input 7 for print only active employees");
        System.out.println("please input 8 for inactive employee by ID");
        System.out.println("please input 9 for activate employee by ID");

    }

    private static void changePositionByEmployeeId() {
        System.out.println("please choose employee id");
        String employeId = scanner.nextLine();
        Employee employee = employeeStorage.searchByName(employeId);
        if(employee == null) {
            System.out.println("wrong employee ID,please try again");
        } else {
            System.out.println("please input new position name");
           String position = scanner.nextLine();
           employee.setPosition(position);
            System.out.println("position changed!");
        }
    }


    private static void getEmployeeBySalary() {
        System.out.println("please input min salary,max salary");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double amount1 = Double.parseDouble(salaryRange[0]);
        double amount2 = Double.parseDouble(salaryRange[1]);
        if(amount2 < amount1) {
            System.out.println("min salary should be less then max salary");
        }
       employeeStorage.findBySalary(amount1, amount2);
    }
    private static void getEmployeById() {
        System.out.println("please input employee id");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.searchByName(id);
        if(employee == null) {
            System.out.println("employee with " + id + " id does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        System.out.println("please input employee's name,surname employeeID,salary,company,position,date of birthday(15/02/1994)");
        String employeeDataStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        String myDateStr = employeeData[6];
        Date parse = sdf.parse(myDateStr);
        Employee employeeById = employeeStorage.searchByName(employeeId);
        Date date = new Date();

        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]),
                    employeeData[4], employeeData[5], parse);
            employeeStorage.add(employee);
           // employee.setRegisterDate(date);
            System.out.println("Employee was added!");
        }else {
            System.out.println("Employee with " + employeeId + " id already exists.");
        }
    }
}