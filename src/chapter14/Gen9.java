package chapter14;

public class Gen9<T> {
    T ob;
    Gen9(T o) {
        ob = o;
    }
    T getOb() {
        System.out.println("Meтoд getob() из класса Gen9: ");
        return ob;
    }
}
class Gen10<T> extends Gen9<T> {
    Gen10(T o) {
        super(o);
    }
    T getOb() {
        System.out.println("Meтoд getob() из класса Gen10");
        return ob;
    }
}
class OverrideDemo {
    public static void main(String[] args) {
        Gen9<Integer> iOb = new Gen9<>(88);
        Gen10<Integer> iOb2 = new Gen10<>(99);
        Gen10<String> strOb2 = new Gen10<>("(Тест обобщений");
        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());


    }
}
