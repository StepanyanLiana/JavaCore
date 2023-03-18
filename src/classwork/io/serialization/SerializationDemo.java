package classwork.io.serialization;

import java.io.*;

public class SerializationDemo {
    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\io\\example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Liana", "Stepanyan", 28, "88manelian77@gmail.com");
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
//            objectOutputStream.writeObject(student);
//        } catch (IOException e) {
//            e.printStackTrace();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object object = objectInputStream.readObject();
            if (object instanceof Student) {
                Student student1 = (Student) object;
                System.out.println(student1);
            }
//        }
        }
    }
}
