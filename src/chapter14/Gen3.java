package chapter14;

public class Gen3<T> {
    T ob;
    Gen3 (T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
class Gen4<T> extends Gen3<T> {
    Gen4(T o) {
        super(o);
    }
}
class Gen5<T, V> extends Gen3<T> {
   V ob2;
   Gen5(T o, V o2) {
       super(o);
       ob2 = o2;
   }
   V getOb2() {
       return ob2;
   }
}
class HierDemo {
    public static void main(String[] args) {
        Gen5<String, Integer> x = new Gen5<>("Значение равно: ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}

