package classwork.io;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\io\\example.txt";

    public static void main(String[] args) {
       // write();
        read();
    }

    public static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("hello from Java\n");
            bw.write("hello from Java line 2!!!!!!!!!!!!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = ""; //tpum e tox ar tox
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c); // erb petq e simvol ar simvol karda char enq talis
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
