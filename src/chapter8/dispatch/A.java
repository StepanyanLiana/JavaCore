package chapter8.dispatch;

public class A {
    void callme() {
        System.out.println("B методе callme() из класса A");
     }
}
class B extends A {
    void callme() {
        System.out.println("B методе callme() из класса B");
    }
}
class C extends A {
    void callme() {
        System.out.println("B методе callme() из класса C");
    }
}
