package chapter6.test1;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15;
        int b = 20;
        System.out.println("a и b до вызова: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
