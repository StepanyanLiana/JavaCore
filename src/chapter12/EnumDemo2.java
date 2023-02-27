package chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");
        Apple allapples[] = Apple.values();
        for (Apple allapple : allapples) {
            System.out.println(allapple);
        }
            System.out.println();
            ap = Apple.valueOf("Winesap");
            System.out.println("Пepeмeннaя ар содержит " + ap);
        }
    }


