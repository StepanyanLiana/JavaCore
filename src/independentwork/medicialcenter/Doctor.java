package independentwork.medicialcenter;

import java.util.Objects;

public class Doctor {
    String ID;
    String name;
    String surname;
    String phoneNumber;
    String profession;
    String email;

    public Doctor() {
    }

    public Doctor(String ID, String name, String surname, String phoneNumber, String profession, String email) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(ID, doctor.ID) && Objects.equals(name, doctor.name) && Objects.equals(surname, doctor.surname) && Objects.equals(phoneNumber, doctor.phoneNumber) && Objects.equals(profession, doctor.profession) && Objects.equals(email, doctor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, surname, phoneNumber, profession, email);
    }
}
