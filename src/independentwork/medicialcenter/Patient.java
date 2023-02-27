package independentwork.medicialcenter;

import homeworks.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient {
    String id;
    String name;
    String surname;
    String phoneNumber;
    Doctor doctor;
    Date registerDate;

    public Patient() {
    }

    public Patient(String id, String name, String surname, String phoneNumber, Doctor doctor, Date registerDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.doctor = doctor;
        this.registerDate = registerDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(doctor, patient.doctor) && Objects.equals(registerDate, patient.registerDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phoneNumber, doctor, registerDate);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doctor=" + doctor +
                ", registerDate=" + registerDate +
                '}';
    }
}
