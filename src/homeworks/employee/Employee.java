package homeworks.employee;

import java.util.Date;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    private String position;
    private boolean active = true;
    private Date dateOfBirthday;
    private Date registerDate = new Date();


    public Employee() {
    }


    public Employee(String name, String surname, String employeeID, double salary, String company, String position, boolean active, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.active = active;
        this.dateOfBirthday = dateOfBirthday;
        this.registerDate = registerDate;
    }

    public Employee(String name, String surname, String employeeID, double salary, String company,
                    String position, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.dateOfBirthday = dateOfBirthday;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public boolean isActive() {
        return true;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", dateOfBirthday=" + dateOfBirthday +
                ", registerDate=" + registerDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active &&
                Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) &&
                Objects.equals(employeeID, employee.employeeID) && Objects.equals(company, employee.company) &&
                Objects.equals(position, employee.position) && Objects.equals(dateOfBirthday, employee.dateOfBirthday) &&
                Objects.equals(registerDate, employee.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, company, position, active, dateOfBirthday, registerDate);
    }
}


