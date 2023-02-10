package homeworks.homework1.employee;

import java.sql.SQLOutput;

public class EmployeeStorage {
    Employee[] array = new Employee[10];
    int size = 0;

    void add(Employee value) {

        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void extend() {
        Employee[] array1 = new Employee[array.length + 10];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;

    }

    void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(array[i] + " ");
        }
    }


    public Employee searchByName(String employeeID) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().toLowerCase().contains(employeeID.toLowerCase())) {
                System.out.println(employee);
                return employee;
            }
        }
        System.out.println("employee with " + employeeID + "doesn't exists.");
        return null;

        }
        public Employee searchEmployee(String company) {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                if(employee.getCompany().toLowerCase().contains(company.toLowerCase())) {
                    return employee;
                }
            }
            System.out.println("employee with " + company + " does not exists");
            return null;
        }
    }

