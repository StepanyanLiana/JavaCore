package independentwork.medicialcenter;

import homeworks.medicialCenter.model.Patient;

public class PatientStorage {
    Patient[] patients = new Patient[10];
    int size = 0;
    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] patients1 = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, patients1, 0, patients.length);
        patients = patients1;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i] + " ");

        }
    }
    public Patient getPatientById(String id) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getId().equals(id)) {
                return patients[i];
            }
        }
            return null;
        }

    }
