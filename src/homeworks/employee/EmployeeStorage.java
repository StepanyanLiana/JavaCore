package homeworks.employee;

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

        // for (int i = 0; i < array.length; i++) {
        //  array1[i] = array[i];
        //  }
        System.arraycopy(array, 0, array1, 0, size);
        array = array1;

    }

    void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(array[i] + " ");
        }
    }
    public void prinByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if(array[i].isActive() == isActive) {
                System.out.println(array[i]);
            }
        }
    }


    public Employee searchByName(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().toLowerCase().contains(employeeID.toLowerCase())) {
                return array[i];
            }
        }
        return null;

    }

    public void searchEmployee(String company) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (array[i].getCompany().toLowerCase().contains(company.toLowerCase())) {
                System.out.println(employee);
            }
        }

    }

    public void findBySalary(double min, double max) {
        for (int i = 0; i < size; i++) {
            double salary = array[i].getSalary();
            if (salary >= min && salary <= max) {
                System.out.println(array[i]);
            } //else {
              //  System.out.println("employee with " + min + " to " + max + " salary does not exists");  }

        }
    }
}
