package chapter14;

public class Gen1<T> {
    T ob;
    Gen1(T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
class RawDemo {
    public static void main(String[] args) {
        Gen1<Integer> iOb = new Gen1<>(88);
        Gen1<String> strOb = new Gen1<>("Tecт обобщений");
        Gen1 raw = new Gen1(98.6);
        double d = (double) raw.getOb();
        System.out.println("Знaчeниe: " + d);
        raw = iOb;


    }
}
