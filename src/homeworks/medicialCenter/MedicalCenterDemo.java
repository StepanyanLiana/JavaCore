package homeworks.medicialCenter;

import homeworks.medicialCenter.model.Doctor;
import homeworks.medicialCenter.model.Patient;
import homeworks.medicialCenter.storage.PersonStorage;
import homeworks.medicialCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Command {
    static private Scanner scanner = new Scanner(System.in);
    static private PersonStorage personStorage1 = new PersonStorage();

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
                    personStorage1.printTodayPatients();
                    break;
                default:
                    System.out.println("wrong command.");
            }
        }
    }



    private static void printAllPatientsByDoctors() {
        personStorage1.printDoctors();
        System.out.println("please choose doctor id");
        String id = scanner.nextLine();
        Doctor doctorById = personStorage1.getDoctorById(id);
        if (doctorById != null) {
            personStorage1.addPatientByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + id + " already exists");
        }
    }

    private static void addPatient() throws Exception {
        personStorage1.printDoctors();
        System.out.println("please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage1.getDoctorById(id);
        if (doctor != null) {
            try {
                System.out.println("please input id,name,surname,phone number,register date time(dd/MM/yyyy HH:mm)");
                String data = scanner.nextLine();
                String[] dataStr = data.split(",");
                Date registerDateTime = DateUtil.stringToDateTime(dataStr[4]);
                if (personStorage1.isDoctorAvailable(registerDateTime, doctor)) {
                    Patient patient = new Patient();
                    patient.setId(dataStr[0]);
                    patient.setName(dataStr[1]);
                    patient.setSurename(dataStr[2]);
                    patient.setPhoneNumber(dataStr[3]);
                    patient.setRegisterDateTime(registerDateTime);
                    patient.setDoctor(doctor);
                    personStorage1.add(patient);
                    System.out.println("patient registered");
                } else {
                    System.out.println("doctor is unavailable in that date time, please choose another.");
                }
                }catch(ParseException e){

                }
                System.out.println("incorrect registerDateTime.please try again");
            }
        }

    private static void addDoctor() {
        Profession[] professions = Profession.values();
        System.out.println("please choose profession.");
        for (Profession profession : professions) {
            System.out.println(profession);
        }
        System.out.println("please input id,name,surname,phone number,email,profession");
        String dataStr = scanner.nextLine();
            String[] data = dataStr.split(",");
            try {
                String doctorId = data[0];
                Doctor doctorById = personStorage1.getDoctorById(doctorId);
                if (doctorById == null) {
                    Doctor doctor = new Doctor(doctorId, data[1], data[2], data[3], data[4], data[5]);
                    personStorage1.add(doctor);
                    System.out.println("doctor was added!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("wrong profession,please try again");
            }
        }

    private static void changeDoctorData() {
        personStorage1.printDoctors();
        System.out.println("please input id");
        String id = scanner.nextLine();
        Doctor doctorById = personStorage1.getDoctorById(id);
        if (doctorById != null) {
            Profession[] professions = Profession.values();
            System.out.println("please choose profession.");
            for (Profession profession : professions) {
                System.out.println(profession);
            }
            System.out.println("please input name,surname,phone number,email,profession");
            String data = scanner.nextLine();
            try {
            String[] dataStr = data.split(",");
            doctorById.setName(dataStr[0]);
               doctorById.setSurename(dataStr[1]);
               doctorById.setPhoneNumber(dataStr[2]);
               doctorById.setEmail(dataStr[3]);
               doctorById.setProfession(Profession.valueOf(dataStr[4]));
                System.out.println("doctor was updated!");
               } catch (IllegalArgumentException e) {
                   System.out.println("wrong profession");
               }

        }  else {
                System.out.println("doctor with " + id + " already exists.");
            }
        }



    private static void searchDoctorByProfession() {
        System.out.println("please choose profession");
        Profession[] professions = Profession.values();
        for (Profession profession : professions) {
            System.out.println(profession);
        }
        String profession = scanner.nextLine();
        try {
            personStorage1.searchDoctor(Profession.valueOf(profession));
        } catch (IllegalArgumentException e) {
            System.out.println("wrong profession ,please try again!");
        }
    }
    private static void deleteDoctorById() {
        personStorage1.printDoctors();
        System.out.println("please choose doctor id");
        String id = scanner.nextLine();
        Doctor doctorById = personStorage1.getDoctorById(id);
        if (doctorById != null) {
            personStorage1.deleteDoctor(id);
        } else {
            System.out.println("wrong id,please try again!");
        }
    }
}