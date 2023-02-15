package chapter9.mypack.interface2;

public class A {
    public interface NestadIF {
        boolean isNotNegative(int x);
    }
}
class B implements A.NestadIF {
    public boolean isNotNegative(int x) {
            return x < 0 ? false : true;
        }

    }
    class NestedIFDemo {
        public static void main(String[] args) {
            A.NestadIF nif = new B();
            if (nif.isNotNegative(10)) {
                System.out.println("Чиcлo 10 неотрицательное");
                if (nif.isNotNegative(-12)) {
                    System.out.println("Этo не будет выведено");
                }
            }
        }

}
