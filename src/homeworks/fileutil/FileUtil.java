package homeworks.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homeworks\\fileutil";

    public static void main(String[] args) throws IOException {
        System.out.println( fileSearch());
       // contentSearch();
        findLines();
        printSizeOfPackage();
        //createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch() {
        System.out.println("please input path name");
        String folder = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        File file1 = new File(FILE_PATH);
        File[] files = file1.listFiles();
        for (File file2 : files) {
            if (file2.exists() && file2.isFile() && file2.getName().equals(keyword))
                return true;
            }
        return false;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input folder name");
        String path = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(FILE_PATH);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.equals(keyword)) {
                System.out.println(keyword);
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("please input txt Path");
        String failPath = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
           String line = "";
           if ((line = bufferedReader.readLine()).contains(keyword)) {
               System.out.println(line);
           }
           }
       }



    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input folder name");
        String folderName = scanner.nextLine();
        File file = new File(FILE_PATH);
        File[] files = file.listFiles();
        double sum = 0;
        for (File file1 : files) {
            sum = file1.length() + sum;
        }
        System.out.println(sum);

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը:
    // Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input path name");
        String path = scanner.nextLine();
        System.out.println("please input file name");
        String fileName = scanner.nextLine();
        System.out.println("please input content");
        String content = scanner.nextLine();
        File file = new File(FILE_PATH);
        if (file.exists() && file.isDirectory() && file.canWrite()) {
            boolean newFile = file.createNewFile();

        }

            }
}