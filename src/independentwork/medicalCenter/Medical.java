package independentwork.medicalCenter;

import homeworks.medicialCenter.Command;
import homeworks.medicialCenter.Profession;
import homeworks.medicialCenter.model.Doctor;
import homeworks.medicialCenter.model.Patient;
import homeworks.medicialCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Medical implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static Storage storage = new Storage();

    public static void main(String[] args) throws Exception {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctors();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    storage.printTodayPatients();
                    break;
                default:
                    System.out.println("wrong command.");
            }
        }
    }

    private static void printAllPatientsByDoctors() {
        storage.printDoctors();
        String doctorId = scanner.nextLine();
        Doctor doctorById = storage.getDoctorById(doctorId);
        if (doctorById != null) {
            storage.addPatient(doctorById);
        }
    }

    private static void addPatient() throws Exception {
        storage.printDoctors();
        System.out.println("please choose id");
        String id = scanner.nextLine();
        Doctor doctorById = storage.getDoctorById(id);
        if (doctorById != null) {
            System.out.println("please input id,name,surname,phone,doctor,register time(dd/MM/yyyy HH:MM)");
            String data = scanner.nextLine();
            String[] dataStr = data.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(dataStr[5]);
                Patient patient = new Patient();
                patient.setId(dataStr[0]);
                patient.setName(dataStr[1]);
                patient.setSurename(dataStr[2]);
                patient.setPhoneNumber(dataStr[3]);
                patient.setDoctor(doctorById);
                patient.setRegisterDateTime(registerDateTime);
                storage.add(patient);
                System.out.println("patient added");
            } catch (ParseException e) {
                System.out.println("wrong date time");
            }

        }
    }

    private static void changeDoctorData() {
        Profession[] profession = Profession.values();
        System.out.println("please choose profession");
        for (Profession profession1 : profession) {
            System.out.println(profession1);
        }
        storage.printDoctors();
        System.out.println("please choose doctor");
        String id = scanner.nextLine();
        Doctor doctorById = storage.getDoctorById(id);
        if (doctorById != null) {
            System.out.println("please input name,surname,phone,email,profession");
            String data = scanner.nextLine();
            try {
                String[] dataDoctor = data.split(",");
                Doctor doctor = new Doctor();
                doctor.setName(dataDoctor[0]);
                doctor.setSurename(dataDoctor[1]);
                doctor.setPhoneNumber(dataDoctor[2]);
                doctor.setEmail(dataDoctor[3]);
                doctor.setProfession(Profession.valueOf(dataDoctor[4]));
            } catch (IllegalArgumentException e) {
                System.out.println("wrong profession");
            }
        } else {
            System.out.println("wrong id");
        }
    }

    private static void deleteDoctorById() {
        System.out.println("please choose id");
        storage.printDoctors();
        String id = scanner.nextLine();
        Doctor doctorById = storage.getDoctorById(id);
        if (doctorById != null) {
            storage.deleteDoctor(id);
            System.out.println("doctor deleted");
        } else {
            System.out.println("wrong id");
        }
    }

    private static void searchDoctorByProfession() {
        Profession[] professions = Profession.values();
        System.out.println("please choose profession");
        for (Profession profession : professions) {
            System.out.println(profession);
        }
        String profession = scanner.nextLine();
        try {
            storage.searchDoctorByProfession(Profession.valueOf(profession));
        } catch (IllegalArgumentException e) {
            System.out.println("wrong profession");
        }

    }

    private static void addDoctor() {
        Profession[] professions = Profession.values();
        System.out.println("please choose profession");
        for (Profession profession : professions) {
            System.out.println(profession);
        }
        System.out.println("please input id,name,surname,phoneNumber,Email,profession");
        String data = scanner.nextLine();
        try {
            String[] dataStr = data.split(",");
            String id = dataStr[0];
            Doctor doctorById = storage.getDoctorById(id);
            if (doctorById == null) {
                Doctor doctor = new Doctor(id, dataStr[1], dataStr[2], dataStr[3], dataStr[4], dataStr[5]);
                storage.add(doctor);
                System.out.println("doctor added.");
            } else {
                System.out.println("wrong id,please try again");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("wrong profession,please try again");
        }
    }
}

