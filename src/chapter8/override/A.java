package chapter8.override;

public class A {
    int i, j;
    A(int a,int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i & j: " + i + " " + j);
    }
}
 class B extends A{
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}
