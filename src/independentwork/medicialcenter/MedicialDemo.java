package independentwork.medicialcenter;

import homeworks.medicialCenter.Command;

import java.util.Scanner;

public class MedicialDemo implements Command {
    static Scanner scanner = new Scanner(System.in);
    static DoctorStorage doctorStorage = new DoctorStorage();
    static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        Command.printCommands();
        String command = scanner.nextLine();
        switch (command) {
            case EXIT:
                isRun = false;
                break;
            case ADD_DOCTOR:
                addDoctor();
                case SEARCH_DOCTOR_BY_PROFESSION:
                searchDoctorByProfession();
                break;
            case DELETE_DOCTOR_BY_ID:
                deleteDoctorById();
                break;
            case CHANGE_DOCTOR_DATA_BY_ID:

                break;
            case ADD_PATIENT:

                break;
            case PRINT_ALL_PATIENTS_BY_DOCTOR:
                break;
            case PRINT_TODAYS_PATIENTS:
                break;
        }
    }

    private static void deleteDoctorById() {
        System.out.println("please choose doctorId");
        String id = scanner.nextLine();
        Doctor doctorId = doctorStorage.getDoctorById(id);
        if (doctorId == null) {
            System.out.println("wrong doctorId, please try again!");
        }
        doctorStorage.deleteDoctor(id);
        System.out.println("doctor deleted.");
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input profession");
        String profession = scanner.nextLine();
        doctorStorage.searchDoctorByProfession(profession);
        System.out.println("search result found");
    }

    private static void addDoctor() {
        System.out.println("please input doctor's id,name,surname,phone number,email,proffesion");
        String dataStr = scanner.nextLine();
        String[] str = dataStr.split(",");
        Doctor doctorById = doctorStorage.getDoctorById(str[0]);
        if (doctorById == null) {
            Doctor doctor = new Doctor(str[0], str[1], str[2],str[3], str[4], str[5]);
            doctorStorage.add(doctor);
            System.out.println("doctor was added");
        }


    }
}
