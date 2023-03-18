package classwork.io;

import java.io.*;

public class DataIOExample {
    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\io\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
        //read();
    }
    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeUTF("hello");
        out.writeBoolean(false);
        out.writeInt(33);
        out.close();
    }
    public static void read() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        dataInputStream.readInt();
        dataInputStream.readBoolean();
        dataInputStream.readUTF();
    }
}
