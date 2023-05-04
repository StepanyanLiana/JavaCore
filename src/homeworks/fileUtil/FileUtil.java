package homeworks.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("please input folder path");
        String folderPath = scanner.nextLine();
        System.out.println("please input file path");
        String keyword = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
        fileSearch(folderPath, keyword);
        contentSearch(folderPath, keyword);
         findLines(folderPath, keyword);
        printSizeOfPackage(folderPath);
        createFileWithContent(folderPath, keyword, content);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch(String folder, String fileName) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong folder path");
            return;
        }
        File[] files = folderFile.listFiles();
        boolean isFound = false;
        for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String folderName, String keyword) {
        File file = new File(folderName);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file1);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines(String filePath, String keyword) throws IOException {
        File file = new File(filePath);
        if (!file.exists() || file.getName().endsWith(".txt"))
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = "";
                int lineNumber = 1;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(lineNumber + ". " + line);
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage(String folderPath) {
        File file = new File(folderPath);
        if (!file.isDirectory()) {
            System.out.println("wrong folder path");
            return;
        }
        File[] files = file.listFiles();
        long sum = 0;
        for (File file1 : files) {
            if (file1.isFile())
                sum = file1.length() + sum;
        }
        System.out.println("sum: " + sum / 1024 + "KB");

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը:
    // Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(String filePath, String fileName, String content) throws IOException {
        File file = new File(filePath);
        if (file.exists() && file.isDirectory() && file.canWrite()) {
            return;
        }
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
                    fileWriter.write(content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}