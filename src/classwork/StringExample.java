package classwork;

public class StringExample {
    public static void main(String[] args) {

        String fullName = "  Liana Stepanyan  ";
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.trim());
        System.out.println(fullName.substring(4));
        System.out.println(fullName.substring(0,5));
        System.out.println(fullName.startsWith("  "));
        System.out.println(fullName.startsWith(" L"));
        System.out.println(fullName.endsWith("yan  "));
        System.out.println(fullName.contains("epa"));
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(5));
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
        System.out.println();
        String[] names = fullName.split(" ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
