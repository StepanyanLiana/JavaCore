package classwork.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\io";
        String directoryPath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\io\\aa";  //pathn e,vo@
        File file = new File(path);
        File directory = new File(directoryPath);
        System.out.println(file.isDirectory()); //cuyc talis e papka e te che
        System.out.println(file.isFile()); // cuyc e talis file e te che
        System.out.println(file.length()); // cuyc talis fayli byteeri chap@
        long freeSpace = file.getFreeSpace(); // cuyc e talis winchestrum inchqan tex ka
        long lastModified = file.lastModified(); //cuyc e talis fayli het verjin arvac popoxutyun@,vor@ Datein talov jamn e cuyc talis
        Date date = new Date(lastModified);
        System.out.println(date);
        System.out.println(File.separator); // cuyc e talis tvyal operacion hamakarg@ te vorne` @st dra slesh@
        System.out.println(freeSpace);
        if (!directory.exists()) { //cuyc e talis ka te che tvyal fayl@
            directory.mkdir(); // erb uzum enq papka sarqel
        }
        String[] list = directory.list(); // papkaneri list e stexcum
        for (String s : list) {
            System.out.println(s);
        }
//        if (file.exists()) {
//            System.out.println("file exists");
//        } else {
//            System.out.println("file not created");
//        }
//        if (directory.canWrite()) {
//            boolean newFile = file.createNewFile();
//            if (newFile) {
//                System.out.println("file created");
//            } else {
//                System.out.println("file not created");
//            }
    }
}