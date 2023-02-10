package chapter8.abstractt;

public abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("Этo конкретный метод.");
    }
}
  class B extends A {
    void callme() {
        System.out.println("Реализация метода callme() в классе B.");
    }
        }
        class AbstractDemo {
            public static void main(String[] args) {
                A a = new B();
                B b = new B();
                a.callme();
                b.callme();
                b.callmetoo();
            }
        }

