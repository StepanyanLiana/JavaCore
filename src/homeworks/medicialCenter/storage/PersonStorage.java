package homeworks.medicialCenter.storage;

import homeworks.medicialCenter.Profession;
import homeworks.medicialCenter.model.Doctor;
import homeworks.medicialCenter.model.Patient;
import homeworks.medicialCenter.model.Person;
import homeworks.medicialCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    Person[] persons = new Person[10];
    int size = 0;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    public void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor)
                System.out.println(person);
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getId().equals(id)) ;
                return doctor;
            }
        }
        return null;
    }

    public void searchDoctor(Profession profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctor(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                deletePerson(i);
            }
        }
    }

    private void deletePerson(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }

    public void changeDoctorData(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getId().equals(id)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void addPatientByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodayPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) ;
                System.out.println(patient);
            }
        }

    }

    public boolean isDoctorAvailable(Date registerDateTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor)
                && patient.getDoctor().equals(doctor)){
                    return false;
                }
            }
        }
        return true;
    }
}
