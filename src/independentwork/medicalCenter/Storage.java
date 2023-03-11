package independentwork.medicalCenter;

import homeworks.medicialCenter.Profession;
import homeworks.medicialCenter.model.Doctor;
import homeworks.medicialCenter.model.Patient;
import homeworks.medicialCenter.model.Person;

public class Storage {
    Person[] persons = new Person[10];

    int size = 0;
    public void add(Person person)  {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    public void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0 , tmp, 0, persons.length);
        persons = tmp;
    }
    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(persons[i]);
            }
        }
    }
    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }
        }
    }
    public void  deleteDoctor(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
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
    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
            Doctor doctor = (Doctor) persons[i];
            if (doctor.getId().equals(id)){
             return doctor;
            }
            }
        }
        return null;
    }
    public void searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getProfession() == profession) {
                    System.out.println(doctor);
                }
            }
        }
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
    public void addPatient(Doctor doctor){
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof  Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }
    public void printTodayPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof  Patient) {
                Patient patient = (Patient) persons[i];

                System.out.println(patient);
            }

        }
    }

}

