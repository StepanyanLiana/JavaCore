package chapter14;

import java.sql.SQLOutput;

public class Gen7<T> {
    T ob;
    Gen7(T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
class Gen8<T> extends Gen7<T> {
    Gen8(T o) {
        super(o);
    }
}
class HierDemo3{
    public static void main(String[] args) {
        Gen7<Integer> iob = new Gen7<>(88);
        Gen8<Integer> iob2 = new Gen8<>(99);
        Gen8<String> strOb2 = new Gen8<>("Tecт обобщений");
        if (iob2 instanceof Gen8<?>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen8");
        }
        if (iob2 instanceof Gen7<?>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen7");
        }
        if (strOb2 instanceof Gen8<String>) {
            System.out.println("Oбъeкт strOb2 является экземпляром класса Gen8");
        }
        if (strOb2 instanceof Gen7<?>) {
            System.out.println("Oбъeкт strOb2 является экземпляром класса Gen7");
        }
        if (iob instanceof Gen8<?>) {
            System.out.println("Oбъeкт iOb является экземпляром класса Gen8");
        }
        if (iob instanceof Gen7<?>) {
            System.out.println("Oбъeкт iOb является экземпляром класса Gen7");
        }
        if (iob2 instanceof Gen8<Integer>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen8");
        }
    }
}

