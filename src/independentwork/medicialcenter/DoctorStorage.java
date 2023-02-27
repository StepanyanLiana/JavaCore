package independentwork.medicialcenter;

public class DoctorStorage {
    Doctor[] doctors = new Doctor[10];
    int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void extend() {
        Doctor[] d = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, d, 0, doctors.length);
        doctors = d;

    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i] + " ");
        }
    }
    public void deleteDoctor(String id) {
        for (int i = 0; i < size; i++) {
            doctors[i] = doctors[i + 1];
        }
        size--;
    }
    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getID().equals(id))
                return doctors[i];
        }
        return null;
    }
    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(profession)) {
                System.out.println(doctors[i]);
            }
        }

    }
}
