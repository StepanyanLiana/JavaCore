package homeworks.employee.storage;

import homeworks.employee.model.Company;
import homeworks.employee.model.Employee;

public class EmployeeStorage {
    Employee[] employees = new Employee[10];
    int size = 0;

   public void add(Employee value) {

        if (size == employees.length) {
            extend();
        }
       employees[size++] = value;
    }

    public void extend() {
        Employee[] array1 = new Employee[employees.length + 10];

        // for (int i = 0; i < array.length; i++) {
        //  array1[i] = array[i];
        //  }
        System.arraycopy(employees, 0, array1, 0, size);
        employees = array1;

    }

    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(employees[i] + " ");
        }
    }
    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if(employees[i].isActive() == isActive) {
                System.out.println(employees[i]);
            }
        }
    }


    public Employee getEmployeeById(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().toLowerCase().contains(employeeID.toLowerCase())) {
                return employees[i];
            }
        }
        return null;

    }

    public void searchEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employees[i].getCompany().equals(company)) {
                System.out.println(employee);
            }
        }

    }

    public void findBySalary(double min, double max) {
        for (int i = 0; i < size; i++) {
            double salary = employees[i].getSalary();
            if (salary >= min && salary <= max) {
                System.out.println(employees[i]);
            } //else {
              //  System.out.println("employee with " + min + " to " + max + " salary does not exists");  }

        }
    }
}
