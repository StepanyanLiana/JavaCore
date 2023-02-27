package homeworks.employee;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;
import homeworks.employee.storage.CompanyStorage;
import homeworks.employee.storage.EmployeeStorage;
import homeworks.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("compani001", "company example", "Gyumri", "123456789");
        companyStorage.add(company);
        //Employee employee = new Employee(""Liana", "Stepanyan", "a001", 500000, "company1", "meneger");
        //employeeStorage(add);
        //employeeStorage.add(new Employee("Liana", "Stepanyan", "a001", 500000, "company1", "meneger"));
        // employeeStorage.add(new Employee("Ani", "Adyan", "a00002", 400000, "company2", "jr meneger"));
        //employeeStorage.add(new Employee("Lia", "Lalayan", "a001", 100000, "company3", "meneger"));

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {

                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    companyStorage.print();
                    System.out.println("please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if(companyById != null) {
                        employeeStorage.searchEmployeeByCompany(companyById);
                    }
                    System.out.println("company does not exists");
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    getEmployeeBySalary();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changePositionByEmployeeId();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVE_EMPLOYEE_BY_ID:
                    inactiveEmployee();

                    break;
                case ACTIVE_EMPLOYEE_BY_ID:
                    activateEployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    break;
                default:
                    System.out.println("Wrong command,please try again.");
            }
        }
    }

    private static void addCompany() {
        System.out.println("please input id,name,address,phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companiId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companiId);
        if (companyById == null) {
            Company company = new Company(companiId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("company was added");
        } else {
            System.out.println("company with " + "id already exists");
        }
    }

    private static void activateEployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee ID or employee is inactive, please try again!");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void inactiveEmployee() {
        System.out.println("please choose employee id");
        employeeStorage.printByStatus(true);
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("wrong employee ID or employee is inactive, please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }

    }

    private static void changePositionByEmployeeId() {
        System.out.println("please choose employee id");
        String employeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeId);
        if (employee == null) {
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
        try {
            double amount1 = Double.parseDouble(salaryRange[0]);
            double amount2 = Double.parseDouble(salaryRange[1]);
            if (amount2 < amount1) {
                System.out.println("min salary should be less then max salary");
            }
            employeeStorage.findBySalary(amount1, amount2);
        } catch (NumberFormatException e) {
            System.out.println("incorrect number values,please try again");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please input min and max salary");
        }
    }
    private static void getEmployeById() {
        System.out.println("please input employee id");
        String id = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(id);
        if (employee == null) {
            System.out.println("employee with " + id + " id does not exists");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {

            System.out.println("please input employee's name,surname employeeID,salary,position,date of birthday(15/02/1994)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Employee employeeById = employeeStorage.getEmployeeById(employeeId);
            if (employeeById == null) {
                Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]),
                        companyById, employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                employeeStorage.add(employee);
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                System.out.println("Employee was added!");
            } else {
                System.out.println("Employee with " + employeeId + " id already exists.");
            }
        } else {
                System.out.println("wrong company id! please try again!");
        }
    }
}