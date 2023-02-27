package classwork;

public class ThrowExample {
    static void myMethod(int a) {
        if (a == 100) {
            throw new MyCoustomException();
    }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);
    }
    }

